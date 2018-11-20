package singletonPattern;

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
     * Private constructor for when an instance of Apiary needs to be created
     */
    private Apiary() {
        
    }
    
    /**
     * Design Pattern: Singleton
     * 
     * Static method to create an instance of Apiary
     * 
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
}
