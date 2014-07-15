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
public class RadioG1Test {
    
    public RadioG1Test() {
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
     * Test of cambiarEstado method, of class RadioG1.
     */
    @Test
    public void testCambiarEstado() {
        System.out.println("cambiarEstado");
        boolean estado1 = false;
        RadioG1 instance = new RadioG1();
        instance.cambiarEstado(estado1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarFrecuencia method, of class RadioG1.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        boolean frecuencia1 = false;
        RadioG1 instance = new RadioG1();
        instance.cambiarFrecuencia(frecuencia1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class RadioG1.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        double estacion1 = 0.0;
        RadioG1 instance = new RadioG1();
        instance.subirEstacion(estacion1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bajarEstacion method, of class RadioG1.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        double estacion1 = 0.0;
        RadioG1 instance = new RadioG1();
        instance.bajarEstacion(estacion1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarEstacion method, of class RadioG1.
     */
    @Test
    public void testGuardarEstacion() {
        System.out.println("guardarEstacion");
        int boton = 0;
        double estacion = 0.0;
        RadioG1 instance = new RadioG1();
        instance.guardarEstacion(boton, estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sintonizar method, of class RadioG1.
     */
    @Test
    public void testSintonizar() {
        System.out.println("sintonizar");
        int posicion = 0;
        RadioG1 instance = new RadioG1();
        double expResult = 0.0;
        double result = instance.sintonizar(posicion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSintonizar method, of class RadioG1.
     */
    @Test
    public void testGetSintonizar() {
        System.out.println("getSintonizar");
        RadioG1 instance = new RadioG1();
        String[] expResult = null;
        String[] result = instance.getSintonizar();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSintonizar method, of class RadioG1.
     */
    @Test
    public void testSetSintonizar() {
        System.out.println("setSintonizar");
        String[] sintonizar = null;
        RadioG1 instance = new RadioG1();
        instance.setSintonizar(sintonizar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmFm method, of class RadioG1.
     */
    @Test
    public void testSetAmFm() {
        System.out.println("setAmFm");
        boolean amFm = false;
        RadioG1 instance = new RadioG1();
        instance.setAmFm(amFm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class RadioG1.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        RadioG1 instance = new RadioG1();
        boolean expResult = false;
        boolean result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class RadioG1.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        RadioG1 instance = new RadioG1();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class RadioG1.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        RadioG1 instance = new RadioG1();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacion method, of class RadioG1.
     */
    @Test
    public void testGetEstacion() {
        System.out.println("getEstacion");
        RadioG1 instance = new RadioG1();
        double expResult = 0.0;
        double result = instance.getEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacion method, of class RadioG1.
     */
    @Test
    public void testSetEstacion() {
        System.out.println("setEstacion");
        double estacion = 0.0;
        RadioG1 instance = new RadioG1();
        instance.setEstacion(estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RadioG1.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RadioG1 instance = new RadioG1();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}