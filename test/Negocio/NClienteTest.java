/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Cliente;
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
public class NClienteTest {
    
    public NClienteTest() {
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
    public void testLeer() {
        System.out.println("Leer");
        DefaultTableModel dt = null;
        NCliente instance = new NCliente();
        boolean expResult = false;
        boolean result = instance.Leer(dt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class NCliente.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        DefaultTableModel dt = null;
        Cliente c = null;
        NCliente instance = new NCliente();
        boolean expResult = false;
        boolean result = instance.Buscar(dt, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class NCliente.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Cliente c = null;
        NCliente instance = new NCliente();
        boolean expResult = false;
        boolean result = instance.Insertar(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class NCliente.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Cliente c = null;
        NCliente instance = new NCliente();
        boolean expResult = false;
        boolean result = instance.Actualizar(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class NCliente.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Cliente c = null;
        NCliente instance = new NCliente();
        boolean expResult = false;
        boolean result = instance.Eliminar(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of cboCliente method, of class NCliente.
     */
    @Test
    public void testCboCliente() {
        System.out.println("cboCliente");
        NCliente instance = new NCliente();
        ArrayList expResult = null;
        ArrayList result = instance.cboCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
