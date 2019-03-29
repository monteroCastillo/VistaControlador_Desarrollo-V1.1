 package Controlador;

import ModeloDAO.*;
import ModeloVO.DetalleFacturaVO;
import PostgreSQl.pgsql_dbc;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Controlador {

    ClientesDAO objClientesDAO = new ClientesDAO();
    ProductoDAO objProductoDAO = new ProductoDAO();
    EmpleadoDAO objEmpleadoDAO = new EmpleadoDAO();
    ProveedorDAO objProveedorDAO = new ProveedorDAO();
    DetalleFacturaVO objDetalleFacturaVO;

    pgsql_dbc objetoConexion = new pgsql_dbc();
    ArrayList<DetalleFacturaVO> arregloProductos2 = new ArrayList<>();
    
 
    public Controlador() {

    }

    public void llenarTablaClientes(JTable tablaD) {
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);        

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
    
    public void llenarTablaEmpleados(JTable tablaD) {
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);       

        model.addColumn("Nombre");       
        model.addColumn("Identificacion");
        model.addColumn("Usuario");
        model.addColumn("Clave");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Tipo empleado");

        Object[] columna = new Object[7];

        int numRegistros = objEmpleadoDAO.listarEmpleados().size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = objEmpleadoDAO.listarEmpleados().get(i).getNombreEmpleado();
            columna[1] = objEmpleadoDAO.listarEmpleados().get(i).getCedula();
            columna[2] = objEmpleadoDAO.listarEmpleados().get(i).getUsuario();
            columna[3] = objEmpleadoDAO.listarEmpleados().get(i).getClave();
            columna[4] = objEmpleadoDAO.listarEmpleados().get(i).getDireccionEmpleado();
            columna[5] = objEmpleadoDAO.listarEmpleados().get(i).getTelEmpleado();
            columna[6] = objEmpleadoDAO.listarEmpleados().get(i).getTipoEmpleado();
           
            model.addRow(columna);
        }

    }
    
    
    /**
     * Muestra los datos de los productos en una tabla
     * @param tablaD
     * @param consulta 
     */
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
    /**
     * Muestra los datos de los proveedores en una tabla
     * @param tablaD 
     */
    public void llenarTablaProveedores(JTable tablaD) {
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);       

        model.addColumn("Nombre");       
        model.addColumn("Nit");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Ciudad");
        model.addColumn("Email");
       

        Object[] columna = new Object[6];

        int numRegistros = objProveedorDAO.listarProveedores().size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = objProveedorDAO.listarProveedores().get(i).getNombreProveedor();
            columna[1] = objProveedorDAO.listarProveedores().get(i).getNit();
            columna[2] = objProveedorDAO.listarProveedores().get(i).getDireccioProveedor();
            columna[3] = objProveedorDAO.listarProveedores().get(i).getTelefonoProveedor();
            columna[4] = objProveedorDAO.listarProveedores().get(i).getCiudad();
            columna[5] = objProveedorDAO.listarProveedores().get(i).getEmail();
            
           
            model.addRow(columna);
        }

    }    
    
    //************************************************************************************************************
    /**
     * Crea un nuevo cliente en la base de datos, agregando una tupla completa a la base de datos
     * @param arrayClienteNuevo 
     */
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

        objProductoDAO.insertarProducto(prod, codProd, cant, valcom, valVen, prov, descrip);                 

    }
    
    /**
     * Crea una tupla de tipo empleado en la base de datos
     * @param arregloEmpleados 
     */
    public void crearEmpleado(ArrayList<String> arregloEmpleados) {

        String emp = arregloEmpleados.get(0);
        String ced = arregloEmpleados.get(1);        
        String usuario = arregloEmpleados.get(2);    
        String clave = arregloEmpleados.get(3);       
        String direccion = arregloEmpleados.get(4);
        String tel = arregloEmpleados.get(5);
        String tipo = arregloEmpleados.get(6);
        
        objEmpleadoDAO.insertarEmpleado(emp, ced, usuario, clave, direccion, tel, tipo);

    }
    /**
     * 
     * @param arregloProveedor 
     */
    
     public void crearProveedor(ArrayList<String> arregloProveedor) {

        String nom = arregloProveedor.get(0);
        String nit = arregloProveedor.get(1);        
        String dir = arregloProveedor.get(2);    
        String tel = arregloProveedor.get(3);       
        String ciud = arregloProveedor.get(4);
        String email = arregloProveedor.get(5);
        
        
        objProveedorDAO.insertarProveedor(nom, nit, ciud, tel, ciud, email);

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

    
    ///*****************************************************************************************************************
    
    ////                METODOS DE LA CLASE VENTAS
    
    //*****************************************************************************************************************
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
    
    /**
     * LLena el combobox en la clase ventas para hacer limitar la busqueda
     * @param cBoxMostrarProductosVentas 
     */
    
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

    
    public void extraerDatosTablaProductos_ClaseVentas(JTable tablaVentasProductos, int row){
        
        ArrayList<DetalleFacturaVO> arregloProductos = null ;//= new ArrayList<>();
        //* row devolvera -1 si se ha clicado fuera de la fila pero dentro de la tabla,
        //si no devolvera el indice de la fila en la que se ha clicado. */

        //saca los valores de la tabla de Productos de la clase Ventas
        String codigoProducto= ((String) tablaVentasProductos.getValueAt(row, 0));
        String nombreProducto= ((String) tablaVentasProductos.getValueAt(row, 1));
        float valorProducto = ((float) tablaVentasProductos.getValueAt(row, 3));
        
        arregloProductos.add(new DetalleFacturaVO(codigoProducto,nombreProducto,valorProducto));
        
        for (int i = 0; i < arregloProductos.size(); i++) {
            System.out.println(arregloProductos.get(i).getNombreProducto());
            System.out.println(arregloProductos.get(i).getCodigoProducto());
            System.out.println(arregloProductos.get(i).getPrecioProducto());
        }
    }
    
    public void  mostrarProductos(ArrayList<DetalleFacturaVO> arregloProductos){
        
        
        arregloProductos2 = arregloProductos;
        for (int i = 0; i < arregloProductos.size(); i++) {
            System.out.println(arregloProductos.get(i).getNombreProducto());
            System.out.println(arregloProductos.get(i).getCodigoProducto());
            System.out.println(arregloProductos.get(i).getPrecioProducto());
        }
        
    }
    
    public void llenarTablaCanasta(JTable tablaD) {
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);        
        
        model.addColumn("CANT");
        model.addColumn("Codigo");
        model.addColumn("Nombre Producto");        
        model.addColumn("Valor Producto");
        model.addColumn("V. total");
        

        Object[] columna = new Object[5];// Numero de Columnas

        int numRegistros = arregloProductos2.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[1] = arregloProductos2.get(i).getCodigoProducto();
            columna[2] = arregloProductos2.get(i).getNombreProducto();            
            columna[3] = arregloProductos2.get(i).getPrecioProducto();
            
            model.addRow(columna);
        }

    }

    
    
    
    
}//Fin de la clase
