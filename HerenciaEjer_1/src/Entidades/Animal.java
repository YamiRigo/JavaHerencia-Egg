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
public class Animal {
    
    private String nombre;
    private String come;
    private Integer edad;
    private String raza;

    public Animal(String nombre, String come, Integer edad, String raza) {
        this.nombre = nombre;
        this.come = come;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCome() {
        return come;
    }

    public void setCome(String come) {
        this.come = come;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void seAlimenta(){
        System.out.println("Se alimenta de " + come);
    }

    @Override
    public String toString() {
        return "Animal de nombre: " + nombre + " y Raza: " + raza + "\nTiene: " + edad + " años y se alimenta de " + come;
    }
    
    
    
}
