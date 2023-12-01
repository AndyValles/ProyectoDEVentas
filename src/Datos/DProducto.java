
package Datos;

import Entidad.Producto;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class DProducto {
    private Coneccion cc=new Coneccion();
    
    public boolean Leer(DefaultTableModel dt){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call mProducto();");
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   items[3]=rs.getString(4);
                   items[4]=rs.getString(5);
                   items[5]=rs.getString(6);
                   items[6]=rs.getString(7);
                   dt.addRow(items);
                } return true;
        }catch(Exception e){
        System.out.println("Error de lectura: "+ e);}
    return false;
    }
     
     public boolean Buscar(DefaultTableModel dt,Producto p){
        try{
            String[] items=new String[100];
            CallableStatement cSt= cc.conexion().prepareCall("call bProducto(?);");
            cSt.setInt(1, p.getCodigo());
            ResultSet rs=cSt.executeQuery();
                while(rs.next()){
                   items[0]=rs.getString(1);
                   items[1]=rs.getString(2);
                   items[2]=rs.getString(3);
                   items[3]=rs.getString(4);
                   items[4]=rs.getString(5);
                   items[5]=rs.getString(6);
                   items[6]=rs.getString(7);
                   dt.addRow(items);
                } return true;
        }catch(Exception e){
        System.out.println("Error de Buscado: "+ e);}
    return false;
    }
    
    public boolean Insertar(Producto p){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call iProducto(?,?,?,?,?,?);");
        cSt.setString(1, p.getDescripcion());
        cSt.setDouble(2, p.getPrecio());
        cSt.setInt(3, p.getStock());
        cSt.setInt(4, p.getCategoria());
        cSt.setInt(5, p.getMarca());
        cSt.setInt(6, p.getEstado());
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
    

    public boolean Actualizar(Producto p){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call uProducto(?,?,?,?,?,?,?);");
      cSt.setString(1, p.getDescripcion());
        cSt.setDouble(2, p.getPrecio());
        cSt.setInt(3, p.getStock());
        cSt.setInt(4, p.getCategoria());
        cSt.setInt(5, p.getMarca());
        cSt.setInt(6, p.getEstado());
        cSt.setInt(7, p.getCodigo());
    
        cSt.close();
        cc.conexion().close();
       
        return true;
     
            
    }catch(Exception e){
        System.out.println("Error de Modificado: "+ e);
    }
    return false;
    }
    
    
    public boolean Eliminar(Producto p){
    try{
     CallableStatement cSt= cc.conexion().prepareCall("call dProducto(?);");
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
    
    public ArrayList cboProducto(){
    ArrayList items=new ArrayList();
    try{
    CallableStatement cs=cc.conexion().prepareCall("call cboProducto();");
    ResultSet rs=cs.executeQuery();
        while(rs.next()){
            items.add(rs.getString(1));
        }
    }catch(Exception e){}
    
    return items;
    }
    
}
