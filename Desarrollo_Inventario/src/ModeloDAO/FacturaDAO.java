
package ModeloDAO;
import ModeloVO.Clientes;
import java.sql.*;
import  PostgreSQL.*;
import java.util.ArrayList;

public class FacturaDAO {
    
    ConexionBD conexion;

    public FacturaDAO() {
        
        conexion = new ConexionBD();
    }    
    
    
    /**
     * 
     * @param idFactura
     * @param idCliente
     * @param idEmpleado
     * @param hora
     * @param fecha
     * @param totalAPagar
     * @param serial
     * @return 
     */
    public String insertarFactura(String idCliente, String idEmpleado, 
            String hora, String fecha, float totalAPagar) {
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = ("INSERT INTO factura  (idcliente, idempleado, hora,fecha, total_a_Pagar)  Values"
                + "('" +idCliente + "','" + idEmpleado + 
                            "','" + hora + "','" + fecha + "'," +totalAPagar   + ")");
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
    
    
    
}
