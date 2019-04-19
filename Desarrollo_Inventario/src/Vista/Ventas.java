
package Vista;

import ModeloVO.*;
import Controlador.*;
import ModeloDAO.ProductoDAO;
import PostgreSQL.pgsql_dbc;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Ventas extends javax.swing.JFrame {

    Controlador objControlador;
    ProductoDAO objProductoDAO = new ProductoDAO();
    private static Ventas objVentas;

    TableRowSorter rowSorter; // es la variable para realizar el filtro de busqueda
    int IDBUSQUEDA = 0; // Filtraria por nombre de producto

    ArrayList<DetalleFacturaVO> arregloProductos = new ArrayList<>();

    pgsql_dbc objetoConexion = new pgsql_dbc();

    DefaultTableModel model = new DefaultTableModel();
    int numProductos = 0;

    public Ventas(Controlador objControlador) {
        initComponents();
        this.objControlador = objControlador;
        //Cuando se selecciona un elemento de la tabla las letras se colocan del color seleccionado
        tablaVentasProductos.setSelectionForeground(Color.yellow);
        //Cuando se selecciona un elemento de la tabla el fondo  se coloca del color seleccionado
        tablaVentasProductos.setSelectionBackground(Color.red);
        btnMostrarDatos.setEnabled(false);
        panelCanasta.setVisible(false);
        this.setLocationRelativeTo(null);//Posiona la ventana en el centro
        labelNumProductos.setVisible(false);

//        asignarTitulo();
    }

    //Patron singleton
    public static Ventas obtenerVentas(Controlador objControlador) {

        if (objVentas == null) {

            objVentas = new Ventas(objControlador);
        }

        return objVentas;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentasProductos = new javax.swing.JTable();
        btnMostrarDatos = new javax.swing.JButton();
        btPrincipalVentas = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        panelCanasta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelNumProductos = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
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

        btnMostrarDatos.setText("Mostrar Productos");
        btnMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDatosActionPerformed(evt);
            }
        });

        btPrincipalVentas.setText("Principal");
        btPrincipalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrincipalVentasActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Filtro");

        panelCanasta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelCanasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCanastaMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Ir a la Canasta");

        labelNumProductos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelCanastaLayout = new javax.swing.GroupLayout(panelCanasta);
        panelCanasta.setLayout(panelCanastaLayout);
        panelCanastaLayout.setHorizontalGroup(
            panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCanastaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCanastaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelNumProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCanastaLayout.setVerticalGroup(
            panelCanastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCanastaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelNumProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txID_cliente_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btValidarIdClienteVentas)
                                .addGap(135, 135, 135))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelInformacionVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(252, 252, 252)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)))
                        .addComponent(panelCanasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelCanasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPrincipalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txID_cliente_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btValidarIdClienteVentas)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelInformacionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btValidarIdClienteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValidarIdClienteVentasActionPerformed

        boolean cliente;
        cliente = objControlador.consultarIdCliente(labelInformacionVentas, txID_cliente_ventas.getText());

        if (cliente == true) {

            btnMostrarDatos.setEnabled(true);

        } else {

        }
    }//GEN-LAST:event_btValidarIdClienteVentasActionPerformed

    private void btnMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDatosActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_btnMostrarDatosActionPerformed
    /**
     * Permite seleccionar un producto de la tabla de ventas para llevarlo a la
     * canaste de compra.
     *
     * @param evt
     */
    private void tablaVentasProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasProductosMouseClicked
        int row = tablaVentasProductos.rowAtPoint(evt.getPoint());

        String d = JOptionPane.showInputDialog("Desea Agregar este producto \n al carrito de compras (S)");
        if (d == null) {
            System.out.println("El valor de la variable d es : " + d);
        } else {
            panelCanasta.setVisible(true);
            datosTablaProducto(row);
            labelNumProductos.setVisible(true);
            labelNumProductos.setText(++numProductos +"");
        }
    }//GEN-LAST:event_tablaVentasProductosMouseClicked

    private void btPrincipalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrincipalVentasActionPerformed

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
    }//GEN-LAST:event_btPrincipalVentasActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        System.out.println("Entro al evento de teclado  keyReleased");
        try {
            rowSorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText().toUpperCase(), IDBUSQUEDA));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El filtrado no se ha podido llevar a cabo ");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void panelCanastaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCanastaMouseClicked
        CanastaCompra canasta = new CanastaCompra(objControlador);
        canasta.setVisible(true);
        this.dispose(); // instruccion que cierra la ventana actual
    }//GEN-LAST:event_panelCanastaMouseClicked

    /**
     * al cliquear sobre un elemento de la tabla que se muestra, este se
     * agregara a un arreglo para luego pasarlo a la canasta de compra
     *
     * @param row
     */
    public void datosTablaProducto(int row) {

        //saca los valores de la tabla de Productos de la clase Ventas
        String codigoProducto = ((String) tablaVentasProductos.getValueAt(row, 0));
        String nombreProducto = ((String) tablaVentasProductos.getValueAt(row, 1));
        float valorProducto = ((float) tablaVentasProductos.getValueAt(row, 3));
        arregloProductos.add(new DetalleFacturaVO(codigoProducto, nombreProducto, valorProducto, 0, ""));

        objControlador.mostrarProductos(arregloProductos);
//        //return arregloProductos;

    }


    /**
     * Llena el combobox con todos los nombres de los productos
     */
    private void mostrarDatos() {
        String consulta = "SELECT * FROM producto";
        // objControlador.llenarTablaProductos(tablaVentasProductos, consulta);

        llenarTablaProductos(consulta);

    }

    public ArrayList<DetalleFacturaVO> getArregloProductos() {
        return arregloProductos;
    }

