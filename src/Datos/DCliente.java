/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.Cliente;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class DCliente {
    private Coneccion cc=new Coneccion();
    
    public boolean Leer(DefaultTableModel dt){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call mCliente();");
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   items[3]=rs.getString(4);
                   items[4]=rs.getString(5);
                   items[5]=rs.getString(6);
                  
                   dt.addRow(items);
                }
                return true;
        }catch(Exception e){
        System.out.println("Error de lectura: "+ e);}
    return false;
    }
     
     public boolean Buscar(DefaultTableModel dt,Cliente c){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call bCliente(?);");
            cSt.setInt(1, c.getCodigo());
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   items[3]=rs.getString(4);
                   items[4]=rs.getString(5);
                   items[5]=rs.getString(6);
                   
                   dt.addRow(items);
                }
                cSt.close();
        cc.conexion().close();
        rs.close();
                
                return true;
        }catch(Exception e){
        System.out.println("Error de Buscado: "+ e);}
        return false;
    }
    
    public boolean Insertar(Cliente c){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call iCliente(?,?,?,?,?);");
        cSt.setString(1, c.getNombre());
        cSt.setString(2, c.getApellido());
        cSt.setString(3,c.getFNacimiento());
        cSt.setString(4, c.getEstado());
        cSt.setInt(5, c.getDistrito());
        
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
    

    public boolean Actualizar(Cliente c){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call uCliente(?,?,?,?,?,?);");
      cSt.setString(1, c.getNombre());
        cSt.setString(2, c.getApellido());
        cSt.setString(3,c.getFNacimiento());
        cSt.setString(4, c.getEstado());
        cSt.setInt(5, c.getDistrito());      
        cSt.setInt(6, c.getCodigo());
    
        cSt.close();
        cc.conexion().close();
       
        return true;
     
            
    }catch(Exception e){
        System.out.println("Error de Modificado: "+ e);
    }
    return false;
    }
    
    
    public boolean Eliminar(Cliente c){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call dCliente(?);");
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
    
    public ArrayList cboCliente(){
    ArrayList items=new ArrayList();
    try{
    CallableStatement cs=cc.conexion().prepareCall("call cboCliente();");
    ResultSet rs=cs.executeQuery();
        while(rs.next()){
            items.add(rs.getString(1));
        }
    }catch(Exception e){}
    
    return items;
    }
}
