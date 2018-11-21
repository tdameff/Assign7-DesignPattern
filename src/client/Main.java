package main;

import builderpattern.Beehive;
import builderpattern.BeehiveRooms;
import singletonpattern.Apiary;

/**
 * Main class for the testing of the Patterns.
 * 
 * @author Taylor Dameff SER 316 - Assignment 7 November 20, 2018
 */

public class Main {

  /**
   * Main method.
   * 
   * @param args of type String[]
   */
  public static void main(String[] args) {

    // SINGLETON PATTERN
    Apiary apiary = Apiary.getInstance();

    // BUILDER PATTERN
    System.out.println("[BUILDER PATTERN]");

    // Create an object of BeehiveRooms that we will build and add to our beehive
    // object
    BeehiveRooms rooms = apiary.createBeehiveRooms()
        .spawnRooms(2).commonRooms(3).bedRooms(5).build();
    BeehiveRooms rooms2 = apiary.createBeehiveRooms()
        .spawnRooms(10).commonRooms(15).bedRooms(23).build();
    BeehiveRooms rooms3 = apiary.createBeehiveRooms()
        .spawnRooms(36).commonRooms(9).bedRooms(14).build();

    // Create an object of Beehive and add the room object we build earlier to it
    Beehive beehive = apiary.createBeehive().id(1).name("BEEEHive").rooms(rooms).build();
    Beehive beehive2 = apiary.createBeehive().id(2).name("Honey Hive").rooms(rooms2).build();
    Beehive beehive3 = apiary.createBeehive().id(3).name("Cool Hive").rooms(rooms3).build();

    // Print out our Beehives
    System.out.println("\nBeehive #" + beehive.getId() 
        + "\nBeehive Name: " + beehive.getName()
        + "\nBeehive Spawn Rooms: " + beehive.getRooms().getSpawnRooms() 
        + "\nBeehive Common Rooms: " + beehive.getRooms().getCommonRooms() 
        + "\nBeehive Bed Rooms " + beehive.getRooms().getBedRooms());

    System.out.println("\nBeehive #" + beehive2.getId() + "\nBeehive Name: " 
        + beehive2.getName()
        + "\nBeehive Spawn Rooms: " + beehive2.getRooms().getSpawnRooms() 
        + "\nBeehive Common Rooms: " + beehive2.getRooms().getCommonRooms() 
        + "\nBeehive Bed Rooms " + beehive2.getRooms().getBedRooms());

    System.out.println("\nBeehive #" + beehive3.getId() 
        + "\nBeehive Name: " + beehive3.getName()
        + "\nBeehive Spawn Rooms: " + beehive3.getRooms().getSpawnRooms() 
        + "\nBeehive Common Rooms: " + beehive3.getRooms().getCommonRooms() 
        + "\nBeehive Bed Rooms " + beehive3.getRooms().getBedRooms());

    // DECORATOR PATTERN
  }
}
