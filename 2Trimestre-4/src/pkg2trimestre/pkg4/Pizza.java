/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2trimestre.pkg4;

/**
 *
 * @author sergi
 */
public class Pizza {
      private static int totalPedidas = 0;
  private static int totalServidas = 0;
  
  private String size;
  private String tipo;
  private String estado;
  
  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.size = tamano;
    this.estado = "pedida";
    Pizza.totalPedidas++;
  }

    @Override
    public String toString() {
        return "Pizza{" + "size=" + size + ", tipo=" + tipo + ", estado=" + estado + '}';
    }

  
  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

  public void servida() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServidas++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }
    
}

