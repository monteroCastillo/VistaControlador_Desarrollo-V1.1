/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class VistaEmpleadoProveedor extends javax.swing.JFrame {
    
    Controlador objControlador;
    private static VistaEmpleadoProveedor objEmpleado;
    
    private VistaEmpleadoProveedor(Controlador objControlador) {
        initComponents();
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        btnActualizarProveedores.setEnabled(false);
        btnEliminarProveedores.setEnabled(false);
        btnActualizarEmpleado.setEnabled(false);
        btnEliminarEmpleado.setEnabled(false);
        btnCrearEmpleado.setEnabled(true);
    }

    //Patron Singleton
    public static VistaEmpleadoProveedor obtenerEmpleado(Controlador objControlador) {
        
        if (objEmpleado == null) {
            
            objEmpleado = new VistaEmpleadoProveedor(objControlador);
            
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txNombreProveedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txNitProveedor = new javax.swing.JTextField();
        txtelefonoProveedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txCiudadProveedor = new javax.swing.JTextField();
        txEmailProveedor = new javax.swing.JTextField();
        btnCrearProveedor = new javax.swing.JButton();
        txDireccionProveedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProveedoresA_B = new javax.swing.JTable();
        btnActualizarProveedores = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnEliminarProveedores = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnMostrarProveedores = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
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

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton1.setText("Colaboradores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vista Empleado", jPanel2);

        jLabel6.setText("Nombre");

        jLabel8.setText("Nit");

        jLabel9.setText("Telefono");

        jLabel11.setText("Ciudad");

        jLabel13.setText("E-mail");

        btnCrearProveedor.setText("Crear");
        btnCrearProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProveedorActionPerformed(evt);
            }
        });

        jLabel15.setText("Direccion");

        tablaProveedoresA_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProveedoresA_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedoresA_BMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaProveedoresA_B);

        btnActualizarProveedores.setText("Actualizar");
        btnActualizarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProveedoresActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminarProveedores.setText("Eliminar");
        btnEliminarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txNitProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtelefonoProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txCiudadProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txEmailProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txDireccionProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txNombreProveedor)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnCrearProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnActualizarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnEliminarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txCiudadProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txEmailProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearProveedor)
                    .addComponent(btnActualizarProveedores)
                    .addComponent(btnMostrar)
                    .addComponent(btnEliminarProveedores))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel12.setText("Crear Nuevo Proveedor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );

        jTabbedPane1.addTab("Proveedor", jPanel3);

        btnMostrarProveedores.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnMostrarProveedores.setText("Mostrar Proveedores");
        btnMostrarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProveedoresActionPerformed(evt);
            }
        });

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaProveedores);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vista Proveedores", jPanel4);

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

    private void btnCrearProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProveedorActionPerformed
        enviarDatosProveedores(1);
    }//GEN-LAST:event_btnCrearProveedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        objControlador.llenarTablaEmpleados(tablaEmpleados);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoActionPerformed
        enviarDatosEmpleados(1);
    }//GEN-LAST:event_btnCrearEmpleadoActionPerformed

    private void btnMostrarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProveedoresActionPerformed
        objControlador.llenarTablaProveedores(tablaProveedores);
    }//GEN-LAST:event_btnMostrarProveedoresActionPerformed

    private void tablaProveedoresA_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresA_BMouseClicked
        int row = tablaProveedoresA_B.rowAtPoint(evt.getPoint());
        
        String d = JOptionPane.showInputDialog("Desea Actualizar o borrar ");
        if (d == null) {
            System.out.println("El valor de la variable d es : " + d);
        } else {
            btnActualizarProveedores.setEnabled(true);
            btnEliminarProveedores.setEnabled(true);
            datosTablaProveedor(row);
        }
    }//GEN-LAST:event_tablaProveedoresA_BMouseClicked

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        objControlador.llenarTablaProveedores(tablaProveedoresA_B);
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnActualizarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveedoresActionPerformed
        enviarDatosProveedores(2);
        limpiarProveedor();
    }//GEN-LAST:event_btnActualizarProveedoresActionPerformed

    private void btnEliminarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedoresActionPerformed
        enviarDatosProveedores(3);
        limpiarProveedor();
    }//GEN-LAST:event_btnEliminarProveedoresActionPerformed

    private void btnActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoActionPerformed
        enviarDatosEmpleados(2);
        limpiarEmpleado();
    }//GEN-LAST:event_btnActualizarEmpleadoActionPerformed

    private void btnMostrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEmpleadoActionPerformed
        objControlador.llenarTablaEmpleados(tablaEmpleadoA_B);
    }//GEN-LAST:event_btnMostrarEmpleadoActionPerformed

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
    
    public void enviarDatosProveedores(int opcion) {
        
        ArrayList<String> arrayProveedorNuevo = new ArrayList<>();
        
        arrayProveedorNuevo.add(txNombreProveedor.getText());
        arrayProveedorNuevo.add(txNitProveedor.getText());
        arrayProveedorNuevo.add(txDireccionProveedor.getText());
        arrayProveedorNuevo.add(txtelefonoProveedor.getText());
        arrayProveedorNuevo.add(txCiudadProveedor.getText());
        arrayProveedorNuevo.add(txEmailProveedor.getText());
        
        objControlador.crearProveedor(arrayProveedorNuevo);
        
        switch (opcion) {
            case 1:
                objControlador.crearProveedor(arrayProveedorNuevo);
                break;
            case 2:
                objControlador.actualizarProveedor(arrayProveedorNuevo);
                break;
            case 3:
                objControlador.eliminarProveedor(txNitProveedor.getText());
                break;
            default:
                break;
        }
        
    }
    
    public void datosTablaProveedor(int row) {
        
        String nombreProveedor = ((String) tablaProveedoresA_B.getValueAt(row, 0));
        String nitProveedor = ((String) tablaProveedoresA_B.getValueAt(row, 1));
        String direccionProveedor = (String.valueOf(tablaProveedoresA_B.getValueAt(row, 2)));
        String telefonoProveedor = (String.valueOf(tablaProveedoresA_B.getValueAt(row, 3)));
        String ciudadProveedor = (String.valueOf(tablaProveedoresA_B.getValueAt(row, 4)));
        String emailProveedor = ((String) tablaProveedoresA_B.getValueAt(row, 5));
        
        txNombreProveedor.setText(nombreProveedor);
        txNitProveedor.setText(nitProveedor);
        txDireccionProveedor.setText(direccionProveedor);
        txtelefonoProveedor.setText(telefonoProveedor + "");
        txCiudadProveedor.setText(ciudadProveedor + "");
        txEmailProveedor.setText(emailProveedor);
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
    
    public void limpiarProveedor(){
        
        txNombreProveedor.setText("");
        txNitProveedor.setText("");
        txDireccionProveedor.setText("");
        txtelefonoProveedor.setText("");
        txCiudadProveedor.setText("");
        txEmailProveedor.setText("");     
              
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
    public javax.swing.JButton btnActualizarEmpleado;
    private javax.swing.JButton btnActualizarProveedores;
    public javax.swing.JButton btnCrearEmpleado;
    public javax.swing.JButton btnCrearProveedor;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnEliminarProveedores;
    private javax.swing.JButton btnMostrar;
    public javax.swing.JButton btnMostrarEmpleado;
    private javax.swing.JButton btnMostrarProveedores;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboTipoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaEmpleadoA_B;
    private javax.swing.JTable tablaEmpleados;
    public javax.swing.JTable tablaProveedores;
    private javax.swing.JTable tablaProveedoresA_B;
    public javax.swing.JTextField txCedulaEmpleado;
    public javax.swing.JTextField txCiudadProveedor;
    public javax.swing.JTextField txClaveEmpleado;
    public javax.swing.JTextField txDireccionEmpleado;
    private javax.swing.JTextField txDireccionProveedor;
    public javax.swing.JTextField txEmailProveedor;
    public javax.swing.JTextField txNitProveedor;
    public javax.swing.JTextField txNombreEmp;
    public javax.swing.JTextField txNombreProveedor;
    public javax.swing.JTextField txTelefonoEmpleado;
    private javax.swing.JTextField txUsuarioEmpleado;
    public javax.swing.JTextField txtelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
