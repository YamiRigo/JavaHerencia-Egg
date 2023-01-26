/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author yamila
 */
public class Alquiler {
    
    private LocalDate fechaAlq;
    private LocalDate fechaDev;
    private Persona capitan;
    private int posicionAmarre;

    public Alquiler() {
        this.posicionAmarre = (int)(Math.random() * 51 + 1);
        this.capitan = new Persona();
    }

    public Alquiler(LocalDate fechaAlq, LocalDate fechaDev, Persona capitan) {
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.capitan = capitan;
        this.posicionAmarre = (int)(Math.random() * 51 + 1);
    }

    public LocalDate getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(LocalDate fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    public Persona getCapitan() {
        return capitan;
    }

    public void setCapitan(Persona capitan) {
        this.capitan = capitan;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }
    
    public void calculaAlquiler(){
        //Usando ChronoUnit, calculo el número de días
        int dias = (int)DAYS.between(this.fechaAlq, this.fechaDev);
        System.out.println("Por " + dias + " días de Amarre");
        System.out.println("El costo total de Aquiler es: $" + this.capitan.getNave().valorModulo() * dias + "\n\n");
    }
    
    
}
