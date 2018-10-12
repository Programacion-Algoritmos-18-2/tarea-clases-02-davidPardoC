/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import ejercicio.pkg2.*;

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
        System.out.println(p.euros);
        p.euros=10.1;
        System.out.println(p.euros);
    }
    
}
