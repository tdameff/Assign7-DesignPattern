package test;

//Imports
import builderpattern.Beehive;
import builderpattern.BeehiveRooms;
import singletonpattern.Apiary;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Test Class for Apiary.java.
 * 
 * @author Taylor Dameff 
 *      SER 316 - Assignment 7 
 *      November 20, 2018
 */

public class ApiaryTest {

  /**
   * Check to make sure the singleton is working correctly.
   */
  @Test
  public void singleton() {
    Apiary s1 = Apiary.getInstance();
    Apiary s2 = Apiary.getInstance();

    assertEquals(s1, s2);

    s1 = null;

    assertNotEquals(s1, s2);
  }
  
  @Test
  public void addBeehive() {
    Apiary apiary = Apiary.getInstance();
    BeehiveRooms rooms = apiary.createBeehiveRooms().spawnRooms(2)
        .commonRooms(4).bedRooms(5).build();
    Beehive beehive = apiary.createBeehive().id(1).name("BEEHIVE").rooms(rooms).build();
    
    apiary.addBeehive(beehive);
    
    assertTrue(apiary.getBeehives().get(1).getId() == beehive.getId());
  }
}