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
public class Rectangulo implements CalculosFormas{
    
    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double calculaArea(){
        return this.base * this.altura;
    }
    
    @Override
    public double calculaPerimetro(){
        return (this.base + this.altura) * 2;
    }
    
}
