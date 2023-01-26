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
public class Yate extends Barco{
    
    private int cv;
    private int cantCamarotes;

    public Yate() {
    }

    public Yate(int cv, int cantCamarotes, String matricula, Integer eslora, Integer anioFabr) {
        super(matricula, eslora, anioFabr);
        this.cv = cv;
        this.cantCamarotes = cantCamarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public double valorModulo() {
        return super.valorModulo() + this.cv + this.cantCamarotes; 
    }
    
    
    
}
