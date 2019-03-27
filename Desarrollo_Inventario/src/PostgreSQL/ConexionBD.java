/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostgreSQL;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ALLCH
 */
public class ConexionBD {

    public ConexionBD() {
    }
    
//    public Connection getConexion(){
//        
//        Connection dataBase = null;
//        try {
//            System.out.println("Conectando a la base de datos!");
//            Class.forName("org.postgresql.Driver").newInstance();
//            dataBase = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Proyecto","postgres","1234");
//            System.out.println("Entro a conexion");
//                } catch (Exception e) {
//                     System.out.println("No se ha podido conectar a la base.");
//                }
//        return dataBase;
//    }
    
    
        public Connection getConexion(){
        
        Connection dataBase = null;
        try {
            System.out.println("Conectando a la base de datos!");
            Class.forName("org.postgresql.Driver").newInstance();
            dataBase = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Proyecto","postgres","1234");
            System.out.println("Entro a conexion");
                } catch (Exception e) {
                     System.out.println("No se ha podido conectar a la base.");
                }
        return dataBase;
    }
        
        
    public String guardarBD(String variableConsultada){
        
        Connection db = null;
        ArrayList<String> arregloSalida = new ArrayList<String>();     
        String consulta;
        ResultSet rs;
       
        boolean returnexec = false;
        Statement stmt;

        boolean error_loading_driver = false;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException cnfe) {
            error_loading_driver = true;
        }

        if (!error_loading_driver) {
            boolean connected = false;
            try {
                System.out.println("Conectando a la base de datos!");                
                db = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Proyecto","postgres","1234");
                connected = true;
            } catch (SQLException se) {
                System.out.println("No se ha podido conectar a la base.");
            }
            if (connected) {

                System.out.println("Ya se ha conectado a la base de datos");

               
            }
        } else {
            System.out.println("No se ha podido encontrar el driver JDBC para PostGreSQL.");
        }
        
    
        return "";
    }

}
