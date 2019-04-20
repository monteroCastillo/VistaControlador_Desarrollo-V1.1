/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ProveedorVO;
import PostgreSQL.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ALLCH
 */
public class ProveedorDAO {
    ConexionBD conexion;

    public ProveedorDAO() {
        conexion = new ConexionBD();
    }    
    
    public String insertarProveedor(String nombreProveedor,String nit, String direccionProveedor, 
                                  String telefonoProveedor,String ciudad,String email){
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = "SELECT llenaTablaProveedor('" + nombreProveedor + "','" + nit + "','" + direccionProveedor + "','" + telefonoProveedor + "','" + ciudad + "','" + email  +  "')";
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: ");

            ResultSet rs = stmt.executeQuery(consulta);

            accesoDB.close();

            System.out.println("Base de datos cerrada");

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base.");
        }

        return respuestaRegistro;
    }
    
    public ArrayList<ProveedorVO> listarProveedores(){
        
        ArrayList listaProveedores = new ArrayList();
        ProveedorVO proveedor;
        try {
            Connection accesoDB = conexion.getConexion();
            PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM proveedores");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                proveedor = new ProveedorVO();
                
                proveedor.setNombreProveedor(rs.getString(1));
                proveedor.setNit(rs.getString(2));
                proveedor.setDireccioProveedor(rs.getString(3));
                proveedor.setTelefonoProveedor(rs.getString(4));
                proveedor.setCiudad(rs.getString(5));
                proveedor.setEmail(rs.getString(6));
                

                
                listaProveedores.add(proveedor);
            }
        } catch (Exception e) {
        }
        
        return listaProveedores;
    }
    
    
    public String actualizarProveedor(String nombreProveedor,String nit, String direccionProveedor, 
                                  String telefonoProveedor,String ciudad,String email){
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = "UPDATE proveedores SET  nombreProveedor = '" + nombreProveedor + "', nit= '" + nit + "',direccionProveedor= '" + 
                            direccionProveedor + "', telefonoProveedor ='" + telefonoProveedor + "', ciudad ='" + ciudad + 
                            "', email= '" + email + "' WHERE nit = '" + nit +"'";
        System.out.println("Consulta desde DAO " + consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: " +consulta);

            ResultSet rs = stmt.executeQuery(consulta);

            accesoDB.close();

            System.out.println("Base de datos cerrada");

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base.");
        }

        return respuestaRegistro;
    }
    
    public String eliminarProveedor(String nit){

        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = "DELETE FROM proveedores WHERE cedula = '" + nit+"';";
                
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: ");

            ResultSet rs = stmt.executeQuery(consulta);

            accesoDB.close();

            System.out.println("Base de datos cerrada");

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base.");
        }

        return respuestaRegistro;
    }
    
    
    public ArrayList<ProveedorVO> listarReportes(){
        
        ArrayList listaProveedores = new ArrayList();
        ProveedorVO proveedor;
        try {
            Connection accesoDB = conexion.getConexion();
            PreparedStatement ps = accesoDB.prepareStatement("select  nombreproducto, sum(cantidad) as total from detallefactura group by\n" +
                           "nombreproducto order by total desc limit 5");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                proveedor = new ProveedorVO();
                
                proveedor.setNombreProveedor(rs.getString(1));
                proveedor.setNit(rs.getString(2));
               
                
                

                
                listaProveedores.add(proveedor);
            }
        } catch (Exception e) {
        }
        
        return listaProveedores;
    }
    
    
    
}
