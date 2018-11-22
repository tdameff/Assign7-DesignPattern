package decoratorpattern;

public class Worker extends BeeDecorator {

  public Worker(Bee newBee) {
    super(newBee);
  }
  
  public String getSpecies() {
    return tempBee.getSpecies();
  }
  
  public String getBeehive() {
    return tempBee.getBeehive();
  }
  
  public String getJob() {
    return tempBee.getJob() + "Worker";
  }
  
  public double getStrength() {
    return tempBee.getStrength() + 50.00;
  }
}
