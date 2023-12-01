/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DCategoria;
import Entidad.Categoria;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class NCategoria {
     private DCategoria cc=new DCategoria();
    
   public boolean Leer(DefaultTableModel dt){
    return cc.Leer(dt);
    }
   
   public boolean Buscar(DefaultTableModel dt,Categoria c){
    return cc.Buscar(dt,c);
    }
    
    public boolean Insertar(Categoria c){
    return cc.Insertar(c);
    }
    

    public boolean Actualizar(Categoria c){
    return cc.Actualizar(c);
    }
    
    
    public boolean Eliminar(Categoria c){
    return cc.Eliminar(c);
    }
    
    public ArrayList cboCategoria(){
    return cc.cboCategoria();
    }
}
