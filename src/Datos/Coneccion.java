/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author andyv
 */
public class Coneccion {
   public Connection conexion(){
         Connection connection=null;
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/BDOeshle","root", "980101627");
        
        }catch(Exception ex){
            System.out.println("Error al registrar el driver de MySQL: " + ex);
        }
            return connection;
    } 
}
