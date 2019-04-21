/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudMVC;


import Vista.Login;
import Vista.VistaMenuAdmin;

import Controlador.*;

/**
 *
 * @author ALLCH
 */
public class CrudMVC {

    public static void main(String[] args) {

        Controlador controlaC = new Controlador();
        Login objLogin = new Login(controlaC);
        
        VistaMenuAdmin objMenu = new VistaMenuAdmin(controlaC);
        
       // objLogin.setVisible(true);
        objMenu.setVisible(true);
        
        

    }
}

