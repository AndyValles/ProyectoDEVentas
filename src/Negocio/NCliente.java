/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DCliente;
import Entidad.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class NCliente {
     private DCliente cc=new DCliente();
    
   public boolean Leer(DefaultTableModel dt){
    return cc.Leer(dt);
    }
   
   public boolean Buscar(DefaultTableModel dt,Cliente c){
    return cc.Buscar(dt,c);
    }
    
    public boolean Insertar(Cliente c){
    return cc.Insertar(c);
    }
    

    public boolean Actualizar(Cliente c){
    return cc.Actualizar(c);
    }
    
    
    public boolean Eliminar(Cliente c){
    return cc.Eliminar(c);
    }
    
    public ArrayList cboCliente(){
    return cc.cboCliente();
    }
}
