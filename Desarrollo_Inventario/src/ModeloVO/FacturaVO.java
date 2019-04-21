/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;



public class FacturaVO {
    

  
    String  fecha,idCliente, idEmpleado, tipoPago, estadoPrenda, fechaEntrega;
    Float totalA_Pagar;
    int idFactura;
    int totalPrendas;

    public FacturaVO() {
        
        
    }   

    public FacturaVO(String fecha, String idCliente, String idEmpleado, 
            String tipoPago, String estadoPrenda, Float totalA_Pagar, int idFactura, 
            String fechaEntrega, int totalPrendas) {
       
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.tipoPago = tipoPago;
        this.estadoPrenda = estadoPrenda;
        this.totalA_Pagar = totalA_Pagar;
        this.idFactura = idFactura;
        this.fechaEntrega = fechaEntrega;
        this.totalPrendas = totalPrendas;
    }

    public String getFecha() {
        return fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public String getEstadoPrenda() {
        return estadoPrenda;
    }

    public Float getTotalA_Pagar() {
        return totalA_Pagar;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public int getTotalPrendas() {
        return totalPrendas;
    }
    
    public String getfechaEntrega(){
        return fechaEntrega;
    }
    
    //*****

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void setEstadoPrenda(String estadoPrenda) {
        this.estadoPrenda = estadoPrenda;
    }

    public void setTotalA_Pagar(Float totalA_Pagar) {
        this.totalA_Pagar = totalA_Pagar;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void setTotalPrendas(int totalPrendas) {
        this.totalPrendas = totalPrendas;
    }
    
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
      
    
}
