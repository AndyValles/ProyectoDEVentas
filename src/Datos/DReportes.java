/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author andyv
 */
public class DReportes {
    private Coneccion cn=new Coneccion();
    
    
    public boolean Reporte(Object dato){
     try{
        String dir="C:\\Users\\andyv\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoDEVentas\\src\\Reporte\\Boleta.jrxml";
       
        Map parametro=new HashMap();
        parametro.put("nom",dato);
        JasperReport reporte=JasperCompileManager.compileReport(dir);
        JasperPrint mostrar= JasperFillManager.fillReport(reporte,parametro,cn.conexion());
       
        JasperViewer ventana=new JasperViewer(mostrar,false);
        ventana.setTitle("Compra");
        ventana.setVisible(true);
        
        return true;
        }catch(Exception e){
        System.out.print(e.getMessage());
        }
     return false;
    }
}
