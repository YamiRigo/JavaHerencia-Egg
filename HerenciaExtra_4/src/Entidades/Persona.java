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
public class Persona {
    
    protected final Scanner leer = new Scanner(System.in);
    protected String nombreCompleto;
    protected String dni;
    protected String estadoC;

    public Persona() {
    }

    public Persona(String nombreCompleto, String dni, String estadoC) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.estadoC = estadoC;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }

    @Override
    public String toString() {
        return "Persona" + "\nNombre: " + nombreCompleto + "\nDocumento: " + dni + "\nEstado Civil" + estadoC;
    }
    
    //Servicios
    public void crearPersona(){
        System.out.println("Indique el nombre completo");
        setNombreCompleto(leer.nextLine());
        System.out.println("Ingrese el documento");
        setDni(leer.next());
        System.out.println("Indique su estado civil");
        setEstadoC(leer.next());
    }
    
}
