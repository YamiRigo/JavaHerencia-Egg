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
public class EdificioDeOficinas extends Edificio{
    
    private int nroOficinas;
    private int cantPersOficinas;
    private int nroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nroOficinas, int cantPersOficinas, int nroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersOficinas = cantPersOficinas;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantPersOficinas() {
        return cantPersOficinas;
    }

    public void setCantPersOficinas(int cantPersOficinas) {
        this.cantPersOficinas = cantPersOficinas;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }
    
    @Override
    public double calcularSuperficie(){
        return super.ancho * super.largo;
    }
    
    @Override
    public double calcularVolumen(){
        return super.ancho * super.largo * super.alto;
    }
    
    public void cantPersonas(){
        System.out.println("Cantidad de Personas por Piso: " + this.cantPersOficinas * this.nroOficinas);
        System.out.println("Cantidad Total de Personas en el Edificio: " + this.cantPersOficinas * this.nroOficinas * this.nroPisos);
    }
    
    @Override
    public String toString(){
        System.out.println("*****");
        return "-> Edificio de Oficinas con " + nroPisos + " pisos, " + nroOficinas + " of/piso";
    }
    
}
