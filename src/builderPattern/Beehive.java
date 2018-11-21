package builderPattern;

public class Beehive {

    //Variables
    private int id;
    private String name;
    
    private Beehive(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
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
     * Static Builder class for Beehives
     */
    public static class Builder {
        
        //Variables
        private int id;
        private String name;
        
        /**
         * Sets the id for the beehive
         * @param id
         * @return builder object
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }
        
        /**
         * sets the name for the beehive
         * @param name
         * @return builder object
         */
        public Builder name(String name) {
            this.name = name;
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
