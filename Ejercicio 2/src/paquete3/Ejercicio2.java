/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;



/**
 *
 * @author David Pardo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Precio p;
        p = new Precio();
        Precio n = new Precio(25.9);
        //p.agregar(20.2);
        System.out.println(p.obtener());
        System.out.println(n.obtener());
    }
    
}
