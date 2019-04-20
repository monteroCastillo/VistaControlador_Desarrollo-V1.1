/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class VistaCrearEmpleado extends javax.swing.JFrame {
    
    Controlador objControlador;
    private static VistaCrearEmpleado objEmpleado;
    
    private VistaCrearEmpleado(Controlador objControlador) {
        initComponents();
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        
        btnActualizarEmpleado.setEnabled(false);
        btnEliminarEmpleado.setEnabled(false);
        btnCrearEmpleado.setEnabled(true);
    }

    //Patron Singleton
    public static VistaCrearEmpleado obtenerEmpleado(Controlador objControlador) {
        
        if (objEmpleado == null) {
            
            objEmpleado = new VistaCrearEmpleado(objControlador);
            
        }
        return objEmpleado;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txNombreEmp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txCedulaEmpleado = new javax.swing.JTextField();
        txClaveEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txDireccionEmpleado = new javax.swing.JTextField();
        txTelefonoEmpleado = new javax.swing.JTextField();
        btnCrearEmpleado = new javax.swing.JButton();
        txUsuarioEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboTipoEmpleado = new javax.swing.JComboBox<String>();
        jLabel14 = new javax.swing.JLabel();
        btnActualizarEmpleado = new javax.swing.JButton();
        btnMostrarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaEmpleadoA_B = new javax.swing.JTable();
        btnPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setText("Crear Nuevo Empleado");

        jLabel2.setText("Nombre");

        jLabel3.setText("Cedula");

        jLabel4.setText("Clave");

        jLabel5.setText("Direccion");

        jLabel7.setText("Telefono");

        btnCrearEmpleado.setText("Crear");
        btnCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jComboTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "usuario", "admin" }));
        jComboTipoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel14.setText("Tipo empleado");

        btnActualizarEmpleado.setText("Actualizar");
        btnActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpleadoActionPerformed(evt);
            }
        });

        btnMostrarEmpleado.setText("Mostrar");
        btnMostrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setText("Eliminar");
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnMostrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txNombreEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txCedulaEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txClaveEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txDireccionEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txTelefonoEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txUsuarioEmpleado, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNombreEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txClaveEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearEmpleado)
                    .addComponent(btnActualizarEmpleado)
                    .addComponent(btnMostrarEmpleado)
                    .addComponent(btnEliminarEmpleado))
                .addContainerGap())
        );

        tablaEmpleadoA_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEmpleadoA_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadoA_BMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaEmpleadoA_B);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        jTabbedPane1.addTab("Empleado", jPanel1);

        btnPrincipal.setText("Principal");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        if (objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("usuario")) {
            
            VistaMenuUsuario obtenerMenuUsuario = VistaMenuUsuario.obtenerVistaClientes(objControlador);
            obtenerMenuUsuario.setVisible(true);
            this.dispose();
        } else if (objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("admin")) {
            VistaMenuAdmin volverHome = new VistaMenuAdmin(objControlador);
            volverHome.setVisible(true);
            this.dispose(); // instruccion que cierra la ventana actual
        } else {
            JOptionPane.showMessageDialog(null, "Imposible regresar al Menu Principal \n en este momento");
            
        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void tablaEmpleadoA_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadoA_BMouseClicked
        int row = tablaEmpleadoA_B.rowAtPoint(evt.getPoint());

        String d = JOptionPane.showInputDialog("Desea Actualizar o borrar ");
        if (d == null) {
            System.out.println("El valor de la variable d es : " + d);
        } else {
            btnActualizarEmpleado.setEnabled(true);
            btnEliminarEmpleado.setEnabled(true);
            btnCrearEmpleado.setEnabled(false);
            datosTablaEmpleado(row);
        }
    }//GEN-LAST:event_tablaEmpleadoA_BMouseClicked

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        enviarDatosEmpleados(3);
        limpiarEmpleado();
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnMostrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEmpleadoActionPerformed
        objControlador.llenarTablaEmpleados(tablaEmpleadoA_B);
    }//GEN-LAST:event_btnMostrarEmpleadoActionPerformed

    private void btnActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoActionPerformed
        enviarDatosEmpleados(2);
        limpiarEmpleado();
    }//GEN-LAST:event_btnActualizarEmpleadoActionPerformed

    private void btnCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoActionPerformed
        enviarDatosEmpleados(1);
    }//GEN-LAST:event_btnCrearEmpleadoActionPerformed
    
    public void enviarDatosEmpleados(int opcion) {
        
        ArrayList<String> arrayEmpleadoNuevo = new ArrayList<>();
        
        String tipoEmpleado;
        tipoEmpleado = jComboTipoEmpleado.getSelectedItem().toString();
        
        arrayEmpleadoNuevo.add(txNombreEmp.getText());
        arrayEmpleadoNuevo.add(txCedulaEmpleado.getText());
        arrayEmpleadoNuevo.add(txUsuarioEmpleado.getText());
        arrayEmpleadoNuevo.add(txClaveEmpleado.getText());
        arrayEmpleadoNuevo.add(txDireccionEmpleado.getText());
        arrayEmpleadoNuevo.add(txTelefonoEmpleado.getText());
        arrayEmpleadoNuevo.add(tipoEmpleado);
        
        switch (opcion) {
            case 1:
                objControlador.crearEmpleado(arrayEmpleadoNuevo);
                break;
            case 2:
                objControlador.actualizarEmpleado(arrayEmpleadoNuevo);
                break;
            case 3:
                objControlador.eliminarEmpleado(txCedulaEmpleado.getText());
                break;
            default:
                break;
        }
    }
    
  
    public void datosTablaEmpleado(int row) {
        
        String nombreEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 0));
        String idEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 1));
        String usuarioEmpleado = (String.valueOf(tablaEmpleadoA_B.getValueAt(row, 2)));
        String claveEmpleado= (String.valueOf(tablaEmpleadoA_B.getValueAt(row, 3)));
        String direccionEmpleado = (String.valueOf(tablaEmpleadoA_B.getValueAt(row, 4)));
        String telEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 5));
        String tipoEmpleado = ((String) tablaEmpleadoA_B.getValueAt(row, 6));
        
        txNombreEmp.setText(nombreEmpleado);
        txCedulaEmpleado.setText(idEmpleado);
        txUsuarioEmpleado.setText(usuarioEmpleado);
         txClaveEmpleado.setText(claveEmpleado);
        txDireccionEmpleado.setText(direccionEmpleado);
        txTelefonoEmpleado.setText(telEmpleado);       
        jComboTipoEmpleado.setSelectedItem(tipoEmpleado);
    }
    
    
    
    public void limpiarEmpleado(){
        
        txNombreEmp.setText("");
        txCedulaEmpleado.setText("");
        txUsuarioEmpleado.setText("");
        txClaveEmpleado.setText("");
        txDireccionEmpleado.setText("");
        txTelefonoEmpleado.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEmpleado;
    private javax.swing.JButton btnCrearEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnMostrarEmpleado;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JComboBox<String> jComboTipoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaEmpleadoA_B;
    private javax.swing.JTextField txCedulaEmpleado;
    private javax.swing.JTextField txClaveEmpleado;
    private javax.swing.JTextField txDireccionEmpleado;
    private javax.swing.JTextField txNombreEmp;
    private javax.swing.JTextField txTelefonoEmpleado;
    private javax.swing.JTextField txUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
