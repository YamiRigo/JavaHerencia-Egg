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
public class Barco {
    
    private String matricula;
    private Integer eslora;
    private Integer anioFabr;
    
    //Constructores

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioFabr) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabr = anioFabr;
    }
    
    //Metodos

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabr() {
        return anioFabr;
    }

    public void setAnioFabr(Integer anioFabr) {
        this.anioFabr = anioFabr;
    }
    
    public double valorModulo(){
        return this.eslora * 10;
    }
    
}
