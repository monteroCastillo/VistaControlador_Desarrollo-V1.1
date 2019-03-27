/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacion;

import PostgreSQl.pgsql_dbc;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author ALLCH
 */
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form ventas
     */
    
    pgsql_dbc objetoConexion = new pgsql_dbc();
    public Ventas() {
        initComponents();
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
        jScrollPane2.setViewportView(tablaVentasProductos);

        botonBuscarProducto.setText("Buscar Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelInformacionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txID_cliente_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(btValidarIdClienteVentas))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(botonBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(comboBoxMostrarProductosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txID_cliente_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValidarIdClienteVentas)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInformacionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxMostrarProductosVentas)
                    .addComponent(botonBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btValidarIdClienteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValidarIdClienteVentasActionPerformed
        consultarIdCliente();
        llenarComboboxVentas();
    }//GEN-LAST:event_btValidarIdClienteVentasActionPerformed

    private void consultarIdCliente() {

        // Declaración el ArrayList
        ArrayList<String> arregloEntrada = new ArrayList<String>();
        arregloEntrada = objetoConexion.busqueda("clientes", "ced_nit_cliente =" + "'" + txID_cliente_ventas.getText() + "'", 8); //El numero 4 es el numero de parametros que devuelve
        
        //txID_cliente_ventas.setText("");
        
        if(arregloEntrada.isEmpty())    {        
           // JOptionPane.showMessageDialog(this, "No hay datos para Mostrar");
            labelInformacionVentas.setText("NO hay datos para Mostrar, cliente no creado");
            
        }
        else{
            
            labelInformacionVentas.setText("Cliente Encontrado");
//            Iterator<String> nombreIterator = arregloEntrada.iterator();
//            jTextArea1_Salida.append("                   DATOS CLIENTE" + "\n\n");
//            jTextArea1_Salida.append("Nombre" + "\t" + "Cedula o Nit" + "\t" + "Direccion" + "\t" + "Telefono" + "\n" + "\n");
//            while (nombreIterator.hasNext()) {
//                String elemento = nombreIterator.next();
//
//                jTextArea1_Salida.append(elemento + "\t");
            }
        }
    
        private void llenarComboboxVentas() {
        
        //btMostrarInformacionTablas.setEnabled(false);
        ArrayList<String> arregloEntrada = new ArrayList<String>();
        String sacaTabla = "SELECT nombreproducto FROM producto";
        arregloEntrada = objetoConexion.actualizar(sacaTabla);
        Iterator<String> nombreIterator = arregloEntrada.iterator();
        
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            //System.out.print(elemento+" / ");
            //areaActualizar.append(elemento + " \n ");
        }

        for (int i = 0; i < arregloEntrada.size(); i++) {
            String tipo = (String) arregloEntrada.get(i);
            comboBoxMostrarProductosVentas.addItem(tipo);
        }
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarProducto;
    private javax.swing.JButton btValidarIdClienteVentas;
    private javax.swing.JComboBox<String> comboBoxMostrarProductosVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelInformacionVentas;
    private javax.swing.JTable tablaVentasProductos;
    private javax.swing.JTextField txID_cliente_ventas;
    // End of variables declaration//GEN-END:variables
}
