/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DPedido;
import Entidad.Pedido;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class NPedido {
     private DPedido pp=new DPedido();
    
   public boolean Leer(DefaultTableModel dt){
    return pp.Leer(dt);
    }
   
   public boolean Buscar(DefaultTableModel dt,Pedido p){
    return pp.Buscar(dt,p);
    }
    
    public boolean Insertar(Pedido p){
    return pp.Insertar(p);
    }
    

    public boolean Actualizar(Pedido p){
    return pp.Actualizar(p);
    }
    
    
    public boolean Eliminar(Pedido p){
    return pp.Eliminar(p);
    }
    
    public ArrayList cboPedido(){
    return pp.cboPedido();
    }
}
