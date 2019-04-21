/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ProveedorVO;
import ModeloVO.PrendaVO;
import PostgreSQL.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PrendaDAO {
    ConexionBD conexion;

    public PrendaDAO() {
        conexion = new ConexionBD();
    }
    
    
    public String insertarPrenda(String nombrePrenda,String codigoPrenda, int costoPrenda){
                                  
        String respuestaRegistro = "";
        Connection db = null;
        Statement stmt;
        String consulta = "SELECT llenaTablaPrenda('" + nombrePrenda + "','" + codigoPrenda + "','" + costoPrenda +  "')";
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
    
    public ArrayList<PrendaVO> listarPrenda(){
        
        ArrayList listaPrenda = new ArrayList();
        PrendaVO prenda;
        try {
            Connection accesoDB = conexion.getConexion();
            PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM prenda");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                prenda = new PrendaVO();                
                prenda.setNombrePrenda(rs.getString(1));
                prenda.setCodigoPrenda(rs.getString(2));
                prenda.setCostoPrenda(Integer.parseInt(rs.getString(3)));            
                               
                listaPrenda.add(prenda);
            }
        } catch (Exception e) {
        }
        
        return listaPrenda;
    }
    
}
