/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DTrabajador;
import Entidad.Trabajador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class NTrabajador {
     private DTrabajador tt=new DTrabajador();
    
   public boolean Leer(DefaultTableModel dt){
    return tt.Leer(dt);
    }
   
   public boolean Buscar(DefaultTableModel dt,Trabajador t){
    return tt.Buscar(dt,t);
    }
    
    public boolean Insertar(Trabajador t){
    return tt.Insertar(t);
    }
    

    public boolean Actualizar(Trabajador t){
    return tt.Actualizar(t);
    }
    
    
    public boolean Eliminar(Trabajador t){
    return tt.Eliminar(t);
    }
    
    public ArrayList cboTrabajador(){
    return tt.cboTrabajador();
    }
    
     public ArrayList cboArea(){
    return tt.cboArea();
    }
}
