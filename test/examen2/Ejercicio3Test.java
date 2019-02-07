/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victor
 */
public class Ejercicio3Test {
    
    public Ejercicio3Test() {
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

    @Test
    public void testEjercicio3() {
        int[][] a;
        a = new int[][]{
            {2, 1, 0, 0},
            {0, 0, 1, 0},
            {2, 0, 1, 1}
        };
        assertEquals(274, Ejercicio3.obtenerTasacionPlantacion(a));
        a = new int[][]{
            {2, 0, 1, 0}
        };
        assertEquals(99, Ejercicio3.obtenerTasacionPlantacion(a));
        a = new int[][]{
            {2},
            {0},
            {1},
            {0}
        };
        assertEquals(99, Ejercicio3.obtenerTasacionPlantacion(a));
        a = new int[][]{
            {2}
        };
        assertEquals(50, Ejercicio3.obtenerTasacionPlantacion(a));
    }

}
