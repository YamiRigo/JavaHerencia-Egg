/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author yamila
 */
public class Persona {
    
    private String nombre;
    private long dni;
    private Barco nave;

    public Persona() {
    }

    public Persona(String nombre, long dni, Barco nave) {
        this.nombre = nombre;
        this.dni = dni;
        this.nave = nave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Barco getNave() {
        return nave;
    }

    public void setNave(Barco nave) {
        this.nave = nave;
    }

    @Override
    public String toString() {
        return "Persona{ " + "Nombre: " + nombre + ", DNI: " + dni + " }";
    }
    
    
    
}
