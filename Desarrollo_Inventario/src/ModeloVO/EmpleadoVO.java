/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author ALLCH
 */
public class EmpleadoVO {
    

    
    String nombreEmpleado, cedula,usuario, clave,tipoEmpleado;

    public EmpleadoVO() {
        
        nombreEmpleado = "";
        cedula = "";
        usuario = "";
        clave = "";
       
        tipoEmpleado = "";
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    } 
    
    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }    

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }    
    
    
}
