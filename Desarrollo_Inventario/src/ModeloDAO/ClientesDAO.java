/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;
import ModeloVO.Clientes;
import java.sql.*;
import  PostgreSQL.*;
import java.util.ArrayList;
/**
 *
 * @author ALLCH
 */
public class ClientesDAO {
    
    ConexionBD conexion;

    public ClientesDAO() {
        conexion = new ConexionBD();
    }
    /**
     * 
     * @param nombreCliente
     * @param apellidos
     * @param idCliente
     * @param direccion
     * @param telefono
     * @param ciudad
     * @param email
     * @param publicidad
     * @return 
     */
    public String insertarCliente(String nombreCliente,  String idCliente,
            String direccion, String telefono, String ciudad, String email, String publicidad) {
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = ("SELECT llenaTablaClientes ('" + nombreCliente  + "','" + idCliente + "','" + direccion + "','" + telefono + "','" + ciudad + "','" + email + "','" + publicidad + "')");
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: ");

            ResultSet rs = stmt.executeQuery(consulta);

            accesoDB.close();

            System.out.println("Base de datos cerrada");
            
            respuestaRegistro = "Cliente Creado Exitosamente";

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base.");
        }

        return respuestaRegistro;
    }
    
    /**
     * 
     * @return 
     */
    
    public ArrayList<Clientes> listarClientes(){
        
        ArrayList listaClientes = new ArrayList();
        Clientes clientes;
        try {
            Connection accesoDB = conexion.getConexion();
            PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM clientes");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                clientes = new Clientes();
                
                clientes.setNombreCliente(rs.getString(1));                
                clientes.setIdCliente(rs.getString(2));
                clientes.setDireccion(rs.getString(3));
                clientes.setTelefono(rs.getString(4));
                clientes.setCiudad(rs.getString(5));
                clientes.setEmail(rs.getString(6));
                clientes.setPublicidad(rs.getString(7));
                
                listaClientes.add(clientes);
            }
        } catch (Exception e) {
        }
        
        return listaClientes;
    }
    
    public String actualizarCliente(String nombreCliente,  String idCliente,
            String direccion, String telefono, String ciudad, String email, String publicidad) {
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = ("SELECT llenaTablaClientes ('" + nombreCliente  + "','" + idCliente + "','" + direccion + "','" + telefono + "','" + ciudad + "','" + email + "','" + publicidad + "')");
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: ");

            ResultSet rs = stmt.executeQuery(consulta);

            accesoDB.close();

            System.out.println("Base de datos cerrada");
            
            respuestaRegistro = "Cliente Creado Exitosamente";

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base.");
        }

        return respuestaRegistro;
    }
    
    
    
    /**
     * consulta los datos de un cliente a partir de la cedula o nit
     * @param consulta
     * @return 
     */
    public ArrayList<Clientes> listarClienteFactura(String consulta){
        
        ArrayList listaClientes = new ArrayList();
       
        Clientes clientes;
        try {
            Connection accesoDB = conexion.getConexion();
            PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM clientes WHERE ced_nit_cliente = '" + consulta +"'" );
            System.out.println("La sentencia es: " +ps);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                clientes = new Clientes();
                
                clientes.setNombreCliente(rs.getString(1));
               
                clientes.setIdCliente(rs.getString(2));
                clientes.setDireccion(rs.getString(3));
                clientes.setTelefono(rs.getString(4));
                clientes.setCiudad(rs.getString(5));
                clientes.setEmail(rs.getString(6));
                clientes.setPublicidad(rs.getString(7));
                
                listaClientes.add(clientes);
            }
        } catch (Exception e) {
        }
        
        return listaClientes;
    }
    
    
    
}
    

