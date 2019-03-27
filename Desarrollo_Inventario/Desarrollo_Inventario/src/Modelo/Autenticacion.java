
import java.awt.*;
import javax.swing.JOptionPane;
import Visualizacion.DashBoard;
import PostgreSQl.pgsql_dbc;

public class Autenticacion extends Frame {

    boolean inAnApplet = true;

    Label LabNombre = new Label("Nombre del Usuario", Label.RIGHT);
    TextField TexNombre = new TextField(15);
    Label LabClave = new Label("Clave", Label.RIGHT);
    TextField TexClave = new TextField(15);
    Button ButAceptar = new Button("Aceptar");
    Button ButCancelar = new Button("Cancelar");
    Button ButAyuda = new Button("Ayuda");

    //Declaracion de objetos
    pgsql_dbc objetoConexion;

    public Autenticacion() {
        Panel southPanel = new Panel();
        Panel northPanel = new Panel();
        Panel centerPanel = new Panel();
        setLayout(new BorderLayout());

        Panel p = new Panel();
        p.setLayout(new BorderLayout());
        p.add("North", new Label("Aplicaci�n de Autenticaci�n", Label.CENTER));
        p.add("South", new Label("Digite el Nombre de Usuario y Clave", Label.CENTER));
        centerPanel.add(p);
        add("North", centerPanel);

        northPanel.add(LabNombre);
        northPanel.add(TexNombre);
        northPanel.add(LabClave);
        northPanel.add(TexClave);
        TexClave.setEchoChar('?');
        add("Center", northPanel);

        southPanel.add(ButAceptar);
        southPanel.add(ButCancelar);
        southPanel.add(ButAyuda);
        add("South", southPanel);

        //********************************************************
        objetoConexion = new pgsql_dbc();

    }

    public boolean action(Event event, Object arg) {
        if (event.target instanceof Button) {
            if (((String) arg).equals("Ayuda")) {
                ayuda();
            }
            if (((String) arg).equals("Cancelar")) {
                System.exit(0);
            }
            if (((String) arg).equals("Aceptar")) {
                try {
                    // String i = ControlUsuario.AutenticaUsuario(TexNombre.getText(), TexClave.getText());
                    // usa("codigoest ="+"'"+TexClave.getText()+"'");
                    // usa("nombreest ="+"'"+TexNombre.getText()+"'");
                    String x = objetoConexion.consultar("nombreempleado =" + "'" + TexNombre.getText() + "'");
                   // String y = objetoConexion.consultar("nombrecliente =" + "'" + TexNombre.getText() + "'");

                    System.out.println("El valor de x es  ****" + x);
                    if (x.equalsIgnoreCase(TexNombre.getText())) {
                        System.out.println("FELICIDADES  ****" + x);
                        //}
//                    //if (x == "Ok" && y.equalsIgnoreCase("ok")) {
//                        FraMenu window1 = new FraMenu();
////		        		window1.inAnApplet = false;
//
//                        window1.setSize(new java.awt.Dimension(5800,5800));
//                     // window1.setSize(800,800);
//                        window1.setTitle("Usuario Encontrado");
//                        window1.pack();
//                        window1.show();

                        DashBoard interfaz = new DashBoard();
                        interfaz.show();
                    } else {
                        String d = JOptionPane.showInputDialog("Usuario NO valido Desea salir (S)");
                        if (d.equals("s")) {
                            System.exit(0);
                        }
                    }
                } catch (Exception e) {

                }
            }
        }
        return true;
    }

    public boolean handleEvent(Event event) {
        if (event.id == Event.WINDOW_DESTROY) {
            if (inAnApplet) {
                dispose();
            } else {
                System.exit(0);
            }
        }
        return super.handleEvent(event);
    }

    public void ayuda() {
        JOptionPane.showMessageDialog(null, " Tenga en cuenta \n Si es usuario Nuevo: Ir a Sistemas\n Si ya Existe: Recuerde bien la Clave\n Si Olvido la Clave: Ir a Sistemas");
    }

    public void usa(String codigo) {

        String variable = objetoConexion.consultar(codigo);
        System.out.println("la consulta es : " + variable);
    }

    public void configuracion() {
        Autenticacion window = new Autenticacion();
        window.inAnApplet = false;

        window.setTitle("Autenticaci�n de Usuarios");

        window.pack();
        window.show();

    }

    public static void main(String[] args) {
        Autenticacion window = new Autenticacion();
        //window.usa();
        window.inAnApplet = false;

        window.setTitle("Autenticaci�n de Usuarios");
        window.pack();
        window.show();
    }

}
