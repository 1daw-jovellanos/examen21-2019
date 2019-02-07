/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.time.Month;
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
public class TabletTest {
    
    Tablet t1;
    
    public TabletTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        t1 = new Tablet("marca", "modelo", LocalDate.of(2000, 3, 1), "descripcion");
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testGetPrecioHora() {
        assertEquals(45, Tablet.getPrecioHora(), 0.01);
    }

    /**
     * Test of setPrecioHora method, of class Tablet.
     */
    @Test
    public void testSetPrecioHora() {
        double p = Tablet.getPrecioHora();
        Tablet.setPrecioHora(22);
        assertEquals(22, Tablet.getPrecioHora(), 0.01);
        Tablet.setPrecioHora(p);
    }

    /**
     * Test of getModelo method, of class Tablet.
     */
    @Test
    public void testGetModelo() {
        assertEquals("modelo", t1.getModelo());
    }

    /**
     * Test of setHoras method, of class Tablet.
     */
    @Test
    public void testSetHoras() {
        t1.setHoras(5);
        assertEquals(5, t1.getHoras(), 0.01);
    }

    /**
     * Test of getMarca method, of class Tablet.
     */
    @Test
    public void testGetMarca() {
        assertEquals("marca", t1.getMarca());
    }

    /**
     * Test of getFechaCompra method, of class Tablet.
     */
    @Test
    public void testGetFechaCompra() {
        assertEquals(LocalDate.of(2000, 3, 1), t1.getFechaCompra());
    }

    /**
     * Test of getDescripcionAveria method, of class Tablet.
     */
    @Test
    public void testGetDescripcionAveria() {
        assertEquals("descripcion", t1.getDescripcionAveria());
    }

    /**
     * Test of getHoras method, of class Tablet.
     */
    @Test
    public void testGetHoras() {
        assertEquals(0.25, t1.getHoras(), 0.01);
    }
    
    @Test
    public void testCalcularPrecioReparacion() {
        assertEquals(12, t1.calcularPrecioReparacion(), 0.01);
        t1.setHoras(2.50);
        assertEquals(113, t1.calcularPrecioReparacion(), 0.01);
        t1.setHoras(3.41);
        assertEquals(154, t1.calcularPrecioReparacion(), 0.01);
    }
    
}
