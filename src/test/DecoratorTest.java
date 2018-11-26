package test;

//Imports
import static org.junit.Assert.assertTrue;

import decoratorpattern.Architect;
import decoratorpattern.BaseBee;
import decoratorpattern.Bee;
import decoratorpattern.Queen;
import decoratorpattern.Worker;
import singletonpattern.Apiary;

import java.util.ArrayList;
import org.junit.Test;

import builderpattern.Beehive;
import builderpattern.BeehiveRooms;
import builderpattern.Species;

public class DecoratorTest {

  @Test
  public void decoratorTest() {
    ArrayList<Bee> bees = new ArrayList<Bee>();

    //Create beehive
    Apiary apiary = Apiary.getInstance();
    BeehiveRooms rooms = apiary.createBeehiveRooms()
        .spawnRooms(2).commonRooms(3).bedRooms(5).build();
    Species bumblebee = new Species(1);     // Bumble Bee
    Beehive beehive = apiary.createBeehive().id(1).name("BEEEHive")
        .species(bumblebee).rooms(rooms).build();
    apiary.addBeehive(beehive);
    
    // Create bees with decorator pattern
    Bee b = new Worker(new BaseBee(1, 1));
    Bee queen = new Queen(new BaseBee(1, 2));
    Bee architect = new Architect(new BaseBee(1, 3));
    
    // Add bees to list so we can print them easily
    bees.add(b);
    bees.add(queen);
    bees.add(architect);

    assertTrue(bees.get(0).getStrength() == 150.00);
  }
}