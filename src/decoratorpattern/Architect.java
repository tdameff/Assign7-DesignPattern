package decoratorpattern;

public class Architect extends BeeDecorator {

  public Architect(Bee newBee) {
    super(newBee);
  }
  
  public String getSpecies() {
    return tempBee.getSpecies();
  }
  
  public String getBeehive() {
    return tempBee.getBeehive();
  }
  
  public String getJob() {
    return tempBee.getJob() + "Architect";
  }
  
  public double getStrength() {
    return tempBee.getStrength() - 50.00;
  }
}
