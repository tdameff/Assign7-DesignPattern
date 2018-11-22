package test;

import static org.junit.Assert.*;

import org.junit.Test;

import builderpattern.Beehive;
import builderpattern.BeehiveRooms;
import builderpattern.BeehiveRooms.RoomBuilder;
import singletonpattern.Apiary;

public class BeehiveRoomsTest {

  @Test
  public void BuilderTest() {
    Apiary apiary = Apiary.getInstance();
    
    BeehiveRooms rooms = apiary.createBeehiveRooms()
        .spawnRooms(2).commonRooms(4).bedRooms(8).build();
    
    Beehive hive = apiary.createBeehive().id(1).name("HIVE")
        .rooms(rooms).build();
    
    assertTrue(hive.getId() == 1);
    assertTrue(hive.getName() == "HIVE");
    assertTrue(hive.getRooms().getSpawnRooms() == 2);
    assertTrue(hive.getRooms().getCommonRooms() == 4);
    assertTrue(hive.getRooms().getBedRooms() == 8);
    
    assertTrue(rooms.getSpawnRooms() == 2);
    assertTrue(rooms.getCommonRooms() == 4);
    assertTrue(rooms.getBedRooms() == 8);
  }
  
  @Test
  public void setTest() {
    Apiary apiary = Apiary.getInstance();
    
    BeehiveRooms rooms = apiary.createBeehiveRooms()
        .spawnRooms(2).commonRooms(4).bedRooms(8).build();
    
    Beehive hive = apiary.createBeehive().id(1).name("HIVE")
        .rooms(rooms).build();
    
    assertTrue(hive.getId() == 1);
    assertTrue(hive.getName() == "HIVE");
    assertTrue(hive.getRooms().getSpawnRooms() == 2);
    assertTrue(hive.getRooms().getCommonRooms() == 4);
    assertTrue(hive.getRooms().getBedRooms() == 8);
    
    hive.setId(5);
    hive.setName("BEEE HIVE");
    rooms.setSpawnRooms(6);
    rooms.setCommonRooms(3);
    rooms.setBedRooms(2);
    
    assertTrue(hive.getId() == 5);
    assertTrue(hive.getName() == "BEEE HIVE");
    assertTrue(hive.getRooms().getSpawnRooms() == 6);
    assertTrue(hive.getRooms().getCommonRooms() == 3);
    assertTrue(hive.getRooms().getBedRooms() == 2);
  }

}
