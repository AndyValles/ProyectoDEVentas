/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.Pedido;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class DPedido {
    private Coneccion cc=new Coneccion();
    
    public boolean Leer(DefaultTableModel dt){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call mPedido();");
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
        System.out.println("Error de lectura: "+ e);}
    return false;
    }
     
     public boolean Buscar(DefaultTableModel dt,Pedido p){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call bPedido(?);");
            cSt.setInt(1, p.getCodigo());
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
    
    public boolean Insertar(Pedido p){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call iPedido(?,?,?);");
        cSt.setInt(1, p.getCliente());
        cSt.setInt(2, p.getProducto());
        cSt.setInt(3, p.getCantidad());
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
    

    public boolean Actualizar(Pedido p){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call uPedido(?,?,?,?);");
       cSt.setInt(1, p.getCliente());
        cSt.setInt(2, p.getProducto());
        cSt.setInt(3, p.getCantidad());
        cSt.setInt(4, p.getCodigo());
    
        cSt.close();
        cc.conexion().close();
       
        return true;
     
            
    }catch(Exception e){
        System.out.println("Error de Modificado: "+ e);
    }
    return false;
    }
    
    
    public boolean Eliminar(Pedido p){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call dPedido(?);");
     cSt.setInt(1, p.getCodigo());
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
    
    public ArrayList cboPedido(){
    ArrayList items=new ArrayList();
    try{
    CallableStatement cs=cc.conexion().prepareCall("call cboPedido();");
    ResultSet rs=cs.executeQuery();
        while(rs.next()){
            items.add(rs.getString(1));
        }
    }catch(Exception e){}
    
    return items;
    }
    
}
