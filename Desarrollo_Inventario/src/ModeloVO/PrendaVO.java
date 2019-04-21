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
public class PrendaVO {
    
    private String nombrePrenda, codigoPrenda;
    private int costoPrenda;

    public PrendaVO(String nombrePrenda, String codigoPrenda, int costoPrenda) {
        this.nombrePrenda = nombrePrenda;
        this.codigoPrenda = codigoPrenda;
        this.costoPrenda = costoPrenda;
    }

    public PrendaVO() {
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public String getCodigoPrenda() {
        return codigoPrenda;
    }

    public int getCostoPrenda() {
        return costoPrenda;
    }
    
    //

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public void setCodigoPrenda(String codigoPrenda) {
        this.codigoPrenda = codigoPrenda;
    }

    public void setCostoPrenda(int costoPrenda) {
        this.costoPrenda = costoPrenda;
    }
    
    
    
}
