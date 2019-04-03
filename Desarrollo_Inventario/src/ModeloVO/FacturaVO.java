/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;



public class FacturaVO {
    
    String hora, fecha,idCliente, idEmpleado;
    Float totalA_Pagar;
    int serial;

    public FacturaVO() {
        
        
    }

    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public Float getTotalA_Pagar() {
        return totalA_Pagar;
    }

    public int getSerial() {
        return serial;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }
    
    
    
    //****************************

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setTotalA_Pagar(Float totalA_Pagar) {
        this.totalA_Pagar = totalA_Pagar;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
    
    
    
    
}
