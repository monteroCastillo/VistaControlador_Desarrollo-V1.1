/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;
import ModeloVO.EmpleadoVO;
import  PostgreSQL.*;
import  java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ALLCH
 */
public class EmpleadoDAO {
    ConexionBD conexion;

    public EmpleadoDAO() {
        conexion = new ConexionBD();
        
       
    }
    /**
     * 
     * @param nombreEmpleado
     * @param cedula
     * @param usuario
     * @param clave
     
     * @param tipoEmpleado
     * @return 
     */
    public String insertarEmpleado(String nombreEmpleado,String cedula, String usuario, 
                                  String clave,String tipoEmpleado){
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = "SELECT llenaTablaEmpleado('" + nombreEmpleado + "','" + cedula + "','" + usuario + "','" + clave + "','"  + "','" + tipoEmpleado +  "')";
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
     * Muestra los empleados en una tabla
     * @return 
     */
    public ArrayList<EmpleadoVO> listarEmpleados(){
        
        ArrayList listaEmpleados = new ArrayList();
        EmpleadoVO empleado;
        try {
            Connection accesoDB = conexion.getConexion();
            PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM empleado");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                empleado = new EmpleadoVO();
                
                empleado.setNombreEmpleado(rs.getString(1));
                empleado.setCedula(rs.getString(2));
                empleado.setUsuario(rs.getString(3));
                empleado.setClave(rs.getString(4));                
                empleado.setTipoEmpleado(rs.getString(7));

                
                listaEmpleados.add(empleado);
            }
        } catch (Exception e) {
        }
        
        return listaEmpleados;
    }
    
    
    public String actualizarEmpleado(String nombreEmpleado,String cedula, String usuario, 
                                  String clave,String tipoEmpleado){

        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = "UPDATE empleado SET  nombreEmpleado = '" + nombreEmpleado + "', cedula= '" + cedula 
                            + "',usuario= '" + usuario + "', clave ='" + clave  + 
                             "', tipoEmpleado= '" + tipoEmpleado + "' WHERE cedula = '" + cedula +"'";       
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
    
    public String eliminarEmpleado(String cedula){

        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = "DELETE FROM empleado WHERE cedula = '" + cedula + "';";
                
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
