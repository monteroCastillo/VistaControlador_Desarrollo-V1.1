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
public class DetalleFacturaVO {
    
   String nombreProducto;
   String codigoProducto;
   String serialFactura;
   Float precioProducto;
   int cantidad;

    public DetalleFacturaVO(String nombreProducto, String codigoProducto, Float precioProducto, int cantidad, String serialFactura) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
        this.cantidad = cantidad;
        this.serialFactura = serialFactura;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public Float getPrecioProducto() {
        return precioProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getSerialFactura() {
        return serialFactura;
    }        
       
    
    //******************************************

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setPrecioProducto(Float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSerialFactura(String serialFactura) {
        this.serialFactura = serialFactura;
    }
       
         
}
