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
public class Polideportivo extends Edificio{
    
    private String nombre;
    private boolean instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isInstalacion() {
        return instalacion;
    }

    public void setInstalacion(boolean instalacion) {
        this.instalacion = instalacion;
    }
    
    @Override
    public double calcularSuperficie(){
        return super.ancho * super.largo;
    }
    
    @Override
    public double calcularVolumen(){
        return super.ancho * super.largo * super.alto;
    }
    
    @Override
    public String toString(){
        String instala = "TECHADO";
        if(instalacion){
            instala = "AIRE LIBRE";
        }
        System.out.println("*****");
        return "-> Polideportivo " + nombre + ", Instalaciones de tipo " + instala;
    }
    
}
