package Controlador;

import Modelo.*;
import Visualizacion.*;
import PostgreSQL.*;
import PostgreSQl.pgsql_dbc;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controlador {

    ClientesDAO objClientesDAO = new ClientesDAO();
    ProductoDAO objProductoDAO = new ProductoDAO();
    //Consultas objConsultas = new Consultas();

    pgsql_dbc objetoConexion = new pgsql_dbc();
    ///Login objLogin =new  Login();

//    public Controlador(VisualizarClientes objVisualizarClientes, ClientesDAO objClientesDAO, Crear objCrear) {////, //Login objLogin){
// 
//        this.objClientesDAO = objClientesDAO;
//
//    }
    public Controlador() {

    }

    public void llenarTablaClientes(JTable tablaD) {
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);
        //DefaultTableModel  model = (DefaultTableModel )tablaClientes.getModel();

        model.addColumn("Nombre");
        model.addColumn("Apellidos");
        model.addColumn("Identificacion");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Ciudad");
        model.addColumn("Email");
        model.addColumn("Publicidad");

        Object[] columna = new Object[8];

        int numRegistros = objClientesDAO.listarClientes().size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = objClientesDAO.listarClientes().get(i).getNombreCliente();
            columna[1] = objClientesDAO.listarClientes().get(i).getApellidos();
            columna[2] = objClientesDAO.listarClientes().get(i).getIdCliente();
            columna[3] = objClientesDAO.listarClientes().get(i).getDireccion();
            columna[4] = objClientesDAO.listarClientes().get(i).getTelefono();
            columna[5] = objClientesDAO.listarClientes().get(i).getCiudad();
            columna[6] = objClientesDAO.listarClientes().get(i).getEmail();
            columna[7] = objClientesDAO.listarClientes().get(i).getPublicidad();
            model.addRow(columna);
        }

    }

    public void llenarTablaProductos(JTable tablaD, String consulta) {
        System.out.println("Entro al metodo de llenar tabla");
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);
        //DefaultTableModel  model = (DefaultTableModel )tablaClientes.getModel();

        model.addColumn("Producto");
        model.addColumn("Codigo");
        model.addColumn("Cantidad");
        model.addColumn("Valor Compra");
        model.addColumn("Valor Venta");
        model.addColumn("Proveedor");
        model.addColumn("Descripcion");

        Object[] columna = new Object[7];

        int numRegistros = objProductoDAO.listarProductos(consulta).size();

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

    public void crearCliente(ArrayList<String> arrayClienteNuevo) {

        String nom = arrayClienteNuevo.get(0);
        String apell = arrayClienteNuevo.get(1);
        String idClie = arrayClienteNuevo.get(2);
        String dire = arrayClienteNuevo.get(3);
        String tel = arrayClienteNuevo.get(4);
        String ciu = arrayClienteNuevo.get(5);
        String email = arrayClienteNuevo.get(6);
        String publicidad;
        publicidad = arrayClienteNuevo.get(7);

        String respuestaRegistro = objClientesDAO.insertarCliente(idClie, apell, idClie, dire, tel, ciu, email, publicidad);

        if (respuestaRegistro != null) {
            JOptionPane.showMessageDialog(null, respuestaRegistro);
        } else {
            JOptionPane.showMessageDialog(null, "Registro Erroneo");
        }
    }

    /**
     * Crea el producto en la base de datos con los valores que se envia desde
     * la clase que los toma en txField
     *
     * @param arregloProductos
     */
    public void crearProducto(ArrayList<String> arregloProductos) {

        String prod = arregloProductos.get(0);
        String codProd = arregloProductos.get(1);
        float cant;
        cant = Float.parseFloat(arregloProductos.get(2));
        float valcom;
        valcom = Float.parseFloat(arregloProductos.get(3));
        float valVen;
        valVen = Float.parseFloat(arregloProductos.get(4));
        String prov = arregloProductos.get(5);
        String descrip = arregloProductos.get(6);

        objProductoDAO.insertarProducto(codProd, codProd, cant, valcom, valVen, prov, descrip);
//                    

    }

    /**
     *
     * @param usuario
     * @param clave
     * @return
     */
    public String login(String usuario, String clave) {

        ArrayList<String> arregloSalida = new ArrayList<>();
        String nombreEmpleado = "vacio";
        String user = "vacio";
        String password = "vacio";
        String tipoEmpleado = "vacio";
        try {

            String consulta = "SELECT nombreempleado, usuario,clave,tipoempleado FROM empleado "
                    + "  WHERE nombreempleado = " + "'" + usuario + "' AND clave = " + " '" + clave + "'";

            arregloSalida = objetoConexion.tupla(consulta, 4);

            if (!arregloSalida.isEmpty()) {
                nombreEmpleado = arregloSalida.get(0);
                user = arregloSalida.get(1);
                password = arregloSalida.get(2);
                tipoEmpleado = arregloSalida.get(3);

                System.out.println(nombreEmpleado + user + password + tipoEmpleado);
            }
            if (password.equalsIgnoreCase(clave) && user.equalsIgnoreCase(usuario)) {
                System.out.println("FELICIDADES  ****" + arregloSalida.get(0));

//                DashBoard interfaz = new DashBoard();
//                interfaz.show();
            } else {
                String d = JOptionPane.showInputDialog("Usuario NO valido Desea salir (S)");
                if (d.equals("s")) {
                    System.exit(0);
                }
            }

        } catch (Exception e) {

        }
        return "";
    }

    /**
     * Metodo que busca en la base de datos productos que tengan existencias
     * menores a un dato ingresado por el usuario
     *
     * @param existencias
     * @param tabla
     */
    public void consultas(int existencias, JTable tabla) {

        ArrayList<String> arregloConsultaExistencias = new ArrayList<>();
        String consulta;

        // consulta = "SELECT producto.nombreproducto, producto.codproducto,cantidad FROM producto WHERE cantidad >" +existencias;
        consulta = "SELECT * FROM producto WHERE cantidad <" + existencias;

        arregloConsultaExistencias = objetoConexion.tupla(consulta, 3);

        llenarTablaProductos(tabla, consulta);

    }

    /**
     * Valida si un cliente esta creado en la base de datos
     * @param labelInformacionVentas
     */
    public void consultarIdCliente(JLabel labelInformacionVentas, String txID_cliente_ventas) {

        // Declaración el ArrayList
        ArrayList<String> arregloEntrada = new ArrayList<String>();
        arregloEntrada = objetoConexion.busqueda("clientes", "ced_nit_cliente =" + "'" + txID_cliente_ventas + "'", 8); //El numero 4 es el numero de parametros que devuelve

        //txID_cliente_ventas.setText("");
        if (arregloEntrada.isEmpty()) {
            // JOptionPane.showMessageDialog(this, "No hay datos para Mostrar");
            labelInformacionVentas.setText("NO hay datos para Mostrar, cliente no creado");

        } else {

            labelInformacionVentas.setText("Cliente Encontrado");

        }
    }
    
    public void llenarComboboxVentas(JComboBox cBoxMostrarProductosVentas) {

        //btMostrarInformacionTablas.setEnabled(false);
        ArrayList<String> arregloEntrada = new ArrayList<String>();
        String sacaTabla = "SELECT nombreproducto FROM producto";
        arregloEntrada = objetoConexion.actualizar(sacaTabla);
        Iterator<String> nombreIterator = arregloEntrada.iterator();

        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();

        }

        for (int i = 0; i < arregloEntrada.size(); i++) {
            String tipo = (String) arregloEntrada.get(i);
            cBoxMostrarProductosVentas.addItem(tipo);
        }
    }


}
