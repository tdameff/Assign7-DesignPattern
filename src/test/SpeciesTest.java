package test;

import builderpattern.Species;
import static org.junit.Assert.*;

import org.junit.Test;

public class SpeciesTest {

  @Test
  public void testSpecies() {
    // Test default constructor
    Species s = new Species();
    assertTrue(s.getBeeSpecies() == "Bumble Bee");
    
    // Test constructor with different args
    Species s1 = new Species(1);
    Species s2 = new Species(2);
    Species s3 = new Species(3);
    Species s4 = new Species(4);
    Species s5 = new Species(5);
    assertTrue(s1.getBeeSpecies() == "Bumble Bee");
    assertTrue(s2.getBeeSpecies() == "Honey Bee");
    assertTrue(s3.getBeeSpecies() == "Carpenter Bee");
    assertTrue(s4.getBeeSpecies() == "Andrena Bee");
    assertTrue(s5.getBeeSpecies() == "Apidae Bee");
    
    s.setBeeSpecies(1);
    assertTrue(s.getBeeSpecies() == "Bumble Bee");
    
    s.setBeeSpecies(2);
    assertTrue(s.getBeeSpecies() == "Honey Bee");
    
    s.setBeeSpecies(3);
    assertTrue(s.getBeeSpecies() == "Carpenter Bee");
    
    s.setBeeSpecies(4);
    assertTrue(s.getBeeSpecies() == "Andrena Bee");
    
    s.setBeeSpecies(5);
    assertTrue(s.getBeeSpecies() == "Apidae Bee");
  }
}
