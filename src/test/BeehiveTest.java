package test;

//Imports
import builderpattern.Beehive;
import singletonpattern.Apiary;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BeehiveTest {

  @Test
  public void beehiveTest() {
    Apiary apiary = Apiary.getInstance();
    
    Beehive hive = apiary.createBeehive().id(1).name("BEEHIVE").build();
    
    assertTrue(hive.getId() == 1);
    assertTrue(hive.getName() == "BEEHIVE");
    
  }
}