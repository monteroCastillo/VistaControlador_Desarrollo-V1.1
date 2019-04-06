/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.DetalleFacturaVO;
import java.sql.*;
import  PostgreSQL.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author ALLCH
 */
public class DetalleFacturaDAO {
    
    ConexionBD conexion;

    public DetalleFacturaDAO() {
        
        conexion = new ConexionBD();
    } 
        
    public String insertarDetalleFactura(String nombreProducto, String codigoProducto, Float 
                                         precioProducto, int cantidad, String serialFactura) {
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = ("INSERT INTO detalleFactura  (nombreProducto, codigoProducto, precioProducto,cantidad, serialFactura)  "
                            + "Values" + "('" + nombreProducto + "','" + codigoProducto + 
                            "','" + precioProducto + "','" + cantidad + "','" + serialFactura + "')");
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
    
    public ArrayList<DetalleFacturaVO> listarDetalleFacturaDAO(String consulta){
        
        ArrayList<DetalleFacturaVO> listaDetalleFactura = new ArrayList();
        DetalleFacturaVO objDetalleFacturaVO;
        try {
            Connection accesoDB = conexion.getConexion();
            //PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM producto");
            PreparedStatement ps = accesoDB.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){


                objDetalleFacturaVO = new DetalleFacturaVO();
                
                objDetalleFacturaVO.setNombreProducto(rs.getString(1));
                objDetalleFacturaVO.setCodigoProducto(rs.getString(2));
                objDetalleFacturaVO.setPrecioProducto(Float.parseFloat(rs.getString(3)));
                objDetalleFacturaVO.setCantidad(Integer.parseInt(rs.getString(4)));
                objDetalleFacturaVO.setSerialFactura(rs.getString(5));
                
               
                
                listaDetalleFactura.add(objDetalleFacturaVO);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO se encontraron facturas");
        }
        
        return listaDetalleFactura;
    }
    
}
