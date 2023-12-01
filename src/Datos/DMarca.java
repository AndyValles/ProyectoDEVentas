/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.Marca;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class DMarca {
    private Coneccion cc=new Coneccion();
    
    public boolean Leer(DefaultTableModel dt){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call mMarca();");
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                  
                   dt.addRow(items);
                } return true;
        }catch(Exception e){
        System.out.println("Error de lectura: "+ e);}
    return false;
    }
     
     public boolean Buscar(DefaultTableModel dt,Marca m){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call bMarca(?);");
            cSt.setInt(1, m.getCodigo());
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   
                   dt.addRow(items);
                } return true;
        }catch(Exception e){
        System.out.println("Error de Buscado: "+ e);}
    return false;
    }
    
    public boolean Insertar(Marca m){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call iMarca(?,?);");
        cSt.setString(1, m.getNombre());
        cSt.setInt(2, m.getEstado());
       
     ResultSet rs=cSt.executeQuery();
     
    
        cSt.close();
        cc.conexion().close();
        rs.close();
        return true;
     
    }catch(Exception e){
        System.out.println("Error de Insertado: "+ e);
    }
    return false;
    }
    

    public boolean Actualizar(Marca m){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call uMarca(?,?,?);");
      cSt.setString(1, m.getNombre());
        cSt.setInt(2, m.getEstado());
        cSt.setInt(3, m.getCodigo());
    
        cSt.close();
        cc.conexion().close();
       
        return true;
     
            
    }catch(Exception e){
        System.out.println("Error de Modificado: "+ e);
    }
    return false;
    }
    
    
    public boolean Eliminar(Marca m){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call dMarca(?);");
     cSt.setInt(1, m.getCodigo());
     ResultSet rs=cSt.executeQuery();
      
        cSt.close();
        cc.conexion().close();
        rs.close();
        return true;
     
    }catch(Exception e){
        System.out.println("Error de Eliminado: "+ e);
    }
    return false;
    }
    
    public ArrayList cboMarca(){
    ArrayList items=new ArrayList();
    try{
    CallableStatement cs=cc.conexion().prepareCall("call cboMarca();");
    ResultSet rs=cs.executeQuery();
        while(rs.next()){
            items.add(rs.getString(1));
        }
    }catch(Exception e){}
    
    return items;
    }
    
}
