/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Trabajador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andyv
 */
public class NTrabajadorTest {
    
    public NTrabajadorTest() {
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
     * Test of Leer method, of class NTrabajador.
     */
    @Test
    public void testLeer() {
        System.out.println("Leer");
        DefaultTableModel dt = null;
        NTrabajador instance = new NTrabajador();
        boolean expResult = false;
        boolean result = instance.Leer(dt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class NTrabajador.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        DefaultTableModel dt = null;
        Trabajador t = null;
        NTrabajador instance = new NTrabajador();
        boolean expResult = false;
        boolean result = instance.Buscar(dt, t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class NTrabajador.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Trabajador t = null;
        NTrabajador instance = new NTrabajador();
        boolean expResult = false;
        boolean result = instance.Insertar(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class NTrabajador.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Trabajador t = null;
        NTrabajador instance = new NTrabajador();
        boolean expResult = false;
        boolean result = instance.Actualizar(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class NTrabajador.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Trabajador t = null;
        NTrabajador instance = new NTrabajador();
        boolean expResult = false;
        boolean result = instance.Eliminar(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cboTrabajador method, of class NTrabajador.
     */
    @Test
    public void testCboTrabajador() {
        System.out.println("cboTrabajador");
        NTrabajador instance = new NTrabajador();
        ArrayList expResult = null;
        ArrayList result = instance.cboTrabajador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cboArea method, of class NTrabajador.
     */
    @Test
    public void testCboArea() {
        System.out.println("cboArea");
        NTrabajador instance = new NTrabajador();
        ArrayList expResult = null;
        ArrayList result = instance.cboArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
