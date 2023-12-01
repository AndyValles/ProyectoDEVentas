/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Distrito;
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
public class NDistritoTest {
    
    public NDistritoTest() {
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
     * Test of Leer method, of class NDistrito.
     */
    @Test
    public void testLeer() {
        System.out.println("Leer");
        DefaultTableModel dt = null;
        NDistrito instance = new NDistrito();
        boolean expResult = false;
        boolean result = instance.Leer(dt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class NDistrito.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        DefaultTableModel dt = null;
        Distrito d = null;
        NDistrito instance = new NDistrito();
        boolean expResult = false;
        boolean result = instance.Buscar(dt, d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class NDistrito.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Distrito d = null;
        NDistrito instance = new NDistrito();
        boolean expResult = false;
        boolean result = instance.Insertar(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class NDistrito.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Distrito d = null;
        NDistrito instance = new NDistrito();
        boolean expResult = false;
        boolean result = instance.Actualizar(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class NDistrito.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Distrito d = null;
        NDistrito instance = new NDistrito();
        boolean expResult = false;
        boolean result = instance.Eliminar(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cboDistrito method, of class NDistrito.
     */
    @Test
    public void testCboDistrito() {
        System.out.println("cboDistrito");
        NDistrito instance = new NDistrito();
        ArrayList expResult = null;
        ArrayList result = instance.cboDistrito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
