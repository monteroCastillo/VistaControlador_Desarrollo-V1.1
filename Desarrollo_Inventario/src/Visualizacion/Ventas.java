/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacion;

import Controlador.*;
import Modelo.Productos;
import PostgreSQl.pgsql_dbc;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALLCH
 */
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form ventas
     */
    ArrayList<Productos> arregloProductos = new ArrayList<>();

    pgsql_dbc objetoConexion = new pgsql_dbc();
    Interface objInterface = new Interface();
    Controlador objControlador;

    public Ventas(Controlador objControlador) {
        initComponents();
        this.objControlador = objControlador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txID_cliente_ventas = new javax.swing.JTextField();
        btValidarIdClienteVentas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelInformacionVentas = new javax.swing.JLabel();
        comboBoxMostrarProductosVentas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentaProductos = new javax.swing.JTable();
        botonBuscarProducto = new javax.swing.JButton();
        mostrarDatos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoPrueba = new javax.swing.JTextArea();
        btPrincipalVentas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btValidarIdClienteVentas.setText("Validar");
        btValidarIdClienteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValidarIdClienteVentasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Ventas");

        jLabel2.setText("ID Cliente");

        tablaVentaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVentaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaVentaProductos);

        botonBuscarProducto.setText("Buscar Producto");
        botonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarProductoActionPerformed(evt);
            }
        });

        mostrarDatos.setText("Mostrar Todos");
        mostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDatosActionPerformed(evt);
            }
        });

        textoPrueba.setColumns(20);
        textoPrueba.setRows(5);
        jScrollPane3.setViewportView(textoPrueba);

        btPrincipalVentas.setText("Principal");
        btPrincipalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrincipalVentasActionPerformed(evt);
            }
        });

        jButton1.setText("Ir a la canasta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addComponent(comboBoxMostrarProductosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelInformacionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txID_cliente_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(btValidarIdClienteVentas)))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txID_cliente_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btValidarIdClienteVentas)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelInformacionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxMostrarProductosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btValidarIdClienteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValidarIdClienteVentasActionPerformed
        consultarIdCliente();

    }//GEN-LAST:event_btValidarIdClienteVentasActionPerformed

    private void botonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarProductoActionPerformed
        llenarComboboxVentas();
    }//GEN-LAST:event_botonBuscarProductoActionPerformed

    private void mostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDatosActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_mostrarDatosActionPerformed

    private void tablaVentaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentaProductosMouseClicked
        int row = tablaVentaProductos.rowAtPoint(evt.getPoint());

        datosTablaProducto(row);
    }//GEN-LAST:event_tablaVentaProductosMouseClicked

    private void btPrincipalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincipalVentasActionPerformed
        DashBoard volverHome = new DashBoard(objControlador);
        volverHome.setVisible(true);
        this.dispose(); // instruccion que cierra la ventana actual
    }//GEN-LAST:event_btPrincipalVentasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CanastaCompra canasta = new CanastaCompra();
        canasta.setVisible(true);
        this.dispose(); // instruccion que cierra la ventana actual
    }//GEN-LAST:event_jButton1ActionPerformed

    public ArrayList datosTablaProducto(int row) {


        /* row devolvera -1 si se ha clicado fuera de la fila pero dentro de la tabla, si no devolvera el indice de la fila en la que se ha clicado. */
        //saca los valores de la tabla de Productos de la clase Ventas
        String codigoProducto = ((String) tablaVentaProductos.getValueAt(row, 0));
        String nombreProducto = ((String) tablaVentaProductos.getValueAt(row, 1));
        float valorProducto = ((float) tablaVentaProductos.getValueAt(row, 0));
        //textoPrueba.append((String) tablaVentasProductos.getValueAt(row, 4));
        //arregloProductos.add(new Productos(codigoProducto,nombreProducto,valorProducto));

        return arregloProductos;

    }

    private void consultarIdCliente() {

        objControlador.consultarIdCliente(labelInformacionVentas, txID_cliente_ventas.getText());

    }

    /**
     * Llena el combobox con todos los nombres de los productos
     */
    private void llenarComboboxVentas() {
        
        objControlador.llenarComboboxVentas(comboBoxMostrarProductosVentas);

//        //btMostrarInformacionTablas.setEnabled(false);
//        ArrayList<String> arregloEntrada = new ArrayList<String>();
//        String sacaTabla = "SELECT nombreproducto FROM producto";
//        arregloEntrada = objetoConexion.actualizar(sacaTabla);
//        Iterator<String> nombreIterator = arregloEntrada.iterator();
//
//        while (nombreIterator.hasNext()) {
//            String elemento = nombreIterator.next();
//
//        }
//
//        for (int i = 0; i < arregloEntrada.size(); i++) {
//            String tipo = (String) arregloEntrada.get(i);
//            comboBoxMostrarProductosVentas.addItem(tipo);
//        }
    }

    private void mostrarDatos() {
        String consulta = "SELECT * FROM producto";
        objControlador.llenarTablaProductos(tablaVentaProductos, consulta);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarProducto;
    private javax.swing.JButton btPrincipalVentas;
    private javax.swing.JButton btValidarIdClienteVentas;
    private javax.swing.JComboBox<String> comboBoxMostrarProductosVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelInformacionVentas;
    private javax.swing.JButton mostrarDatos;
    private javax.swing.JTable tablaVentaProductos;
    private javax.swing.JTextArea textoPrueba;
    private javax.swing.JTextField txID_cliente_ventas;
    // End of variables declaration//GEN-END:variables
}
