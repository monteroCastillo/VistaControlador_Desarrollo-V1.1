/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author ALLCH
 */



public class VistaClientes extends javax.swing.JFrame {
    
    Controlador objControlador;
    private static VistaClientes objVistaClientes;
    
    private VistaClientes(Controlador objControlador) {       
        
        initComponents();
        
        this.objControlador = objControlador;               
    }
    //Patron Singleton
    public  static VistaClientes obtenerVistaClientes(Controlador objControlador){
        
        if(objVistaClientes == null){
            
            objVistaClientes = new VistaClientes(objControlador);            
        }
        return objVistaClientes;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarClientes = new javax.swing.JButton();
        btPrincipalClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel1.setText("Clientes");

        btnMostrarClientes.setText("Mostrar");
        btnMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClientesActionPerformed(evt);
            }
        });

        btPrincipalClientes.setText("Principal");
        btPrincipalClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrincipalClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btPrincipalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnMostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPrincipalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnMostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPrincipalClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincipalClientesActionPerformed
        
        if(objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("usuario")){
            
            VistaSeleccionUsuario obtenerMenuUsuario = VistaSeleccionUsuario.obtenerVistaClientes(objControlador);
            obtenerMenuUsuario.setVisible(true);
            this.dispose();
        }
        else if(objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("admin")  ){
            VistaSeleccionAdmin volverHome= new VistaSeleccionAdmin(objControlador);
            volverHome.setVisible(true);
            this.dispose(); // instruccion que cierra la ventana actual
        }
        else{
            JOptionPane.showMessageDialog(null, "Imposible regresar al Menu Principal \n en este momento");
            
        }
       
    }//GEN-LAST:event_btPrincipalClientesActionPerformed

    private void btnMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClientesActionPerformed
        objControlador.llenarTablaClientes(tablaClientes);
    }//GEN-LAST:event_btnMostrarClientesActionPerformed

    public void mostrar(String[][] arregloEntrada) {


        int numFilas = 4;
        int numCol = 8;
        DefaultTableModel  model = (DefaultTableModel )tablaClientes.getModel();
        model.setRowCount(numFilas);   //Cantidad de filas
        //model.setColumnCount(4);  //cantidad de columnas
        
        //Se agregan los datos del cliente para que aparezcan en el encabezado de la tabla 
        model.addColumn("Nombre");
        model.addColumn("Apellidos");
        model.addColumn("Identificacion");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Ciudad");
        model.addColumn("Email");
        model.addColumn("Publicidad");
        
        for(int i = 0; i<  numFilas; i++){
            
            for (int j =0; j < numCol; j++) {
            
            tablaClientes.setValueAt(arregloEntrada[j][i],i,j); // dato, posicion en x, posicion en y
            
            }
           
        }
       

    }
    
   /**
    * Envia los datos al controlador para crear el nuevo Cliente ingresado
    */ 
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPrincipalClientes;
    public javax.swing.JButton btnMostrarClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
