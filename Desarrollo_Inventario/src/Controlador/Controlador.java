package Controlador;

import ModeloDAO.*;
import ModeloVO.*;
import PostgreSQl.pgsql_dbc;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class Controlador {

    ClientesDAO objClientesDAO = new ClientesDAO();
    ProductoDAO objProductoDAO = new ProductoDAO();
    EmpleadoDAO objEmpleadoDAO = new EmpleadoDAO();
    ProveedorDAO objProveedorDAO = new ProveedorDAO();
    FacturaDAO objFacturaDAO = new FacturaDAO();
    DetalleFacturaDAO objDetalleFacturaDAO = new DetalleFacturaDAO();
    DetalleFacturaVO objDetalleFacturaVO;

    pgsql_dbc objetoConexion = new pgsql_dbc();
    ArrayList<DetalleFacturaVO> arregloProductosVendidos = new ArrayList<>();
    public ArrayList<Clientes> arregloClienteFactura = new ArrayList<>();

    DefaultTableModel modeloCanasta = new DefaultTableModel();

    //variables globales
    float sumaValorTotal = 0;
    String nombreEmpleado = "vacio";
    String cedulaEmpleado = "vacio";
    String tipoEmpleado = "vacio";

    public Controlador() {

    }
    /**
     * Muestra todos los clientes de la base de datos
     * @param tablaD 
     */
    public void llenarTablaClientes(JTable tablaD) {
        
        ArrayList<Clientes> listaClientes = new ArrayList();
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

        listaClientes = objClientesDAO.listarClientes();
        int numRegistros =listaClientes.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = listaClientes.get(i).getNombreCliente();
            columna[1] = listaClientes.get(i).getApellidos();
            columna[2] = listaClientes.get(i).getIdCliente();
            columna[3] = listaClientes.get(i).getDireccion();
            columna[4] = listaClientes.get(i).getTelefono();
            columna[5] = listaClientes.get(i).getCiudad();
            columna[6] = listaClientes.get(i).getEmail();
            columna[7] = listaClientes.get(i).getPublicidad();
            model.addRow(columna);
        }

    }
    /**
     * Muestra todos los empleados de la base de datos
     * @param tablaD 
     */
    public void llenarTablaEmpleados(JTable tablaD) {
        
        ArrayList<EmpleadoVO> listaEmpleados = new ArrayList();
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

        listaEmpleados = objEmpleadoDAO.listarEmpleados();
        int numRegistros = listaEmpleados.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = listaEmpleados.get(i).getNombreEmpleado();
            columna[1] = listaEmpleados.get(i).getCedula();
            columna[2] = listaEmpleados.get(i).getUsuario();
            columna[3] = listaEmpleados.get(i).getClave();
            columna[4] = listaEmpleados.get(i).getDireccionEmpleado();
            columna[5] = listaEmpleados.get(i).getTelEmpleado();
            columna[6] = listaEmpleados.get(i).getTipoEmpleado();

            model.addRow(columna);
        }

    }

    /**
     * Muestra los datos de los productos en una tabla
     *
     * @param tablaD
     * @param consulta
     */
    public void llenarTablaProductos(JTable tablaD, String consulta) {

        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);
        ArrayList<Productos> listaProductos = new ArrayList();
        
        try {
            model.addColumn("Producto");
            model.addColumn("Codigo");
            model.addColumn("Cantidad");
            model.addColumn("Valor Compra");
            model.addColumn("Valor Venta");
            model.addColumn("Proveedor");
            model.addColumn("Descripcion");

            Object[] columna = new Object[7];

            //int numRegistros = objProductoDAO.listarProductos(consulta).size();
            listaProductos = objProductoDAO.listarProductos(consulta);
            
            int numRegistros= listaProductos.size();

            for (int i = 0; i < numRegistros; i++) {
//                columna[0] = objProductoDAO.listarProductos(consulta).get(i).getNombreProducto();
//                columna[1] = objProductoDAO.listarProductos(consulta).get(i).getCodigoProducto();
//                columna[2] = objProductoDAO.listarProductos(consulta).get(i).getCantidad();
//                columna[3] = objProductoDAO.listarProductos(consulta).get(i).getValorCompraProd();
//                columna[4] = objProductoDAO.listarProductos(consulta).get(i).getValorVentaProd();
//                columna[5] = objProductoDAO.listarProductos(consulta).get(i).getProveedor();
//                columna[6] = objProductoDAO.listarProductos(consulta).get(i).getDescripcion();

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
            // System.out.println("Error Cargando la base de datos de productos");
            JOptionPane.showMessageDialog(null, "Error Cargando la base de datos ");
        }

    }

   

    /**
     * Muestra los datos de los proveedores en una tabla
     *
     * @param tablaD
     */
    public void llenarTablaProveedores(JTable tablaD) {
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);
        ArrayList<ProveedorVO> arregloProveedores = new ArrayList();

        model.addColumn("Nombre");
        model.addColumn("Nit");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Ciudad");
        model.addColumn("Email");

        Object[] columna = new Object[6];

        arregloProveedores = objProveedorDAO.listarProveedores();
        int numRegistros = arregloProveedores.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = arregloProveedores.get(i).getNombreProveedor();
            columna[1] = arregloProveedores.get(i).getNit();
            columna[2] = arregloProveedores.get(i).getDireccioProveedor();
            columna[3] = arregloProveedores.get(i).getTelefonoProveedor();
            columna[4] = arregloProveedores.get(i).getCiudad();
            columna[5] = arregloProveedores.get(i).getEmail();

            model.addRow(columna);
        }

    }
    
    /**
     * LLena el detalle de la factura en la vista de registro de facturas, 
     * esto lo hace apartir del serial de la factura
     * @param tablaD
     * @param serialFactura 
     */
    public void llenarDetalleTablaFacturasHistorico(JTable tablaD, String serialFactura ) {
        
        tablaD.setModel(modeloCanasta);
        ArrayList<DetalleFacturaVO> listaDetalleFactura = new ArrayList();
        String consulta = "SELECT *FROM  detallefactura WHERE serialfactura = " + "'" + serialFactura + "'"; 

        modeloCanasta.addColumn("CANT");
        modeloCanasta.addColumn("Codigo");
        modeloCanasta.addColumn("Nombre Producto");
        modeloCanasta.addColumn("Valor Producto");
        modeloCanasta.addColumn("V. total");

        Object[] columna = new Object[5];// Numero de Columnas
        
        listaDetalleFactura = objDetalleFacturaDAO.listarDetalleFacturaDAO(consulta);

        int numRegistros = listaDetalleFactura.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[0] = listaDetalleFactura.get(i).getCantidad();
            columna[1] = listaDetalleFactura.get(i).getCodigoProducto();
            columna[2] = listaDetalleFactura.get(i).getNombreProducto();
            columna[3] = listaDetalleFactura.get(i).getPrecioProducto();

            modeloCanasta.addRow(columna);
        }    
        

    }
    
    /**
     * Trae los datos del cliente de la factura seleccionada por el numero de serie
     * @param serialFactura
     * @return 
     */
    public ArrayList llenarDatosClienteFacturaHistorico(String serialFactura) {

        ArrayList<FacturaVO> listaFacturas = new ArrayList();
        String consulta = "SELECT *FROM  factura WHERE idfactura = " + "'" + serialFactura + "'"; 
        System.out.println("la consulta para invocar los datos del cliente desde el historico son: " + consulta);
        
        try {

            
            listaFacturas = objFacturaDAO.listarFacturasDAO(consulta);

        } catch (Exception e) {
            System.out.println("Problemas invocando el metodo de listarFacturasDAO ");
        }

        return listaFacturas;

//       labelNombre.setText(arreglo.get(0).getNombreCliente());
//       labelDireccion.setText(arreglo.get(0).getDireccion());
//       labelTelefono.setText(arreglo.get(0).getTelefono()); 
//       label_Nit_CC.setText(arreglo.get(0).getIdCliente());
//       labelNumFactura.setText(Integer.parseInt(objControlador.asignarNuevoNumFactura()) + 1 +"");
    }
    
    

    //************************************************************************************************************
    /**
     * Crea un nuevo cliente en la base de datos, agregando una tupla completa a
     * la base de datos
     *
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

        String respuestaRegistro = objClientesDAO.insertarCliente(nom, apell, idClie, dire, tel, ciu, email, publicidad);

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
     *
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
     * adiciona un proveedor en la base de datos
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
     * Adiciona una factura a la base de datos a partir de un arreglo que se
     * envia desde la clase canasta compras
     *
     * @param arregloFactura
     */
    public void crearFactura(ArrayList<String> arregloFactura) {

        String idCliente = arregloFactura.get(0);
        String idEmpleado = arregloFactura.get(1);
        String hora = arregloFactura.get(2);
        String fecha = arregloFactura.get(3);

        //No se inserta el id de factura por que el atributo en la base de datos es serial(se autoincrementa)
        objFacturaDAO.insertarFactura(idCliente, idEmpleado, hora, fecha, sumaValorTotal);

    }
    
    /**
     * termina de llenar el arrylist de detalle de la factura para luego enviarlo a la base de datos
     * este arraylist de detalle producto esta amarrado a la factura por el serial
     * @param cantidadVendida
     * @param serialFactura 
     */

    public void creaDetalleFactura(int[] cantidadVendida, String[] serialFactura) {
        
        String  nomProducto;
        String  codProducto;
        float  precioProducto;
        int cantidadProductos;
        String serieFactura;
        
        int numRegistros  =  getArregloProductosVendidos().size();
        int cantVendida;
        String serial;
        
        for (int i = 0; i < numRegistros; i++) {
            
            cantVendida = cantidadVendida[i];
            serial = serialFactura[i];
            arregloProductosVendidos.get(i).setCantidad(cantVendida);
            arregloProductosVendidos.get(i).setSerialFactura(serial);
            
        }

            for (int i = 0; i < numRegistros; i++) {
            
            nomProducto = arregloProductosVendidos.get(i).getNombreProducto();
            codProducto = arregloProductosVendidos.get(i).getCodigoProducto();
            precioProducto = arregloProductosVendidos.get(i).getPrecioProducto();
            cantidadProductos = arregloProductosVendidos.get(i).getCantidad();
            serieFactura = arregloProductosVendidos.get(i).getSerialFactura();
                
            System.out.print(arregloProductosVendidos.get(i).getNombreProducto() +"\t");
            System.out.print(arregloProductosVendidos.get(i).getCodigoProducto() +"\t");
            System.out.print(arregloProductosVendidos.get(i).getPrecioProducto() +"\t");
            System.out.print(arregloProductosVendidos.get(i).getCantidad() +"\t");
            System.out.print(arregloProductosVendidos.get(i).getSerialFactura()  +"\n");
            
            objDetalleFacturaDAO.insertarDetalleFactura(nomProducto, codProducto, precioProducto, cantidadProductos, serieFactura);
            
        }
            
        

    }

    //***********************************************************************************************
    /**
     * valida que el usuario  y la contraseña de la persona que se este registrando esten creados en la BD
     * @param usuario
     * @param clave
     * @return
     */
    public String[] login(String usuario, String clave) {

        boolean aceptado = false;
        ArrayList<String> arregloSalida = new ArrayList<>();
        String[] arregloLogin = new String[2];
        String user = "vacio";
        String password = "vacio";

        System.out.println("Usuario: " + user + "     password   " + clave);
        try {

            String consulta = "SELECT nombreempleado, cedula, usuario,clave,tipoempleado FROM empleado "
                    + "  WHERE usuario = " + "'" + usuario + "' AND clave = " + " '" + clave + "'";

            arregloSalida = objetoConexion.tupla(consulta, 5);

            if (!arregloSalida.isEmpty()) {
                nombreEmpleado = arregloSalida.get(0);
                cedulaEmpleado = arregloSalida.get(1);
                user = arregloSalida.get(2);
                password = arregloSalida.get(3);
                tipoEmpleado = arregloSalida.get(4);

                System.out.println(nombreEmpleado + user + password + tipoEmpleado);

                if (password.equalsIgnoreCase(clave) && user.equalsIgnoreCase(usuario)) {
                    System.out.println("FELICIDADES  ****" + arregloSalida.get(0));
                    aceptado = true;
                    arregloLogin[0] = "true";
                    arregloLogin[1] = tipoEmpleado;

                }
            } else {
                String d = JOptionPane.showInputDialog("Usuario NO valido Desea salir (S)");
                if (d.equals("s")) {
                    System.exit(0);
                }
            }

        } catch (Exception e) {

        }

        System.out.println("El valor del booleano es: " + aceptado);
        return arregloLogin;
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
     *
     * @param labelInformacionVentas
     */
    public void consultarIdCliente(JLabel labelInformacionVentas, String txID_cliente_ventas) {

        // Declaración el ArrayList
//        ArrayList<String> arregloEntrada = new ArrayList<String>();
//        arregloEntrada = objetoConexion.busqueda("clientes", "ced_nit_cliente =" + "'" + txID_cliente_ventas + "'", 8); //El numero 4 es el numero de parametros que devuelve
        // ArrayList<Clientes> arregloEntrada2 = new ArrayList<>();
        int numRegistros = objClientesDAO.listarClienteFactura(txID_cliente_ventas).size();

        String nombre = objClientesDAO.listarClienteFactura(txID_cliente_ventas).get(0).getNombreCliente();

        arregloClienteFactura = objClientesDAO.listarClienteFactura(txID_cliente_ventas);
        System.out.println("El nombre es: " + nombre);

        if (arregloClienteFactura.isEmpty()) {
            // JOptionPane.showMessageDialog(this, "No hay datos para Mostrar");
            labelInformacionVentas.setText("NO hay datos para Mostrar, cliente no creado");

        } else {

            labelInformacionVentas.setText("Cliente Encontrado");

        }
    }

    /**
     * LLena el combobox en la clase ventas para hacer limitar la busqueda
     *
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

    /**
     *
     * @param tablaVentasProductos
     * @param row
     */
//    public void extraerDatosTablaProductos_ClaseVentas(JTable tablaVentasProductos, int row){
//        
//        ArrayList<DetalleFacturaVO> arregloProductos = null ;//= new ArrayList<>();
//        //* row devolvera -1 si se ha clicado fuera de la fila pero dentro de la tabla,
//        //si no devolvera el indice de la fila en la que se ha clicado. */
//
//        //saca los valores de la tabla de Productos de la clase Ventas
//        String codigoProducto= ((String) tablaVentasProductos.getValueAt(row, 0));
//        String nombreProducto= ((String) tablaVentasProductos.getValueAt(row, 1));
//        float valorProducto = ((float) tablaVentasProductos.getValueAt(row, 3));
//        
//        arregloProductos.add(new DetalleFacturaVO(codigoProducto,nombreProducto,valorProducto));
//        
//        for (int i = 0; i < arregloProductos.size(); i++) {
//            System.out.println(arregloProductos.get(i).getNombreProducto());
//            System.out.println(arregloProductos.get(i).getCodigoProducto());
//            System.out.println(arregloProductos.get(i).getPrecioProducto());
//        }
//    }
    
    /**
     * por ahora solo sirve para validar que el metodo funcione se PUEDE BORRAR!!
     * @param arregloProductos 
     */
    public void mostrarProductos(ArrayList<DetalleFacturaVO> arregloProductos) {

        arregloProductosVendidos = arregloProductos;
        for (int i = 0; i < arregloProductos.size(); i++) {
            System.out.println(arregloProductos.get(i).getNombreProducto());
            System.out.println(arregloProductos.get(i).getCodigoProducto());
            System.out.println(arregloProductos.get(i).getPrecioProducto());
        }

    }

    /**
     * LLena la tabla que aparece en la canasta de compras con los productos
     * seleccionados en el frame ventas
     *
     * @param tablaD
     */
    public void llenarTablaCanasta(JTable tablaD) {
        //DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(modeloCanasta);

        modeloCanasta.addColumn("CANT");
        modeloCanasta.addColumn("Codigo");
        modeloCanasta.addColumn("Nombre Producto");
        modeloCanasta.addColumn("Valor Producto");
        modeloCanasta.addColumn("V. total");

        Object[] columna = new Object[5];// Numero de Columnas

        int numRegistros = arregloProductosVendidos.size();

        for (int i = 0; i < numRegistros; i++) {
            columna[1] = arregloProductosVendidos.get(i).getCodigoProducto();
            columna[2] = arregloProductosVendidos.get(i).getNombreProducto();
            columna[3] = arregloProductosVendidos.get(i).getPrecioProducto();

            modeloCanasta.addRow(columna);
        }

    }

    /**
     * Calcula los datos de la factura a partir de la seleccion que se hacen en
     * la vista de ventas
     */
    public void operaDatosTablaVentas(JTable tablaX, JLabel labelIva, JLabel labelTotal) {
        System.out.println("Entro a la funcion opera datos ");
        int numRegistros = arregloProductosVendidos.size();

        float[] cantidadFloat = new float[numRegistros];
        float[] valorFloat = new float[numRegistros];
        String[] cantidad = new String[numRegistros];
        String[] valor = new String[numRegistros];

        for (int i = 0; i < numRegistros; i++) {

            cantidadFloat[i] = Float.parseFloat((String) modeloCanasta.getValueAt(i, 0));
            valorFloat[i] = Float.parseFloat(String.valueOf(modeloCanasta.getValueAt(i, 3)));  // Se uso el casting String.valueOf ya que el (String) solo produjo errores

            float valorTotalProducto = cantidadFloat[i] * valorFloat[i]; // multiplica el valor por la cantidad de productos
            sumaValorTotal += valorTotalProducto;
            Double iva = sumaValorTotal * 0.19;

            tablaX.setValueAt(valorTotalProducto, i, 4);          //seta el total del valor de cada producto en la tabla
            labelIva.setText(iva + "");
            labelTotal.setText(sumaValorTotal + "");
        }
        
        

    }

    /**
     * Como el numero de la factura es una atributo de tipo serial se ira incrementando,
     * es por eso que sacamos el maximo del id y con esto obtendriamos el numero de la ultima factura
     * y en otro metodo le sumamos uno para crear el consecutivo
     * @return 
     */
    public String asignarNuevoNumFactura() {

        String consulta = "SELECT MAX(idfactura)FROM factura";
        String ultimoNumeroFactura = objetoConexion.llenaTabla(consulta);

        return ultimoNumeroFactura;

    }

    public ArrayList datosClienteCanasta() {

        return arregloClienteFactura;

    }

    public String empleadoSesionAbierta() {

        return nombreEmpleado;
    }

    public String cedulaEmpleadoSesionAbierta() {

        return cedulaEmpleado;
    }
    
    public ArrayList getArregloProductosVendidos(){
        return arregloProductosVendidos;
    }

}//Fin de la clase
