/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import  PostgreSQL.*;
import java.util.ArrayList;

/**
 *
 * @author ALLCH
 */


			

public class ProductoDAO {
   ConexionBD conexion;

    public ProductoDAO( ){
        conexion = new ConexionBD();
    }
    
    public String insertarProducto(String nombreProducto,String codProducto, float cantidad, float valorCompraProducto,
                                   float valorVentaProducto,String proveedor, String descripcion) {
        String respuestaRegistro = null;
        Connection db = null;
        Statement stmt;
        String consulta = ("SELECT llenatablaproducto ('" + nombreProducto + "','" + codProducto + "','" + 
                            cantidad + "','" + valorCompraProducto + "','" + valorVentaProducto + "','" + proveedor + "','" + descripcion+ "')");
        System.out.println(consulta);

        try {

            Connection accesoDB = conexion.getConexion();
            stmt = accesoDB.createStatement();

            System.out.println("La sentencia es: " + consulta);

            ResultSet rs = stmt.executeQuery(consulta);

            accesoDB.close();

            System.out.println("Base de datos cerrada");

        } catch (SQLException se) {
            System.out.println("No se ha podido cerrar la base.");
        }

        return respuestaRegistro;
    }
    
    public ArrayList<Productos> listarProductos(String consulta){
        
        ArrayList listaProductos = new ArrayList();
        Productos objProductos;
        try {
            Connection accesoDB = conexion.getConexion();
            //PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM producto");
            PreparedStatement ps = accesoDB.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){


                objProductos = new Productos();
                
                objProductos.setNombreProducto(rs.getString(1));
                objProductos.setCodigoProducto(rs.getString(2));
                objProductos.setCantidad(Float.parseFloat(rs.getString(3)));
                objProductos.setValorCompraProd(Float.parseFloat(rs.getString(4)));
                objProductos.setValorVentaProd(Float.parseFloat(rs.getString(5)));
                objProductos.setProveedor(rs.getString(6));
                objProductos.setDescripcion(rs.getString(7));
               
                
                listaProductos.add(objProductos);
            }
        } catch (Exception e) {
        }
        
        return listaProductos;
    }
    
}
