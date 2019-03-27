/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Ventas {
    
    
    private String idCliente;
    private String idProducto;
    private String idEmpleado;
    private String fecha;
    private String hora;
    private float total;

    public Ventas(String idCliente, String idProducto, String idEmpleado, String fecha, String hora, float total) {
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public float getTotal() {
        return total;
    }
     
    //*********************************

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public String getDatosCliente()
    {
        return idCliente+"\t"+idProducto+"\t"+idEmpleado+"\t"+fecha+"\t"+hora+"\t"+total;        
    }
    
}
