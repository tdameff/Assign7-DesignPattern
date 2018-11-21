package builderPattern;

public class BeehiveRooms {
    
    //Variables
    private int spawnRooms;
    private int commonRooms;
    private int bedRooms;
    
    private BeehiveRooms(RoomBuilder builder) {
        
        //If the number of spawn rooms is less than zero,
        //set the number of rooms to 1
        if(builder.spawnRooms < 1) {
            this.spawnRooms = 1;
        }
        //Otherwise, use the number that was passed
        else {
            this.spawnRooms = builder.spawnRooms;
        }
        
        //If the number of common rooms is less than zero,
        //set the number of rooms to 1
        if(builder.commonRooms < 1) {
            this.commonRooms = 1;
        }
        //Otherwise, use the number that was passed
        else {
            this.commonRooms = builder.commonRooms;
        }
        
        //If the number of bed rooms is less than zero,
        //set the number of rooms to 1
        if(builder.bedRooms < 1) {
            this.bedRooms = 1;
        }
        //Otherwise, use the number that was passed
        else {
            this.bedRooms = builder.bedRooms;
        }
    }

    /**
     * @return the spawnRooms
     */
    public int getSpawnRooms() {
        return spawnRooms;
    }

    /**
     * @param spawnRooms the spawnRooms to set
     */
    public void setSpawnRooms(int spawnRooms) {
        this.spawnRooms = spawnRooms;
    }

    /**
     * @return the commonRooms
     */
    public int getCommonRooms() {
        return commonRooms;
    }

    /**
     * @param commonRooms the commonRooms to set
     */
    public void setCommonRooms(int commonRooms) {
        this.commonRooms = commonRooms;
    }

    /**
     * @return the bedRooms
     */
    public int getBedRooms() {
        return bedRooms;
    }

    /**
     * @param bedRooms the bedRooms to set
     */
    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    /**
     * Static Builder class for Beehives
     */
    public static class RoomBuilder {
        
        //Variables
        private int spawnRooms;
        private int commonRooms;
        private int bedRooms;
        
        /**
         * sets the number of spawn rooms
         * @param spawnRooms
         * @return builder object
         */
        public RoomBuilder spawnRooms(int spawnRooms) {
            this.spawnRooms = spawnRooms;
            return this;
        }
        
        /**
         * sets the number of common rooms
         * @param commonRooms
         * @return builder object
         */
        public RoomBuilder commonRooms(int commonRooms) {
            this.commonRooms = commonRooms;
            return this;
        }
        
        /**
         * sets the number of bed rooms
         * @param bedRooms
         * @return builder object
         */
        public RoomBuilder bedRooms(int bedRooms) {
            this.bedRooms = bedRooms;
            return this;
        }
        
        /**
         * Builds the beehiveRooms object
         * @return BeehiveRooms object
         */
        public BeehiveRooms build() {
            return new BeehiveRooms(this);
        }
    }
}
