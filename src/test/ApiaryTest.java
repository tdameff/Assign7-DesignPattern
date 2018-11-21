package test;

//Imports
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import singletonpattern.Apiary;

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
}