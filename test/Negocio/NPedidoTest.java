/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Pedido;
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
public class NPedidoTest {
    
    public NPedidoTest() {
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
     * Test of Leer method, of class NPedido.
     */
    @Test
    public void testLeer() {
        System.out.println("Leer");
        DefaultTableModel dt = null;
        NPedido instance = new NPedido();
        boolean expResult = false;
        boolean result = instance.Leer(dt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class NPedido.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        DefaultTableModel dt = null;
        Pedido p = null;
        NPedido instance = new NPedido();
        boolean expResult = false;
        boolean result = instance.Buscar(dt, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class NPedido.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Pedido p = null;
        NPedido instance = new NPedido();
        boolean expResult = false;
        boolean result = instance.Insertar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class NPedido.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Pedido p = null;
        NPedido instance = new NPedido();
        boolean expResult = false;
        boolean result = instance.Actualizar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class NPedido.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Pedido p = null;
        NPedido instance = new NPedido();
        boolean expResult = false;
        boolean result = instance.Eliminar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cboPedido method, of class NPedido.
     */
    @Test
    public void testCboPedido() {
        System.out.println("cboPedido");
        NPedido instance = new NPedido();
        ArrayList expResult = null;
        ArrayList result = instance.cboPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
