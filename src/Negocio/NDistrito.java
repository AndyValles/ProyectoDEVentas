/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DDistrito;
import Entidad.Distrito;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class NDistrito {
     private DDistrito dd=new DDistrito();
    
   public boolean Leer(DefaultTableModel dt){
    return dd.Leer(dt);
    }
   
   public boolean Buscar(DefaultTableModel dt,Distrito d){
    return dd.Buscar(dt,d);
    }
    
    public boolean Insertar(Distrito d){
    return dd.Insertar(d);
    }
    

    public boolean Actualizar(Distrito d){
    return dd.Actualizar(d);
    }
    
    
    public boolean Eliminar(Distrito d){
    return dd.Eliminar(d);
    }
    
    public ArrayList cboDistrito(){
    return dd.cboDistrito();
    }
}
