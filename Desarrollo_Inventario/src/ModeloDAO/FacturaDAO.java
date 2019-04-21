
package ModeloDAO;
import ModeloVO.Clientes;
import ModeloVO.DetalleFacturaVO;
import ModeloVO.FacturaVO;
import java.sql.*;
import  PostgreSQL.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FacturaDAO {
    
    ConexionBD conexion;

    public FacturaDAO() {
        
        conexion = new ConexionBD();
    }    
    
    
    
    
    public String insertarFactura(int idFactura, String idCliente, String  idEmpleado,
                                  String fecha, int totalPrendas, String tipoPago, String estadoPrenda,
                                  String fechaEntrega, Float totalA_Pagar ) {
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        //String consulta = ("INSERT INTO factura  (idFactura, idcliente, idempleado, hora,fecha, total_a_Pagar)  Values"
//                + "('" +idFactura + "','" +idCliente + "','" + idEmpleado + 
//                            "','" + hora + "','" + fecha + "'," +totalAPagar   + ")");
       
        String  consulta = "SELECT llenaTablaFactura (" +idFactura+ ",'" + idCliente + "','" + idEmpleado +
                            "','" + fecha+"'," +totalPrendas +", '" + tipoPago +"', '" + estadoPrenda +"','"+
                            fechaEntrega + "'," + totalA_Pagar + ")";
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
    
    /**
     * 
     * @param consulta = "SELECT * FROM factura WHERE idfactura = ' '  ";
     * @return 
     */
    public ArrayList<FacturaVO> listarFacturasDAO(String consulta){
        
        
        
        ArrayList<FacturaVO> listaFacturas = new ArrayList();
        FacturaVO objFacturaVO;
        try {
            Connection accesoDB = conexion.getConexion();
            //PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM producto");
            PreparedStatement ps = accesoDB.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                
                objFacturaVO = new FacturaVO();
                
                objFacturaVO.setIdFactura(Integer.parseInt(rs.getString(1)));
                objFacturaVO.setIdCliente(rs.getString(2));
                objFacturaVO.setIdEmpleado(rs.getString(3));
                objFacturaVO.setFecha((rs.getString(4)));
                objFacturaVO.setTotalPrendas(Integer.parseInt(rs.getString(5)));
                objFacturaVO.setTipoPago(rs.getString(6));
                objFacturaVO.setEstadoPrenda(rs.getString(7));
                objFacturaVO.setFechaEntrega(rs.getString(8));
                objFacturaVO.setTotalA_Pagar(Float.parseFloat(rs.getString(9)));            
                               
                listaFacturas.add(objFacturaVO);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos de la factura \n no se pueden cargar en este momento");
        }
        
        return listaFacturas;
    }
    
    
    
}
