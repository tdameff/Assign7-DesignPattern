package test;

//Imports
import static org.junit.Assert.assertTrue;

import builderpattern.Beehive;

import org.junit.Test;

import singletonpattern.Apiary;

public class BeehiveTest {

  @Test
  public void beehiveTest() {
    Apiary apiary = Apiary.getInstance();
    
    Beehive hive = apiary.createBeehive().id(1).name("BEEHIVE").build();
    
    assertTrue(hive.getId() == 1);
    assertTrue(hive.getName() == "BEEHIVE");
    
  }
}