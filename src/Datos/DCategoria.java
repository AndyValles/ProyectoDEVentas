/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.Categoria;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class DCategoria {
    private Coneccion cc=new Coneccion();
    
    public boolean Leer(DefaultTableModel dt){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call mCategoria();");
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   dt.addRow(items);
                }
                return true;
        }catch(Exception e){
        System.out.println("Error de lectura: "+ e);}
    return false;
    }
     
     public boolean Buscar(DefaultTableModel dt,Categoria c){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call bCategoria(?);");
            cSt.setInt(1, c.getCodigo());
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   
                   dt.addRow(items);
                }
                return true;
        }catch(Exception e){
        System.out.println("Error de Buscado: "+ e);}
    return false;
    }
    
    public boolean Insertar(Categoria c){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call iCategoria(?,?);");
        cSt.setString(1, c.getDescripcion());
        cSt.setInt(2, c.getEstado());
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
    

    public boolean Actualizar(Categoria c){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call uCategoria(?,?,?);");
        cSt.setString(1, c.getDescripcion());
        cSt.setInt(2, c.getEstado());
        cSt.setInt(3, c.getCodigo());
    
        cSt.close();
        cc.conexion().close();
       
        return true;
     
            
    }catch(Exception e){
        System.out.println("Error de Modificado: "+ e);
    }
    return false;
    }
    
    
    public boolean Eliminar(Categoria c){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call dCategoria(?);");
     cSt.setInt(1, c.getCodigo());
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
    
    public ArrayList cboCategoria(){
    ArrayList items=new ArrayList();
    try{
    CallableStatement cs=cc.conexion().prepareCall("call cboCategoria();");
    ResultSet rs=cs.executeQuery();
        while(rs.next()){
            items.add(rs.getString(1));
        }
    }catch(Exception e){}
    
    return items;
    }
}
