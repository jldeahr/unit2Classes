

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class Vending_MachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending_MachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int totalCans;

    /**
     * Default constructor for objects of class Vending_MachineTest
     */
    public Vending_MachineTest()
    {
        // initialise instance variables
        
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAddCan()
    {
        Vending_Machine vm1 = new Vending_Machine();
        int totalCans = vm1.getotalCans;
        vm1.addCan(2);
        assertEquals(2, totalCans,1e-6);
    }
}
