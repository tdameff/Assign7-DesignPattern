package builderPattern;

public class Beehive {

    //Variables
    private int id;
    private String name;
    private BeehiveRooms rooms;
    
    private Beehive(BeehiveBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.rooms = builder.rooms;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rooms
     */
    public BeehiveRooms getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(BeehiveRooms rooms) {
        this.rooms = rooms;
    }

    
    
    /**
     * Static Builder class for Beehives
     */
    public static class BeehiveBuilder {
        
        //Variables
        private int id;
        private String name;
        private BeehiveRooms rooms;        
        
        /**
         * Sets the id for the beehive
         * @param id
         * @return builder object
         */
        public BeehiveBuilder id(int id) {
            this.id = id;
            return this;
        }
        
        /**
         * sets the name for the beehive
         * @param name
         * @return builder object
         */
        public BeehiveBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * sets the rooms for the beehive
         * @param rooms
         * @return builder object
         */
        public BeehiveBuilder rooms(BeehiveRooms rooms) {
            this.rooms = rooms;
            return this;
        }
        
        /**
         * Builds the beehive object
         * @return beehive oject
         */
        public Beehive build() {
            return new Beehive(this);
        }
    }
}
