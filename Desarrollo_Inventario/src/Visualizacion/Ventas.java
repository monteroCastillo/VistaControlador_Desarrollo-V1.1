/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacion;


import ModeloVO.*;
import Controlador.*;
import ModeloDAO.ProductoDAO;
import PostgreSQl.pgsql_dbc;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ALLCH
 */
public class Ventas extends javax.swing.JFrame {

    Controlador objControlador;
    ProductoDAO objProductoDAO = new ProductoDAO();
    TableRowSorter rowSorter;
    int IDBUSQUEDA = 1;
    
    ArrayList<DetalleFacturaVO> arregloProductos = new ArrayList<>();
    
    pgsql_dbc objetoConexion = new pgsql_dbc();
   
    DefaultTableModel model = new DefaultTableModel();
    
    
    public Ventas(Controlador objControlador) {
        initComponents();
        this.objControlador = objControlador;
        //Cuando se selecciona un elemento de la tabla las letras se colocan del color seleccionado
        tablaVentasProductos.setSelectionForeground( Color.yellow );
        //Cuando se selecciona un elemento de la tabla el fondo  se coloca del color seleccionado
        tablaVentasProductos.setSelectionBackground( Color.red );
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
        tablaVentasProductos = new javax.swing.JTable();
        botonBuscarProducto = new javax.swing.JButton();
        mostrarDatos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoPrueba = new javax.swing.JTextArea();
        btPrincipalVentas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

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

        tablaVentasProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVentasProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaVentasProductos);

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

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxMostrarProductosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(70, 70, 70)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    /**
     * Permite seleccionar un producto de la tabla de ventas para llevarlo a la canaste de compra.
     * @param evt 
     */
    private void tablaVentasProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasProductosMouseClicked
       int row = tablaVentasProductos.rowAtPoint(evt.getPoint());
       
       String d = JOptionPane.showInputDialog("Desea Agregar este producto \n al carrito de compras (S)");
       System.out.println("El valor de la variable d es : " +d);
        datosTablaProducto(row);
    }//GEN-LAST:event_tablaVentasProductosMouseClicked

    private void btPrincipalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincipalVentasActionPerformed
        VentanaSeleccion volverHome= new VentanaSeleccion(objControlador);
        volverHome.setVisible(true);
        this.dispose(); // instruccion que cierra la ventana actual
    }//GEN-LAST:event_btPrincipalVentasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CanastaCompra canasta= new CanastaCompra(objControlador);
        canasta.setVisible(true);
       // this.dispose(); // instruccion que cierra la ventana actual
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
//        for (int i = 0; i < arregloProductos.size(); i++) {
//            System.out.println(arregloProductos.get(i).getNombreProducto());
//            System.out.println(arregloProductos.get(i).getCodigoProducto());
//            System.out.println(arregloProductos.get(i).getPrecioProducto());
//        }
        
       
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void datosTablaProducto(int row){   
        
        
        
        //saca los valores de la tabla de Productos de la clase Ventas
        String codigoProducto= ((String) tablaVentasProductos.getValueAt(row, 0));
        String nombreProducto= ((String) tablaVentasProductos.getValueAt(row, 1));
        float valorProducto = ((float) tablaVentasProductos.getValueAt(row, 3));       
        arregloProductos.add(new DetalleFacturaVO(codigoProducto,nombreProducto,valorProducto));
        
        objControlador.mostrarProductos(arregloProductos);
//        //return arregloProductos;
        
    }
    
    private void consultarIdCliente() {

        objControlador.consultarIdCliente(labelInformacionVentas, txID_cliente_ventas.getText());
    }
   
    /**
     * Llena el combobox con todos los nombres de los productos
     */
    private void llenarComboboxVentas() {
        
        objControlador.llenarComboboxVentas(comboBoxMostrarProductosVentas);
        
    }
        
    private void mostrarDatos(){
       String consulta = "SELECT * FROM producto";
      // objControlador.llenarTablaProductos(tablaVentasProductos, consulta);
        
       llenarTablaProductos( consulta);
        
    }

    public ArrayList<DetalleFacturaVO> getArregloProductos() {
        return arregloProductos;
    }
    
     private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
         
        // objControlador.ejemplo( tablaVentasProductos, model);
        rowSorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText().toUpperCase(), IDBUSQUEDA));
    }//GEN-LAST:event_jTextField1KeyReleased

    
        public void llenarTablaProductos( String consulta) {
        
        DefaultTableModel model = new DefaultTableModel();
        tablaVentasProductos.setModel(model);
        

        model.addColumn("Producto");
        model.addColumn("Codigo");
        model.addColumn("Cantidad");
        model.addColumn("Valor Compra");
        model.addColumn("Valor Venta");
        model.addColumn("Proveedor");
        model.addColumn("Descripcion");

        Object[] columna = new Object[7];

        int numRegistros = objProductoDAO.listarProductos(consulta).size();
        System.out.println("Numero de registros "+ numRegistros);
        for (int i = 0; i < numRegistros; i++) {
            columna[0] = objProductoDAO.listarProductos(consulta).get(i).getNombreProducto();
            columna[1] = objProductoDAO.listarProductos(consulta).get(i).getCodigoProducto();
            columna[2] = objProductoDAO.listarProductos(consulta).get(i).getCantidad();
            columna[3] = objProductoDAO.listarProductos(consulta).get(i).getValorCompraProd();
            columna[4] = objProductoDAO.listarProductos(consulta).get(i).getValorVentaProd();
            columna[5] = objProductoDAO.listarProductos(consulta).get(i).getProveedor();
            columna[6] = objProductoDAO.listarProductos(consulta).get(i).getDescripcion();

            model.addRow(columna);
        }

    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarProducto;
    private javax.swing.JButton btPrincipalVentas;
    private javax.swing.JButton btValidarIdClienteVentas;
    private javax.swing.JComboBox<String> comboBoxMostrarProductosVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelInformacionVentas;
    private javax.swing.JButton mostrarDatos;
    private javax.swing.JTable tablaVentasProductos;
    private javax.swing.JTextArea textoPrueba;
    private javax.swing.JTextField txID_cliente_ventas;
    // End of variables declaration//GEN-END:variables
}
