package PostgreSQl;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
//import static mysql_dbc.db;

public class pgsql_dbc {

    static Connection db;
    static String codigo ="no";
    
    public String getCodigo() {
        return codigo;
    }

    

    public String consultar(String variableConsultada){        
        
        String consulta;
        ResultSet rs;
        String valido = "";
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
                /* Obtenemos una conexi�n a la base de datos */
               //  "postgres","1234"  
               
                db = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Proyecto","postgres","1234");
                connected = true;
            } catch (SQLException se) {
                System.out.println("No se ha podido conectar a la base.");
            }
            if (connected) {

                System.out.println("Ya se ha conectado a la base de datos");

                try {
                    
                    stmt = db.createStatement();
                    consulta = "SELECT nombreempleado FROM empleado   WHERE " + variableConsultada;
                    System.out.println("Esta es la consulta " + consulta);
                    rs = stmt.executeQuery(consulta );
                    while (rs.next()) {
                        valido = rs.getString(1);
                        System.out.println("el valor de la consulta es " +valido);
                        codigo ="ok";
                    }
                    rs.close();

                    /* Cerramos la conexi�n a la base de datos */
                    db.close();
                    System.out.println("Base de datos cerrada");
                } catch (SQLException se) {
                    System.out.println("No se ha podido cerrar la base.");
                }
            }
        } else {
            System.out.println("No se ha podido encontrar el driver JDBC para PostGreSQL.");
        }        
    
        return valido;
    }
    
    /**
     * Saca todos los datos de un cliente a partir de una cedula o nit dado
     * @param variableConsultada
     * @return 
     */
    public ArrayList busqueda(String tabla,String variableConsultada , int numColums){
        
        ArrayList<String> arregloSalida = new ArrayList<String>();  
        String consulta;
        int contador = 0;
        ResultSet rs;                  
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

                try {                    
                    stmt = db.createStatement();                    
              //      consulta = 'SELECT * FROM " + tabla + "WHERE " + variableConsultada + numColumns ;  
              consulta = "SELECT nombrecliente FROM clientes   WHERE " + variableConsultada;
                   System.out.println("La sentencia es: "  + consulta);
                    
                    rs = stmt.executeQuery(consulta);
                    while (rs.next()) {
                        ++contador;
                        for(int i = 1; i<=numColums; i++)
                            arregloSalida.add(rs.getString(i));                    
                                                
                        System.out.println("el valor del contador es " + contador);                       
                    }          
                                      
                    rs.close();
                    /* Cerramos la conexi�n a la base de datos */
                    db.close();                  
                    
                    System.out.println("Base de datos cerrada");
                    
                    
                } catch (SQLException se) {
                    System.out.println("No se ha podido cerrar la base.");
                }
            }
        } else {
            System.out.println("No se ha podido encontrar el driver JDBC para PostGreSQL.");
        }
        
        System.out.println("El tama�o del arrayList es: " + arregloSalida.size());
        return arregloSalida;
    }
    
    /**
     * Saca todos los datos de un cliente a partir de una cedula o nit dado
     * @param variableConsultada
     * @return 
     */
    public ArrayList mostrarTablaCompleta(String tabla , int numColums){
        System.out.println("tabla "+ tabla);
        ArrayList<String> arregloSalida = new ArrayList<String>();  
        String consulta;
        int contador = 0;
        ResultSet rs;                  
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

                try {                    
                    stmt = db.createStatement();                    
              //      consulta = 'SELECT * FROM " + tabla + "WHERE " + variableConsultada + numColumns ;  
              consulta = "SELECT *FROM " +tabla;
                    System.out.println("La sentencia para mostrar toda la tabla es: "  + consulta);
                    
                    rs = stmt.executeQuery(consulta);
                    while (rs.next()) {
                        ++contador;
                        for(int i = 1; i<=numColums; i++)
                            arregloSalida.add(rs.getString(i));                    
                                                
                        System.out.println("el valor del contador es " + contador);                       
                    }          
                                      
                    rs.close();
                    /* Cerramos la conexi�n a la base de datos */
                    db.close();                  
                    
                    System.out.println("Base de datos cerrada");
                    
                    
                } catch (SQLException se) {
                    System.out.println("No se ha podido cerrar la base.");
                }
            }
        } else {
            System.out.println("No se ha podido encontrar el driver JDBC para PostGreSQL.");
        }
        
        System.out.println("El tamanio del arrayList es: " + arregloSalida.size());
        return arregloSalida;
    }
    /**
     * llena la tabla  correspondiente con las tuplas ingresadas en la intefaz grafica
     * @param tupla
     * @return 
     */
    public String llenaTabla(String tupla) {

        ResultSet rs;
        String valido = "";
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
                db = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Proyecto", "postgres", "1234");
                connected = true;
            } catch (SQLException se) {
                System.out.println("No se ha podido conectar a la base.");
            }
            if (connected) {

                System.out.println("Ya se ha conectado a la base de datos");

                try {

                    stmt = db.createStatement();
                    rs = stmt.executeQuery(tupla);
                    while (rs.next()) {                        
                        System.out.println("el valor de la consulta es ");                        
                    } 
                    rs.close();                       
                    /* Cerramos la conexi�n a la base de datos */
                    db.close();
                    System.out.println("Base de datos cerrada");
                } catch (SQLException se) {
                    System.out.println("No se ha podido cerrar la base.");
                }
            }
        } else {
            System.out.println("No se ha podido encontrar el driver JDBC para PostGreSQL.");
        }

        return valido;
    }
    /**
     * Actualiza el valor seleccionado
     * @param variableConsultada
     * @return 
     */
    public ArrayList actualizar(String variableConsultada){
        
        ArrayList<String> arregloSalida = new ArrayList<String>();     
        String consulta;
        ResultSet rs;
        String valido = "";
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

                try {                    
                    stmt = db.createStatement();
                    consulta =  variableConsultada;
                    System.out.println("La sentencia es: "  + consulta);
                    
                    rs = stmt.executeQuery(consulta );
                    while (rs.next()) {
                        arregloSalida.add(rs.getString(1)); 
                        valido = rs.getString(1);
                        System.out.println("el valor de la consulta es " +valido);
                        codigo ="ok";
                    }
                    rs.close();

                    /* Cerramos la conexi�n a la base de datos */
                    db.close();
                    
                    
                    System.out.println("Base de datos cerrada");
                    
                    
                } catch (SQLException se) {
                    System.out.println("No se ha podido cerrar la base.");
                }
            }
        } else {
            System.out.println("No se ha podido encontrar el driver JDBC para PostGreSQL.");
        }
        
    
        return arregloSalida;
    }
    /**
     * Recibe directamente la consulta de
     * @param consulta
     * @return 
     */
    public ArrayList generico(String consulta){
        
        ArrayList<String> arregloSalida = new ArrayList<String>();     
       
        ResultSet rs;
        String valido = "";
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

                try {                    
                    stmt = db.createStatement();
                    
                    System.out.println("La sentencia es: "  + consulta);
                    
                    rs = stmt.executeQuery(consulta );
                    while (rs.next()) {
                        arregloSalida.add(rs.getString(1)); 
                        valido = rs.getString(1);
                        System.out.println("el valor de la consulta es " +valido);
                        codigo ="ok";
                    }
                    rs.close();

                    /* Cerramos la conexi�n a la base de datos */
                    db.close();
                    
                    
                    System.out.println("Base de datos cerrada");
                    
                    
                } catch (SQLException se) {
                    System.out.println("No se ha podido cerrar la base.");
                }
            }
        } else {
            System.out.println("No se ha podido encontrar el driver JDBC para PostGreSQL.");
        }
        
    
        return arregloSalida;
    }
    
       public ArrayList tupla(String consulta , int numColums){
        
        ArrayList<String> arregloSalida = new ArrayList<>();  
       
        int contador = 0;
        ResultSet rs;                  
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

                try {                    
                    stmt = db.createStatement();                    
              //      consulta = 'SELECT * FROM " + tabla + "WHERE " + variableConsultada + numColumns ;  
              //consulta = "SELECT nombrecliente FROM clientes   WHERE " + variableConsultada;
                   System.out.println("La sentencia es: "  + consulta);
                    
                    rs = stmt.executeQuery(consulta);
                    while (rs.next()) {
                        ++contador;
                        for(int i = 1; i<=numColums; i++)
                            arregloSalida.add(rs.getString(i));                    
                                                
                        System.out.println("el valor del contador es " + contador);                       
                    }          
                                      
                    rs.close();
                    /* Cerramos la conexi�n a la base de datos */
                    db.close();                  
                    
                    System.out.println("Base de datos cerrada");
                    
                    
                } catch (SQLException se) {
                    System.out.println("No se ha podido cerrar la base.");
                }
            }
        } else {
            System.out.println("No se ha podido encontrar el driver JDBC para PostGreSQL.");
        }
        
        System.out.println("El tama�o del arrayList es: " + arregloSalida.size());
        return arregloSalida;
    }
 
}