//     System.out.println("Entro al evento de teclado  keyReleased");
//        rowSorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText().toUpperCase(), IDBUSQUEDA));
    public void llenarTablaProductos(String consulta) {

        DefaultTableModel model = new DefaultTableModel();
        tablaVentasProductos.setModel(model);
        ArrayList<ProductosVO> listaProductos = new ArrayList();

        try {

            model.addColumn("Producto");
            model.addColumn("Codigo");
            model.addColumn("Cantidad");
            model.addColumn("Valor Compra");
            model.addColumn("Valor Venta");
            model.addColumn("Proveedor");
            model.addColumn("Descripcion");

            Object[] columna = new Object[7];

            listaProductos = objProductoDAO.listarProductos(consulta);

            int numRegistros = listaProductos.size();

            System.out.println("Numero de registros EN LA CLASE VENTAS " + numRegistros);
            for (int i = 0; i < numRegistros; i++) {
                columna[0] = listaProductos.get(i).getNombreProducto();
                columna[1] = listaProductos.get(i).getCodigoProducto();
                columna[2] = listaProductos.get(i).getCantidad();
                columna[3] = listaProductos.get(i).getValorCompraProd();
                columna[4] = listaProductos.get(i).getValorVentaProd();
                columna[5] = listaProductos.get(i).getProveedor();
                columna[6] = listaProductos.get(i).getDescripcion();

                model.addRow(columna);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la carga de los datos ");
        }

        rowSorter = new TableRowSorter(model);
        tablaVentasProductos.setRowSorter(rowSorter);
    }

    private void asignarTitulo() {
        setTitle(objControlador.empleadoSesionAbierta());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPrincipalVentas;
    private javax.swing.JButton btValidarIdClienteVentas;
    private javax.swing.JButton btnMostrarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelInformacionVentas;
    private javax.swing.JLabel labelNumProductos;
    private javax.swing.JPanel panelCanasta;
    private javax.swing.JTable tablaVentasProductos;
    private javax.swing.JTextField txID_cliente_ventas;
    // End of variables declaration//GEN-END:variables
}
