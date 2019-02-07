package examen2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Ejercicio4Test {

    public Ejercicio4Test() {
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
    public void testEjercicio4() {
        String[] a = {
            "zas fas",
            "iwe oiewr oi IveLanY asd",
            "iwe oi",
            "oirweo oiewr iVeLaNy fsdp"
        };
        assertEquals(Ejercicio4.hayExterior(a), true);
        a = new String[]{
            "zas fas",
            "iwe oiewr oiiveLanY asd",
            "iwe oi",
            "oirweo oiewr iVLaNy fsdp"
        };
        assertEquals(Ejercicio4.hayExterior(a), false);
                a = new String[]{
            "zas fas",
            "iwe oiewr oi iveLaiveLANYasd",
            "iwe oi",
            "oirweo oiewr iVeLaNy fsdp"
        };
        assertEquals(Ejercicio4.hayExterior(a), true);
        a = new String[]{
            "zas fas",
            "iwe oiewr oi iveLaiveLANYasd ivelany",
            "iwe oi",
            "oirweo oiewr iVeLay fsdp"
        };
        assertEquals(Ejercicio4.hayExterior(a), false);
        a = new String[]{};
        assertEquals(Ejercicio4.hayExterior(a), false);
        a = new String[]{
            "zas fas"
        };
        boolean hayExcepcion = false;
        try {
            Ejercicio4.hayExterior(null);
        } catch (IllegalArgumentException ex) {
            hayExcepcion = true;
        };

        assertEquals("Se espera excepcion si array es null", true, hayExcepcion);
    }

}
