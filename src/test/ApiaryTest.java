package test;

import static org.junit.Assert.*;

import org.junit.Test;

import singletonPattern.Apiary;

public class ApiaryTest {

    /**
     * Check to make sure the singleton is working correctly
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
