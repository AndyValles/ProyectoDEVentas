/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DReportes;

/**
 *
 * @author andyv
 */
public class NReporte {
    private DReportes rr=new DReportes();
    
    public boolean Reporte(Object dato){
     return rr.Reporte(dato);
    }
}
