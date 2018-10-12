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
public class Equipo {
    private String nombre,ciudad;

    private int num_jugadores;
    //Constructor vacio por defecto
    public Equipo(){
    }
    //Constructor que recibe un string para el nombre
    public  Equipo(String nombre_l){
        nombre = nombre_l;
    }
    //Constructor que recibe dos parametros nombre y numero de jugadores
    public Equipo (String nombre_equipo, int num_jugadores_l){
        nombre = nombre_equipo;
        num_jugadores=num_jugadores_l;
    }
    //Constructor que recibe tres parametros nombre, numero de jugadores y ciudad
    public Equipo (String nombre_equipo, int num_jugadores_l, String ciudad_l){
        nombre = nombre_equipo;
        num_jugadores=num_jugadores_l;
        ciudad = ciudad_l;
    }
    //Ingresa un parametro entero x para asignar a la variable num_jugadores
    public void agregar_num_jugadores(int x){
        num_jugadores=x;
    }
    //Ingresa un parametro de tipo String para asignar a la variable ciudad
    public void agregar_ciudad(String x){
        ciudad = x;
    }
    //Retorna el valor de la variable num_jugadores;
    public int obtener_num_jugadores(){
        return num_jugadores;
    }
    //Retorna el valor de la variable ciudad;
    public String Obtener_ciudad(){
        return ciudad;
    }
    //Retorna el valor de la variable nombre;
    public String Obtener_nombre(){
        return nombre;
    }
}
