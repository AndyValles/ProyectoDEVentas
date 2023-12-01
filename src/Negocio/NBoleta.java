/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DBoleta;
import Entidad.Boleta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class NBoleta {
     private DBoleta bb=new DBoleta();
    
   public boolean Leer(DefaultTableModel dt){
    return bb.Leer(dt);
    }
   
   public boolean Buscar(DefaultTableModel dt,Boleta b){
    return bb.Buscar(dt,b);
    }
    
    public boolean Insertar(Boleta b){
    return bb.Insertar(b);
    }
    

    public boolean Actualizar(Boleta b){
    return bb.Actualizar(b);
    }
    
    
    public boolean Eliminar(Boleta b){
    return bb.Eliminar(b);
    }
}
