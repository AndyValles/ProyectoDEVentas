/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.Boleta;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class DBoleta {
    private Coneccion cc=new Coneccion();
    
    public boolean Leer(DefaultTableModel dt){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call mBoleta();");
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   items[3]=rs.getString(4);
                   items[4]=rs.getString(5);
                  
                   dt.addRow(items);
                }return true;
        }catch(Exception e){
        System.out.println("Error de lectura: "+ e);}
    return false;
    }
     
     public boolean Buscar(DefaultTableModel dt,Boleta b){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call bBoleta(?);");
            cSt.setInt(1, b.getCodigo());
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   items[3]=rs.getString(4);
                   items[4]=rs.getString(5);
                
                   dt.addRow(items);
                }
                return true;
        }catch(Exception e){
        System.out.println("Error de Buscado: "+ e);}
    return false;
    }
    
    public boolean Insertar(Boleta b){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call iBoleta(?,?,?,?);");
        cSt.setInt(1, b.getCliente());
        cSt.setInt(2, b.getPedido());
        cSt.setString(3, b.getFecha());
        cSt.setDouble(4, b.getMonto());
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
    

    public boolean Actualizar(Boleta b){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call uBoleta(?,?,?,?,?);");
      cSt.setInt(1, b.getCliente());
        cSt.setInt(2, b.getPedido());
        cSt.setString(3, b.getFecha());
        cSt.setDouble(4, b.getMonto());
        cSt.setInt(5, b.getCodigo());
    
        cSt.close();
        cc.conexion().close();
       
        return true;
     
            
    }catch(Exception e){
        System.out.println("Error de Modificado: "+ e);
    }
    return false;
    }
    
    
    public boolean Eliminar(Boleta b){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call dBoleta(?);");
     cSt.setInt(1, b.getCodigo());
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
    
}
