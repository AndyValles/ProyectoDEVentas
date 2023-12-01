/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Producto;
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
public class NProductoTest {
    
    public NProductoTest() {
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
     * Test of Leer method, of class NProducto.
     */
    @Test
    public void testLeer() {
        System.out.println("Leer");
        DefaultTableModel dt = null;
        NProducto instance = new NProducto();
        boolean expResult = false;
        boolean result = instance.Leer(dt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class NProducto.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        DefaultTableModel dt = null;
        Producto p = null;
        NProducto instance = new NProducto();
        boolean expResult = false;
        boolean result = instance.Buscar(dt, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class NProducto.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Producto p = null;
        NProducto instance = new NProducto();
        boolean expResult = false;
        boolean result = instance.Insertar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class NProducto.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Producto p = null;
        NProducto instance = new NProducto();
        boolean expResult = false;
        boolean result = instance.Actualizar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class NProducto.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Producto p = null;
        NProducto instance = new NProducto();
        boolean expResult = false;
        boolean result = instance.Eliminar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cboProducto method, of class NProducto.
     */
    @Test
    public void testCboProducto() {
        System.out.println("cboProducto");
        NProducto instance = new NProducto();
        ArrayList expResult = null;
        ArrayList result = instance.cboProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
