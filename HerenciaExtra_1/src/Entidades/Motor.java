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
public class Motor extends Barco{
    
    private int cv;

    public Motor() {
    }

    public Motor(int cv, String matricula, Integer eslora, Integer anioFabr) {
        super(matricula, eslora, anioFabr);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public double valorModulo() {
        return super.valorModulo() + this.cv; 
    }
    
    
    
}
