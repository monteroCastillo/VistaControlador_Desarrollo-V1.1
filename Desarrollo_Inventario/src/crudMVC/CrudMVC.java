/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudMVC;


import Visualizacion.*;

import Controlador.*;
import Modelo.*;

/**
 *
 * @author ALLCH
 */
public class CrudMVC {


    public static void main(String[] args) {
    
        Controlador controlaC = new Controlador();
        Login objLogin = new Login(controlaC);
//       DashBoard objDashboard = new DashBoard(controlaC);
  //      VisualizarClientes vistaClientes = new VisualizarClientes(controlaC);
//        VisualizarProductos vistaProductos = new VisualizarProductos(controlaC);
//        ClientesDAO objClientesDAO = new ClientesDAO(controlaC);
//        Crear objCrear = new Crear(controlaC);
        //Autenticacion  objAutenticacion =new Autenticacion();
        
       //Controlador controlaC = new Controlador(vistaClientes, objClientesDAO, objCrear);// vistaProductos );//, objAutenticacion);
        
        
        //objDashboard.setVisible(true);
        //objAutenticacion.setVisible(true);
      // vistaClientes.setVisible(true);
       objLogin.setVisible(true);
        
    }
}
