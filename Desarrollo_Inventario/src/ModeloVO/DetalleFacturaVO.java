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
   Float precioProducto;
   int cantidad;

    public DetalleFacturaVO(String nombreProducto, String codigoProducto, Float precioProducto) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
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
    
    
    
    public void mostrarDetalleProductoVO(){
        
        
    }
   
   
    
}
