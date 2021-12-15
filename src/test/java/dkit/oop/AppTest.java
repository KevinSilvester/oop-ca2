package dkit.oop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testFindDistanceBetween() {
        CityDistanceManager cityDistanceManager = new CityDistanceManager();
        int exp1 = 167, exp2 = 0, exp3 = 209;
        int act1 = cityDistanceManager.findDistanceBetween("Dublin", "Belfast");
        int act2 = cityDistanceManager.findDistanceBetween("Dublin", "Dublin");
        int act3 = cityDistanceManager.findDistanceBetween("Galway", "Cork");
        assertEquals(exp1, act1);
        assertEquals(exp2, act2);
        assertEquals(exp3, act3);
    }
}
