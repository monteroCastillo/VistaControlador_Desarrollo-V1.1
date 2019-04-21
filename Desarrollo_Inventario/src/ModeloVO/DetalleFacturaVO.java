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

    public DetalleFacturaVO() {
    }
    
   
    
    String serialFactura;
    String codigoPrenda;
    int cantidadPrenda;
    int costoPrenda;

    public DetalleFacturaVO(String serialFactura, String codigoPrenda, int cantidadPrenda, int costoPrenda) {
        this.serialFactura = serialFactura;
        this.codigoPrenda = codigoPrenda;
        this.cantidadPrenda = cantidadPrenda;
        this.costoPrenda = costoPrenda;
    }

    public String getSerialFactura() {
        return serialFactura;
    }

    public String getCodigoPrenda() {
        return codigoPrenda;
    }

    public int getCantidadPrenda() {
        return cantidadPrenda;
    }

    public int getCostoPrenda() {
        return costoPrenda;
    }
   
   //**********

    public void setSerialFactura(String serialFactura) {
        this.serialFactura = serialFactura;
    }

    public void setCodigoPrenda(String codigoPrenda) {
        this.codigoPrenda = codigoPrenda;
    }

    public void setCantidadPrenda(int cantidadPrenda) {
        this.cantidadPrenda = cantidadPrenda;
    }

    public void setCostoPrenda(int costoPrenda) {
        this.costoPrenda = costoPrenda;
    }
    
    
   
         
}
