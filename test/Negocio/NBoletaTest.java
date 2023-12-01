/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidad.Boleta;
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
public class NBoletaTest {
    
    public NBoletaTest() {
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
        NBoleta instance = new NBoleta();
        boolean expResult = false;
        boolean result = instance.Leer(dt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class NBoleta.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        DefaultTableModel dt = null;
        Boleta b = null;
        NBoleta instance = new NBoleta();
        boolean expResult = false;
        boolean result = instance.Buscar(dt, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Boleta b = null;
        NBoleta instance = new NBoleta();
        boolean expResult = false;
        boolean result = instance.Insertar(b);
        assertEquals(expResult, result);
    }

    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Boleta b = null;
        NBoleta instance = new NBoleta();
        boolean expResult = false;
        boolean result = instance.Actualizar(b);
        assertEquals(expResult, result);
    }

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Boleta b = null;
        NBoleta instance = new NBoleta();
        boolean expResult = false;
        boolean result = instance.Eliminar(b);
        assertEquals(expResult, result);
    }
}
