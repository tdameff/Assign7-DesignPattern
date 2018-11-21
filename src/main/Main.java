package main;

//Imports
import singletonPattern.Apiary;
import builderPattern.Beehive;
import builderPattern.BeehiveRooms;

public class Main {

    public static void main(String[] args) {
       
        //Here we create our singleton Apiary instance
        Apiary apiary = Apiary.getInstance();
        
        
        //TESTING BUILDER PATTERN
        System.out.println("[BUILDER PATTERN]");
        
        //Create an object of BeehiveRooms that we will build and add to our beehive object
        BeehiveRooms rooms = apiary.createBeehiveRooms().spawnRooms(2).commonRooms(3).bedRooms(5).build();      // 2 spawn rooms, 3 common rooms, 5 bed rooms
        BeehiveRooms rooms2 = apiary.createBeehiveRooms().spawnRooms(10).commonRooms(15).bedRooms(23).build();  // 10 spawn rooms, 15 common rooms, 23 bed rooms
        
        //Create an object of Beehive and add the room object we build earlier to it
        Beehive beehive = apiary.createBeehive().id(1).name("BEEEHive").rooms(rooms).build();
        Beehive beehive2 = apiary.createBeehive().id(2).name("Honey Hive").rooms(rooms2).build();
             
        //Print out our Beehives
        System.out.println("\nBeehive #" + beehive.getId() + "\nBeehive Name: " + beehive.getName() 
                            + "\nBeehive Spawn Rooms: " + beehive.getRooms().getSpawnRooms() 
                            + "\nBeehive Common Rooms: " + beehive.getRooms().getCommonRooms() 
                            + "\nBeehive Bed Rooms " + beehive.getRooms().getBedRooms());
        
        System.out.println("\nBeehive #" + beehive2.getId() + "\nBeehive Name: " + beehive2.getName() 
                            + "\nBeehive Spawn Rooms: " + beehive2.getRooms().getSpawnRooms() 
                            + "\nBeehive Common Rooms: " + beehive2.getRooms().getCommonRooms() 
                            + "\nBeehive Bed Rooms " + beehive2.getRooms().getBedRooms());
    }
}
