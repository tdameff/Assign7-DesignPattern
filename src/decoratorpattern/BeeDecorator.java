package decoratorpattern;

abstract class BeeDecorator implements Bee {

  protected Bee tempBee;
  
  public BeeDecorator(Bee newBee) {
    this.tempBee = newBee;
  }
  
  public String getSpecies() {
    return tempBee.getSpecies();
  }
  
  public String getBeehive() {
    return tempBee.getBeehive();
  }
  
  public String getJob() {
    return tempBee.getJob();
  }
  
  public double getStrength() {
    return tempBee.getStrength();
  }
}
