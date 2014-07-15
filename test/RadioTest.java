/*
 * To change this template, choose Tools | Templates
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
 * @author andreabarrera
 */
public class RadioTest {
    
    public RadioTest() {
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
     * Test of cambiarEstado method, of class Radio.
     */
    @Test
    public void testCambiarEstado() {
        System.out.println("cambiarEstado");
        boolean estado1 = false;
        Radio instance = new RadioImpl();
        instance.cambiarEstado(estado1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarFrecuencia method, of class Radio.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        boolean frecuencia1 = false;
        Radio instance = new RadioImpl();
        instance.cambiarFrecuencia(frecuencia1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class Radio.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        double estacion = 0.0;
        Radio instance = new RadioImpl();
        instance.subirEstacion(estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bajarEstacion method, of class Radio.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        double estacion = 0.0;
        Radio instance = new RadioImpl();
        instance.bajarEstacion(estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarEstacion method, of class Radio.
     */
    @Test
    public void testGuardarEstacion() {
        System.out.println("guardarEstacion");
        int boton = 0;
        double estacion = 0.0;
        Radio instance = new RadioImpl();
        instance.guardarEstacion(boton, estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sintonizar method, of class Radio.
     */
    @Test
    public void testSintonizar() {
        System.out.println("sintonizar");
        int posicion = 0;
        Radio instance = new RadioImpl();
        double expResult = 0.0;
        double result = instance.sintonizar(posicion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Radio.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Radio instance = new RadioImpl();
        boolean expResult = false;
        boolean result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class Radio.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Radio instance = new RadioImpl();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacion method, of class Radio.
     */
    @Test
    public void testGetEstacion() {
        System.out.println("getEstacion");
        Radio instance = new RadioImpl();
        double expResult = 0.0;
        double result = instance.getEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RadioImpl implements Radio {

        public void cambiarEstado(boolean estado1) {
        }

        public void cambiarFrecuencia(boolean frecuencia1) {
        }

        public void subirEstacion(double estacion) {
        }

        public void bajarEstacion(double estacion) {
        }

        public void guardarEstacion(int boton, double estacion) {
        }

        public double sintonizar(int posicion) {
            return 0.0;
        }

        public boolean getEstado() {
            return false;
        }

        public boolean getFrecuencia() {
            return false;
        }

        public double getEstacion() {
            return 0.0;
        }
    }
}