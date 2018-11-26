package singletonpattern;

import builderpattern.Beehive;
import builderpattern.Beehive.BeehiveBuilder;
import builderpattern.BeehiveRooms.RoomBuilder;
import java.util.HashMap;
import java.util.Map;

/**
 * Apiary class handles the creating of the Beehives.
 * 
 * @author Taylor Dameff 
 *      SER 316 - Assignment 7 
 *      November 20, 2018
 */

public class Apiary {

  /**
   * Apiary instance initialized to null.
   */
  private static Apiary apiaryInstance = null;

  /**
   * HashMap array to hold the beehives after they are created.
   */
  private Map<Integer, Beehive> beehiveList = new HashMap<Integer, Beehive>();

  /**
   * Private constructor for when an instance of Apiary needs to be created.
   */
  private Apiary() {

  }

  /**
   * Design Pattern: Singleton. Static method to create an instance of Apiary
   * 
   * @return An instance of Apiary
   */
  public static Apiary getInstance() {

    // First we check to see if an instance already exists
    if (apiaryInstance == null) {
      // If an instance does not exist, then we create a new instance
      apiaryInstance = new Apiary();
    }

    // Return the instance
    return apiaryInstance;
  }
  
  /**
   * Add the beehive to the beehive list.
   * @param beehive of type Beehive
   */
  public void addBeehive(Beehive beehive) {
    this.beehiveList.put(beehive.getId(), beehive);
  }

  /**
   * Get method for the BeehiveList.
   * 
   * @return beehiveList
   */
  public Map<Integer, Beehive> getBeehives() {
    // Return the beehiveList
    return this.beehiveList;
  }

  /**
   * Calls the Beehive Builder.
   * 
   * @return BeehiveBuilder object
   */
  public BeehiveBuilder createBeehive() {
    return new BeehiveBuilder();
  }

  /**
   * Calls the Beehive Room Builder.
   * 
   * @return RoomBuilder object
   */
  public RoomBuilder createBeehiveRooms() {
    return new RoomBuilder();
  }
}
