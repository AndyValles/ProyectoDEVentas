/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Marca;
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
public class NMarcaTest {
    
    public NMarcaTest() {
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
     * Test of Leer method, of class NMarca.
     */
    @Test
    public void testLeer() {
        System.out.println("Leer");
        DefaultTableModel dt = null;
        NMarca instance = new NMarca();
        boolean expResult = false;
        boolean result = instance.Leer(dt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class NMarca.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        DefaultTableModel dt = null;
        Marca m = null;
        NMarca instance = new NMarca();
        boolean expResult = false;
        boolean result = instance.Buscar(dt, m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class NMarca.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Marca m = null;
        NMarca instance = new NMarca();
        boolean expResult = false;
        boolean result = instance.Insertar(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class NMarca.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Marca m = null;
        NMarca instance = new NMarca();
        boolean expResult = false;
        boolean result = instance.Actualizar(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class NMarca.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Marca m = null;
        NMarca instance = new NMarca();
        boolean expResult = false;
        boolean result = instance.Eliminar(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cboMarca method, of class NMarca.
     */
    @Test
    public void testCboMarca() {
        System.out.println("cboMarca");
        NMarca instance = new NMarca();
        ArrayList expResult = null;
        ArrayList result = instance.cboMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
