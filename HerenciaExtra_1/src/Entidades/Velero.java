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
public class Velero extends Barco{
    
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, Integer eslora, Integer anioFabr) {
        super(matricula, eslora, anioFabr);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public double valorModulo() {
        return super.valorModulo() + this.mastiles; 
    }
    
    
    
}
