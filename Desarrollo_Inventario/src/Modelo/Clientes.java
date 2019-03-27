package Modelo;


public class Clientes {

//    public Clientes() {
//    }
    
    
    
    
    private String nombreCliente;
    private String apellidos;
    private String idCliente;
    private String direccion;
    private String telefono;
    private String ciudad;
    private String email;
    private String publicidad;
    
//    public Clientes(String nombreCliente, String apellidos, String idCliente, String direccion, String telefono, String ciudad, String email, String publicidad) {
//        this.nombreCliente = nombreCliente;
//        this.apellidos = apellidos;
//        this.idCliente = idCliente;
//        this.direccion = direccion;
//        this.telefono = telefono;
//        this.ciudad = ciudad;
//        this.email = email;
//        this.publicidad = publicidad;
//    }

    
public Clientes() {
        nombreCliente = "";
        apellidos = "";
        idCliente = "";
        direccion = "";
        telefono = "";
        ciudad = "";
        email = "";
        publicidad = "";
    }   
   
    

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEmail() {
        return email;
    }

    public String getPublicidad() {
        return publicidad;
    }
    
    

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPublicidad(String publicidad) {
        this.publicidad = publicidad;
    }
    
    
    
    public String getDatosCliente()
    {
        return nombreCliente+"\t"+apellidos+"\t"+idCliente+"\t"+direccion+"\t"+telefono+"\t"+ciudad+"\t"+email +"\t"+publicidad;        
    }
   

}
