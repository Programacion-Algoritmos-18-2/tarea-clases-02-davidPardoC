/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author David Pardo
 */
public class Principal {
    public static void main(String[] args) {
        //Declaracion objeto e
        Equipo e = new Equipo();
        System.out.println("Nombre: "+e.Obtener_nombre()+"  "+"Numero de Jugadores: "+e.obtener_num_jugadores()+"  "+"Ciudad: "+e.Obtener_ciudad());
        //Declaracion objeto e2 y se envia un parametroString
        Equipo e2 = new Equipo("Liga de Loja");
        e2.agregar_num_jugadores(20);
        e2.agregar_ciudad("loja");
        System.out.println("Nombre: "+e2.Obtener_nombre()+"  "+"Numero de Jugadores: "+e2.obtener_num_jugadores()+"  "+"Ciudad: "+e2.Obtener_ciudad());
        //Declaracion objeto e3 y se envia un parametro String y un Int
        Equipo e3 = new Equipo("Liga de Loja", 20);
        e3.agregar_ciudad("loja");
        System.out.println("Nombre: "+e3.Obtener_nombre()+"  "+"Numero de Jugadores: "+e3.obtener_num_jugadores()+"  "+"Ciudad: "+e3.Obtener_ciudad());
        //Declaracion objeto e3 y se envia un parametro String , un Int y un String
        Equipo e4 = new Equipo("Liga de Loja", 20, "Loja");
        System.out.println("Nombre: "+e4.Obtener_nombre()+"  "+"Numero de Jugadores: "+e4.obtener_num_jugadores()+"  "+"Ciudad: "+e4.Obtener_ciudad());
        
    }
    
}