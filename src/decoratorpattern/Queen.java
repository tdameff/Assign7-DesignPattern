package decoratorpattern;

public class Queen extends BeeDecorator {

  public Queen(Bee newBee) {
    super(newBee);
  }
  
  public String getSpecies() {
    return tempBee.getSpecies();
  }
  
  public String getBeehive() {
    return tempBee.getBeehive();
  }
  
  public String getJob() {
    return tempBee.getJob() + "Queen";
  }
  
  public double getStrength() {
    return tempBee.getStrength() + 100.00;
  }
}
