/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DMarca;
import Entidad.Marca;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class NMarca {
     private DMarca mm=new DMarca();
    
   public boolean Leer(DefaultTableModel dt){
    return mm.Leer(dt);
    }
   
   public boolean Buscar(DefaultTableModel dt,Marca m){
    return mm.Buscar(dt,m);
    }
    
    public boolean Insertar(Marca m){
    return mm.Insertar(m);
    }
    

    public boolean Actualizar(Marca m){
    return mm.Actualizar(m);
    }
    
    
    public boolean Eliminar(Marca m){
    return mm.Eliminar(m);
    }
    
    public ArrayList cboMarca(){
    return mm.cboMarca();
    }
   
}
