package builderpattern;

public class Species {

  //Variables
  private String beeSpecies;
  
  public Species() {
    // Defualt species is Bumble Bee
    this.beeSpecies = "Bumble Bee";
  }
  
  /**
   * Constructor that takes one argument.
   * @param species of type int
   */
  public Species(int species) {
    
    if (species == 1) {
      this.beeSpecies = "Bumble Bee";
    } else if (species == 2) {
      this.beeSpecies = "Honey Bee";
    } else if (species == 3) {
      this.beeSpecies = "Carpenter Bee";
    } else if (species == 4) {
      this.beeSpecies = "Andrena Bee";
    } else if (species == 5) {
      this.beeSpecies = "Apidae Bee";
    }
  }

  /**
   * Get the bee species.
   * 
   * @return the beeSpecies
   */
  public String getBeeSpecies() {
    return beeSpecies;
  }

  /**
   * Set the bee species.
   * 
   * @param species the beeSpecies to set
   */
  public void setBeeSpecies(int species) {
    if (species == 1) {
      this.beeSpecies = "Bumble Bee";
    } else if (species == 2) {
      this.beeSpecies = "Honey Bee";
    } else if (species == 3) {
      this.beeSpecies = "Carpenter Bee";
    } else if (species == 4) {
      this.beeSpecies = "Andrena Bee";
    } else if (species == 5) {
      this.beeSpecies = "Apidae Bee";
    }
  }
}
