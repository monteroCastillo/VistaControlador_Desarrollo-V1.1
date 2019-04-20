/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ModeloDAO.ClientesDAO;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductosVO;
import Controlador.*;
//import PostgreSQL.pgsql_dbc;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ALLCH
 */
public class VistaClienteProducto extends javax.swing.JFrame {

   
    Controlador objControlador;  
    private static VistaClienteProducto objVistaCrear;
    ClientesDAO objClientesDAO;
    ProductoDAO objProductoDAO;
     ArrayList<String> listaProducto = new ArrayList();

    private VistaClienteProducto(Controlador objControlador) {

        initComponents();
        this.objControlador = objControlador;
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        btnActualizarProducto.setEnabled(false);
         btnActualizarCliente.setEnabled(false);
         btnEliminarCliente.setEnabled(false);
    }
     //Patron Singleton
    public  static VistaClienteProducto obtenerVistaClientes(Controlador objControlador){
        
        if(objVistaCrear == null){
            
            objVistaCrear = new VistaClienteProducto(objControlador);            
        }
        return objVistaCrear;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnActualizarCliente1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txNombreProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbValorCompraProducto = new javax.swing.JLabel();
        txCodigoProducto = new javax.swing.JTextField();
        txValorCompraProducto = new javax.swing.JTextField();
        lbValorVentaProducto = new javax.swing.JLabel();
        lbProveedor = new javax.swing.JLabel();
        txValorVentaProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txDescripcionProducto = new javax.swing.JTextField();
        txProveedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txCantidadProducto = new javax.swing.JTextField();
        btnCrearProducto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txCedulaNitCliente = new javax.swing.JTextField();
        txDireccionCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txTelefonoCliente = new javax.swing.JTextField();
        txCiudadCliente = new javax.swing.JTextField();
        btCrearCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txEmailCliente = new javax.swing.JTextField();
        checkPublicidad = new javax.swing.JCheckBox();
        btnActualizarCliente = new javax.swing.JButton();
        btnMostrarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaClientesA_B = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaVistaClientes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnMostrarProductos = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaVistaProductos = new javax.swing.JTable();
        btPrincipalCrear = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnActualizarCliente1.setText("Actualizar");
        btnActualizarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCliente1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Nombre Producto");

        jLabel8.setText("Codigo");

        lbValorCompraProducto.setText("Valor Compra");

        txCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodigoProductoActionPerformed(evt);
            }
        });

        lbValorVentaProducto.setText("Valor Venta");

        lbProveedor.setText("Descripcion");

        jLabel9.setText("Proveedor");

        jLabel13.setText("Cantidad");

        btnCrearProducto.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnCrearProducto.setText("Crear ");
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaProductos);

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEliminarProducto.setText("Borrar");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnActualizarProducto.setText("Actualizar");
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbValorCompraProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addComponent(lbValorVentaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbProveedor)
                        .addComponent(jLabel9)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(txNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txValorVentaProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txDescripcionProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txValorCompraProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txCantidadProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txCodigoProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(164, Short.MAX_VALUE))
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValorCompraProducto)
                    .addComponent(txValorCompraProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValorVentaProducto)
                    .addComponent(txValorVentaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProveedor)
                    .addComponent(txDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearProducto)
                    .addComponent(btnActualizarProducto)
                    .addComponent(btnEliminarProducto))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(587, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Crear Nuevo Producto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Producto", jPanel1);

        jLabel2.setText("Nombre");

        jLabel3.setText("Cedula o Nit");

        jLabel4.setText("Direccion");

        jLabel5.setText("Telefono");

        jLabel7.setText("Ciudad");

        btCrearCliente.setText("Crear");
        btCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearClienteActionPerformed(evt);
            }
        });

        jLabel12.setText("E - mail");

        checkPublicidad.setText("Desea recibir publicidad");

        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        btnMostrarCliente.setText("Mostrar");
        btnMostrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txCedulaNitCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txDireccionCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txEmailCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txCiudadCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkPublicidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNombreCliente)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txCedulaNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCiudadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(checkPublicidad)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCrearCliente)
                    .addComponent(btnActualizarCliente)
                    .addComponent(btnMostrarCliente)
                    .addComponent(btnEliminarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setText("Crear Nuevo Cliente");

        tablaClientesA_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientesA_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesA_BMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaClientesA_B);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel3);

        jButton3.setText("Mostrar Clientes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tablaVistaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaVistaClientes);

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel11.setText("Clientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visualizar Clientes", jPanel4);

        btnMostrarProductos.setText("MostrarProductos");
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel14.setText("Visualizar Productos");

        tablaVistaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaVistaProductos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(btnMostrarProductos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizar Productos", jPanel6);

        btPrincipalCrear.setText("Principal");
        btPrincipalCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrincipalCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPrincipalCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 463, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btPrincipalCrear)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
        
    private void btCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearClienteActionPerformed
        datosCliente(1);
    }//GEN-LAST:event_btCrearClienteActionPerformed

    private void btPrincipalCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincipalCrearActionPerformed
        if(objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("usuario")){
            
            VistaMenuUsuario obtenerMenuUsuario = VistaMenuUsuario.obtenerVistaClientes(objControlador);
            obtenerMenuUsuario.setVisible(true);
            this.dispose();
        }
        else if(objControlador.getTipoEmpleadoSesionAbierta().equalsIgnoreCase("admin")  ){
            VistaMenuAdmin volverHome = VistaMenuAdmin.obtenerVistaSeleccionAdmin(objControlador);
            volverHome.setVisible(true);
            this.dispose(); // instruccion que cierra la ventana actual
        }
        else{
            JOptionPane.showMessageDialog(null, "Imposible regresar al Menu Principal \n en este momento");            
        }    
        
    }//GEN-LAST:event_btPrincipalCrearActionPerformed

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        datosProducto(1);
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String consulta = "SELECT * FROM producto";
        objControlador.llenarTablaProductos(tablaProductos,consulta);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoProductoActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int row = tablaProductos.rowAtPoint(evt.getPoint());

        String d = JOptionPane.showInputDialog("Desea Actualizar o borrar ");
        if (d == null) {
            System.out.println("El valor de la variable d es : " + d);
        }
        else {
            btnActualizarProducto.setEnabled(true);
            datosTablaProducto(row);
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        datosProducto(2);
        limpiarProducto();
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        datosCliente(2);
        limpiarCliente();
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void btnActualizarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarCliente1ActionPerformed

    private void btnMostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClienteActionPerformed
        objControlador.llenarTablaClientes(tablaClientesA_B);
    }//GEN-LAST:event_btnMostrarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        datosCliente(3);
        limpiarCliente();
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void tablaClientesA_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesA_BMouseClicked
        int row = tablaClientesA_B.rowAtPoint(evt.getPoint());

        String d = JOptionPane.showInputDialog("Desea Actualizar o borrar ");
        if (d == null) {
            System.out.println("El valor de la variable d es : " + d);
        }
        else {
            btnActualizarCliente.setEnabled(true);
            btnEliminarCliente.setEnabled(true);
            datosTablaCliente(row);
        }
    }//GEN-LAST:event_tablaClientesA_BMouseClicked

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        
        datosProducto(3);
        limpiarProducto();
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        objControlador.llenarTablaClientes(tablaVistaClientes);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductosActionPerformed
        String consulta = "SELECT * FROM producto";
        objControlador.llenarTablaProductos(tablaVistaProductos,consulta);
    }//GEN-LAST:event_btnMostrarProductosActionPerformed

    public void datosProducto(int opcion) {
        
        ArrayList<String> arregloProducto;
        arregloProducto = new ArrayList<>();    
               
        arregloProducto.add(txNombreProducto.getText()); 
        arregloProducto.add(txCodigoProducto.getText());
        arregloProducto.add(txCantidadProducto.getText());
        arregloProducto.add(txValorCompraProducto.getText());
        arregloProducto.add(txValorVentaProducto.getText()); 
        arregloProducto.add(txProveedor.getText()); 
        arregloProducto.add(txDescripcionProducto.getText());
        
        switch (opcion) {
            case 1:
                objControlador.crearProducto(arregloProducto);
                break;
            case 2:
                objControlador.actualizarProducto(arregloProducto);
                break;
            case 3: 
                objControlador.eliminarProducto(txCodigoProducto.getText());
                break;
            default:
                break;
        }

    }
    
    public void datosCliente(int opcion) {

        ArrayList<String> arrayClienteNuevo = new ArrayList<>();

        String publicidad = "no";
        if (checkPublicidad.isSelected()) {
            publicidad = "si";
        }

        arrayClienteNuevo.add(txNombreCliente.getText());
        arrayClienteNuevo.add(txCedulaNitCliente.getText());
        arrayClienteNuevo.add(txDireccionCliente.getText());
        arrayClienteNuevo.add(txTelefonoCliente.getText());
        arrayClienteNuevo.add(txCiudadCliente.getText());
        arrayClienteNuevo.add(txEmailCliente.getText());
        arrayClienteNuevo.add(publicidad);       

        switch (opcion) {
            case 1:
                objControlador.crearCliente(arrayClienteNuevo);
                break;
            case 2:
                objControlador.actualizarCliente(arrayClienteNuevo);
                break;
            case 3:
                objControlador.eliminarCliente(txCedulaNitCliente.getText());
                break;
            default:
                break;
        }
    }
   
    public void datosTablaProducto(int row) {      
        
        
        String nombreProducto = ((String) tablaProductos.getValueAt(row, 0));
        String codigoProducto = ((String) tablaProductos.getValueAt(row, 1));
        String cantidad = (String.valueOf(tablaProductos.getValueAt(row, 2)));
        String valorCompraProducto = (String.valueOf( tablaProductos.getValueAt(row, 3)));
        String valorVentaProducto = (String.valueOf( tablaProductos.getValueAt(row, 4)));
        String proveedor = ((String) tablaProductos.getValueAt(row, 5));
        String descripcion = ((String) tablaProductos.getValueAt(row, 6));
        txNombreProducto.setText(nombreProducto);
        txCodigoProducto.setText(codigoProducto);
        txCantidadProducto.setText(cantidad + "");
        txValorVentaProducto.setText(valorVentaProducto + "");
        txValorCompraProducto.setText(valorCompraProducto + "");
        txProveedor.setText(proveedor);
        txDescripcionProducto.setText(descripcion);   
          
    }

    public void datosTablaCliente(int row) {      
        
        
        String nombreCliente = ((String) tablaClientesA_B.getValueAt(row, 0));
        String cedulaNitCliente = ((String) tablaClientesA_B.getValueAt(row, 1));
        String direccionCliente = (String.valueOf(tablaClientesA_B.getValueAt(row, 2)));
        String telefonoCliente = (String.valueOf( tablaClientesA_B.getValueAt(row, 3)));
        String ciudadCliente = (String.valueOf( tablaClientesA_B.getValueAt(row, 4)));
        String emailCliente = ((String) tablaClientesA_B.getValueAt(row, 5));
        String publicidad = ((String) tablaClientesA_B.getValueAt(row, 6));
        txNombreCliente.setText(nombreCliente);
        txCedulaNitCliente.setText(cedulaNitCliente);
        txDireccionCliente.setText(direccionCliente);
        txTelefonoCliente.setText(telefonoCliente);
        txCiudadCliente.setText(ciudadCliente);
        txEmailCliente.setText(emailCliente);
        
        if (publicidad.equalsIgnoreCase("si"))
            checkPublicidad.setSelected(true);
        else if(publicidad.equalsIgnoreCase("no"))
            checkPublicidad.setSelected(false);                  
        
    }
    
    public void limpiarProducto(){
        txNombreProducto.setText("");
        txCodigoProducto.setText("");
        txCantidadProducto.setText("");
        txValorCompraProducto.setText("");
        txValorVentaProducto.setText("");
        txProveedor.setText("");
        txDescripcionProducto.setText("");
    }
    
    public void limpiarCliente(){
        txNombreCliente.setText("");
        txCedulaNitCliente.setText("");
        txDireccionCliente.setText("");
        txTelefonoCliente.setText("");
        txCiudadCliente.setText("");
        txEmailCliente.setText("");
        checkPublicidad.setSelected(false);         
    }
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btCrearCliente;
    private javax.swing.JButton btPrincipalCrear;
    public javax.swing.JButton btnActualizarCliente;
    public javax.swing.JButton btnActualizarCliente1;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnCrearProducto;
    public javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnMostrarCliente;
    private javax.swing.JButton btnMostrarProductos;
    public javax.swing.JCheckBox checkPublicidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbProveedor;
    private javax.swing.JLabel lbValorCompraProducto;
    private javax.swing.JLabel lbValorVentaProducto;
    private javax.swing.JTable tablaClientesA_B;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaVistaClientes;
    private javax.swing.JTable tablaVistaProductos;
    private javax.swing.JTextField txCantidadProducto;
    public javax.swing.JTextField txCedulaNitCliente;
    public javax.swing.JTextField txCiudadCliente;
    private javax.swing.JTextField txCodigoProducto;
    private javax.swing.JTextField txDescripcionProducto;
    public javax.swing.JTextField txDireccionCliente;
    public javax.swing.JTextField txEmailCliente;
    public javax.swing.JTextField txNombreCliente;
    private javax.swing.JTextField txNombreProducto;
    private javax.swing.JTextField txProveedor;
    public javax.swing.JTextField txTelefonoCliente;
    private javax.swing.JTextField txValorCompraProducto;
    private javax.swing.JTextField txValorVentaProducto;
    // End of variables declaration//GEN-END:variables
}
