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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Pizza  p1 = new Pizza("Margarina", "Mediana");
       Pizza  p2 = new Pizza("Funghi","Familiar");
       Pizza  p3 = new Pizza("Cuatro quesos", "Mediana");
        System.out.println(p1);
        System.out.println(p2);
        p2.servida();
        System.out.println(p3);
        System.out.println("Servidas: "+ Pizza.getTotalServidas());
        System.out.println("Pedidas: "+ Pizza.getTotalPedidas());
    }
        }
    
