/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author yamila
 */

/*Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.*/

public abstract class Alojamiento {
    
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
    
    public void creaAlojamiento(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Nombre del Alojamiento: ");
        this.nombre = leer.next().toUpperCase();
        System.out.println("Ingrese la Dirección: ");
        this.direccion = leer.next().toUpperCase();
        System.out.println("Ingrese la Localidad: ");
        this.localidad = leer.next().toUpperCase();
        System.out.println("Cómo se llama el Gerente?");
        this.gerente = leer.next().toUpperCase();
        
    }
    
    @Override
    public String toString(){
        System.out.println("* * * * * * * * * *");
        return "Alojamiento " + nombre + "\nDirección: " + direccion + ", Localidad: " + localidad + "\nGerente: " + gerente;
    }
    
}
