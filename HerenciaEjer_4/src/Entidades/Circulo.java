/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.CalculosFormas;

/**
 *
 * @author yamila
 */
public class Circulo implements CalculosFormas{
    
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double calculaArea(){
        return CalculosFormas.myPi * (this.radio * this.radio);
    }
    
    @Override
    public double calculaPerimetro(){
        return CalculosFormas.myPi * (this.radio * 2);
    }
    
}
