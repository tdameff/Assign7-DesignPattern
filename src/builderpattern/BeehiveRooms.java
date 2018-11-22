package builderpattern;

/**
 * BeehiveRooms builder class handles the rooms for the Beehive.
 * 
 * @author Taylor Dameff 
 *      SER 316 - Assignment 7 
 *      November 20, 2018
 */

public class BeehiveRooms {

  // Variables
  private int spawnRooms;
  private int commonRooms;
  private int bedRooms;

  private BeehiveRooms(RoomBuilder builder) {

      this.spawnRooms = builder.spawnRooms;
      this.commonRooms = builder.commonRooms;
      this.bedRooms = builder.bedRooms;
  }

  /**
   * get method for spawnRooms.
   * 
   * @return the spawnRooms
   */
  public int getSpawnRooms() {
    return spawnRooms;
  }

  /**
   * set method for spawnRooms.
   * 
   * @param spawnRooms the spawnRooms to set
   */
  public void setSpawnRooms(int spawnRooms) {
    this.spawnRooms = spawnRooms;
  }

  /**
   * get method for commonRooms.
   * 
   * @return the commonRooms
   */
  public int getCommonRooms() {
    return commonRooms;
  }

  /**
   * set method for commonRooms.
   * 
   * @param commonRooms the commonRooms to set
   */
  public void setCommonRooms(int commonRooms) {
    this.commonRooms = commonRooms;
  }

  /**
   * get method for bedRooms.
   * 
   * @return the bedRooms
   */
  public int getBedRooms() {
    return bedRooms;
  }

  /**
   * set method for BedRooms.
   * 
   * @param bedRooms the bedRooms to set
   */
  public void setBedRooms(int bedRooms) {
    this.bedRooms = bedRooms;
  }

  /**
   * Static Builder class for Beehives.
   */
  public static class RoomBuilder {

    // Variables
    private int spawnRooms;
    private int commonRooms;
    private int bedRooms;

    /**
     * sets the number of spawn rooms.
     * 
     * @param spawnRooms of type int
     * @return builder object
     */
    public RoomBuilder spawnRooms(int spawnRooms) {
      this.spawnRooms = spawnRooms;
      return this;
    }

    /**
     * sets the number of common rooms.
     * 
     * @param commonRooms of type int
     * @return builder object
     */
    public RoomBuilder commonRooms(int commonRooms) {
      this.commonRooms = commonRooms;
      return this;
    }

    /**
     * sets the number of bed rooms.
     * 
     * @param bedRooms of type int
     * @return builder object
     */
    public RoomBuilder bedRooms(int bedRooms) {
      this.bedRooms = bedRooms;
      return this;
    }

    /**
     * Builds the beehiveRooms object.
     * 
     * @return BeehiveRooms object
     */
    public BeehiveRooms build() {
      return new BeehiveRooms(this);
    }
  }
}
