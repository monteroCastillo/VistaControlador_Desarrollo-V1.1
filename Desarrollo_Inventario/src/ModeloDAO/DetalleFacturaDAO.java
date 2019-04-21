
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
    
    String serialFactura;
    String codigoPrenda;
    int cantidadPrenda;
    int costoPrenda;
        
    public String insertarDetalleFactura(String serialFactura, String codigoPrenda, 
                                            int cantidadPrenda, int costoPrenda  ) {
        //System.out.println("Entro al DAO");
        
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
//       // String consulta = ("INSERT INTO detalleFactura  (nombreProducto, codigoProducto, precioProducto,cantidad, serialFactura)  "
//                            + "Values" + "('" + nombreProducto + "','" + codigoProducto + 
//                            "','" + precioProducto + "','" + cantidad + "','" + serialFactura + "')");
        String consulta = "SELECT llenaTablaDetalle ( " + serialFactura +","+codigoPrenda +
                            "," + cantidadPrenda+ ","+ costoPrenda +")";

        System.out.println(consulta);

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
                             
                
                objDetalleFacturaVO.setSerialFactura(rs.getString(1));
                objDetalleFacturaVO.setCodigoPrenda(rs.getString(2));
                objDetalleFacturaVO.setCantidadPrenda(Integer.parseInt(rs.getString(3)));
                objDetalleFacturaVO.setCostoPrenda(Integer.parseInt(rs.getString(4)));
                                             
                
                listaDetalleFactura.add(objDetalleFacturaVO);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO se encontraron facturas");
        }
        
        return listaDetalleFactura;
    }
    
}
