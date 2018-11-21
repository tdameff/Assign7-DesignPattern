package builderpattern;

/**
 * Beehive Builder class handles the building of the Beehive.
 * 
 * @author Taylor Dameff SER 316 - Assignment 7 November 20, 2018
 */

public class Beehive {

  // Variables
  private int id;
  private String name;
  private BeehiveRooms rooms;

  private Beehive(BeehiveBuilder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.rooms = builder.rooms;
  }

  /**
   * get id method.
   * 
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * set id method.
   * 
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * get name method.
   * 
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * set name method.
   * 
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * get rooms method.
   * 
   * @return the rooms
   */
  public BeehiveRooms getRooms() {
    return rooms;
  }

  /**
   * set rooms method.
   * 
   * @param rooms the rooms to set
   */
  public void setRooms(BeehiveRooms rooms) {
    this.rooms = rooms;
  }

  /**
   * Static Builder class for Beehives.
   */
  public static class BeehiveBuilder {

    // Variables
    private int id;
    private String name;
    private BeehiveRooms rooms;

    /**
     * Sets the id for the beehive.
     * 
     * @param id of type int
     * @return builder object
     */
    public BeehiveBuilder id(int id) {
      this.id = id;
      return this;
    }

    /**
     * sets the name for the beehive.
     * 
     * @param name of type string
     * @return builder object
     */
    public BeehiveBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * sets the rooms for the beehive.
     * 
     * @param rooms of type BeehiveRooms
     * @return builder object
     */
    public BeehiveBuilder rooms(BeehiveRooms rooms) {
      this.rooms = rooms;
      return this;
    }

    /**
     * Builds the beehive object.
     * 
     * @return beehive oject
     */
    public Beehive build() {
      return new Beehive(this);
    }
  }
}
