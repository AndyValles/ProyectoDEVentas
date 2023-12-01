/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DProducto;
import Entidad.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class NProducto {
     private DProducto pp=new DProducto();
    
   public boolean Leer(DefaultTableModel dt){
    return pp.Leer(dt);
    }
   
   public boolean Buscar(DefaultTableModel dt,Producto p){
    return pp.Buscar(dt,p);
    }
    
    public boolean Insertar(Producto p){
    return pp.Insertar(p);
    }
    

    public boolean Actualizar(Producto p){
    return pp.Actualizar(p);
    }
    
    
    public boolean Eliminar(Producto p){
    return pp.Eliminar(p);
    }
    
    public ArrayList cboProducto(){
    return pp.cboProducto();
    }
    
}
