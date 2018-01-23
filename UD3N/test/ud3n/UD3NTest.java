/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3n;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marta
 */
public class UD3NTest {
    
    public UD3NTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of division method, of class UD3N.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int numerador = 0;
        int denominador = 0;
        int expResult = 0;
        int result = UD3N.division(numerador, denominador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        
    }

    /**
     * Test of main method, of class UD3N.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UD3N.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
