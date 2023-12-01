/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.Trabajador;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class DTrabajador {
    private Coneccion cc=new Coneccion();
    
    public boolean Leer(DefaultTableModel dt){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call mTrabajador();");
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   items[3]=rs.getString(4);
                   items[4]=rs.getString(5);
                   items[5]=rs.getString(6);
                   
                   dt.addRow(items);
                } return true;
        }catch(Exception e){
        System.out.println("Error de lectura: "+ e);}
    return false;
    }
     
     public boolean Buscar(DefaultTableModel dt,Trabajador t){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call bTrabajador(?);");
            cSt.setInt(1, t.getCodigo());
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   items[3]=rs.getString(4);
                   items[4]=rs.getString(5);
                   items[5]=rs.getString(6);
                   
                   dt.addRow(items);
                } return true;
        }catch(Exception e){
        System.out.println("Error de Buscado: "+ e);}
    return false;
    }
    
    public boolean Insertar(Trabajador t){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call iTrabajador(?,?,?,?,?,?,?,?);");
        cSt.setString(1, t.getNombre());
        cSt.setString(2, t.getAPaterno());
        cSt.setString(3, t.getAMaterno());
        cSt.setString(4, t.getUsuario());
        cSt.setString(5, t.getClave());
        cSt.setInt(6, t.getArea());
        cSt.setInt(7, t.getDistrito());
        cSt.setDouble(8, t.getSueldo());
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
    

    public boolean Actualizar(Trabajador t){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call uTrabajador(?,?,?,?,?,?,?,?,?);");
       cSt.setString(1, t.getNombre());
        cSt.setString(2, t.getAPaterno());
        cSt.setString(3, t.getAMaterno());
        cSt.setString(4, t.getUsuario());
        cSt.setString(5, t.getClave());
        cSt.setInt(6, t.getArea());
        cSt.setInt(7, t.getDistrito());
        cSt.setDouble(8, t.getSueldo());
        cSt.setInt(9, t.getCodigo());
        cSt.close();
        cc.conexion().close();
       
        return true;
     
            
    }catch(Exception e){
        System.out.println("Error de Modificado: "+ e);
    }
    return false;
    }
    
    
    public boolean Eliminar(Trabajador t){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call dTrabajador(?);");
     cSt.setInt(1, t.getCodigo());
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
    
    public ArrayList cboTrabajador(){
    ArrayList items=new ArrayList();
    try{
    CallableStatement cs=cc.conexion().prepareCall("call cboTrabajador();");
    ResultSet rs=cs.executeQuery();
        while(rs.next()){
            items.add(rs.getString(1));
        }
    }catch(Exception e){}
    
    return items;
    }
    
     public ArrayList cboArea(){
    ArrayList items=new ArrayList();
    try{
    CallableStatement cs=cc.conexion().prepareCall("call cboArea();");
    ResultSet rs=cs.executeQuery();
        while(rs.next()){
            items.add(rs.getString(1));
        }
    }catch(Exception e){}
    
    return items;
    }
    
}
