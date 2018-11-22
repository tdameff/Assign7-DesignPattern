package decoratorpattern;

import builderpattern.Beehive;
import builderpattern.Species;
import singletonpattern.Apiary;

public class BaseBee implements Bee {
  
  //Instance
  Apiary apiary = Apiary.getInstance();
  
  //Variables
  Species species;
  String beehive;
  
  public BaseBee(int beehive, int species) {
    this.beehive = apiary.getBeehives().get(beehive).getName();
    this.species = new Species(species);
  }
  
  public String getSpecies() {
    return species.getBeeSpecies();
  }
  
  public String getBeehive() {
    return beehive;
  }
  
  public String getJob() {
    return "";
  }
  
  public double getStrength() {
    return 100.00;
  }
}
