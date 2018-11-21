package singletonPattern;

//Imports
import java.util.HashMap;
import java.util.Map;
import builderPattern.Beehive;
import builderPattern.Beehive.BeehiveBuilder;
import builderPattern.BeehiveRooms.RoomBuilder;

/**
 * @author Taylor Dameff
 * SER 334 - Assignment 7
 * November 20, 2018
 */

/**
 * Requirements:
 * An apiary can have many beehives in them. For this assignment, only ever allow one apiary to exist.
 * An apiary should be capable of spawning an unlimited number of beehives.
 */

public class Apiary {

    /**
     * Apiary instance initialized to null
     */
    private static Apiary apiaryInstance = null;
    
    /**
     * HashMap array to hold the beehives after they are created
     */
    private Map<Integer, Beehive> beehiveList = new HashMap<Integer, Beehive>();
    
    /**
     * Private constructor for when an instance of Apiary needs to be created
     */
    private Apiary() {
        
    }
    
    /**
     * Design Pattern: Singleton
     * 
     * Static method to create an instance of Apiary
     * @return An instance of Apiary
     */
    public static Apiary getInstance() {
        
        //First we check to see if an instance already exists
        if(apiaryInstance == null) {
            //If an instance does not exist, then we create a new instance
            apiaryInstance = new Apiary();
        }
        
        //Return the instance
        return apiaryInstance;
    }
    
    /**
     * This method returns the beehiveList
     * @return beehiveList
     */
    public Map<Integer, Beehive> getBeehives() {
        //Return the beehiveList
        return this.beehiveList;
    }
    
    /**
     * Calls the Beehive Builder
     * @return BeehiveBuilder object
     */
    public BeehiveBuilder createBeehive() {
        return new BeehiveBuilder();
    }
    
    /**
     * Calls the Beehive Room Builder
     * @return RoomBuilder object
     */
    public RoomBuilder createBeehiveRooms() {
        return new RoomBuilder();
    }
}
