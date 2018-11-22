package client;

import java.util.Map;

import builderpattern.Beehive;
import builderpattern.BeehiveRooms;
import builderpattern.Species;
import decoratorpattern.BaseBee;
import decoratorpattern.Bee;
import decoratorpattern.BumbleBee;
import singletonpattern.Apiary;

/**
 * Main class for the testing of the Patterns.
 * 
 * @author Taylor Dameff 
 *      SER 316 - Assignment 7 
 *      November 20, 2018
 */

public class Main {

  /**
   * Main method.
   * 
   * @param args of type String[]
   */
  public static void main(String[] args) {

    // SINGLETON PATTERN
    System.out.println("[SINGLETON PATTERN]\nCreating instance of Apiary...\n");
    Apiary apiary = Apiary.getInstance();

    
    // BUILDER PATTERN
    System.out.println("[BUILDER PATTERN]");

    // Create an object of BeehiveRooms that we will build and add to our beehive object
    System.out.println("Creating rooms for our Beehives...");
    BeehiveRooms rooms = apiary.createBeehiveRooms()
        .spawnRooms(2).commonRooms(3).bedRooms(5).build();
    BeehiveRooms rooms2 = apiary.createBeehiveRooms()
        .spawnRooms(10).commonRooms(15).bedRooms(23).build();
    BeehiveRooms rooms3 = apiary.createBeehiveRooms()
        .spawnRooms(36).commonRooms(9).bedRooms(14).build();
    
    //Create species obj to use
    System.out.println("Creating species for our Beehives...");
    Species bumblebee = new Species(1);     // Bumble Bee
    Species honeybee = new Species(2);      // Honey Bee
    Species carpenterbee = new Species(3);  // Carpenter Bee
    Species andrenabee = new Species(4);    // Andrena Bee
    Species apidaebee = new Species(5);     // Apidae Bee

    // Create an object of Beehive and add the room object we build earlier to it
    System.out.println("Creating beehives and building on the rooms...");
    Beehive beehive = apiary.createBeehive().id(1).name("BEEEHive").species(bumblebee).rooms(rooms).build();
    Beehive beehive2 = apiary.createBeehive().id(2).name("Honey Hive").species(apidaebee).rooms(rooms2).build();
    Beehive beehive3 = apiary.createBeehive().id(3).name("Cool Hive").species(carpenterbee).rooms(rooms3).build();
    
    // Add the newly created beehives to our beehive list in apiary class.
    apiary.addBeehive(beehive);
    apiary.addBeehive(beehive2);
    apiary.addBeehive(beehive3);
    
    // Get the list so we can easily get information from it
    Map<Integer, Beehive> beehiveList = apiary.getBeehives();

    // Print out our Beehives
    System.out.println("Displaying Beehives...");
    for(int i = 0; i < apiary.getBeehives().size(); i++) {
      System.out.println("\nBeehive #" + beehiveList.get(i+1).getId()
        + "\nBeehive Name: " + beehiveList.get(i+1).getName()
        + "\nBeehive Species: " + beehiveList.get(i+1).getSpecies().getBeeSpecies()
        + "\nBeehive Spawn Rooms: " + beehiveList.get(i+1).getRooms().getSpawnRooms() 
        + "\nBeehive Common Rooms: " + beehiveList.get(i+1).getRooms().getCommonRooms() 
        + "\nBeehive Bed Rooms " + beehiveList.get(i+1).getRooms().getBedRooms());
    }
    

    // DECORATOR PATTERN
    System.out.println("\n[DECORATOR PATTERN]");

  }
}

















