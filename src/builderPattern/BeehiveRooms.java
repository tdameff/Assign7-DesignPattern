package builderPattern;

public class BeehiveRooms {
    
    //Variables
    private int spawnRooms;
    private int commonRooms;
    private int bedRooms;
    
    private BeehiveRooms(Builder builder) {
        this.spawnRooms = builder.spawnRooms;
        this.commonRooms = builder.commonRooms;
        this.bedRooms = builder.bedRooms;
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
        bedRooms = bedRooms;
    }

    /**
     * Static Builder class for Beehives
     */
    public static class Builder {
        
        //Variables
        private int spawnRooms;
        private int commonRooms;
        private int bedRooms;
        
        /**
         * sets the number of spawn rooms
         * @param spawnRooms
         * @return builder object
         */
        public Builder spawnRooms(int spawnRooms) {
            this.spawnRooms = spawnRooms;
            return this;
        }
        
        /**
         * sets the number of common rooms
         * @param commonRooms
         * @return builder object
         */
        public Builder commonRooms(int commonRooms) {
            this.commonRooms = commonRooms;
            return this;
        }
        
        /**
         * sets the number of bed rooms
         * @param bedRooms
         * @return builder object
         */
        public Builder bedRooms(int bedRooms) {
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
