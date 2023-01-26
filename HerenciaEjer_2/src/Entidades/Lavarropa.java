/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum.*;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class Lavarropa extends Electrodomestico{
    
    private int carga;

    public Lavarropa() {
    }

    public Lavarropa(int carga) {
        this.carga = carga;
    }

    public Lavarropa(int carga, double precio, Color color, double peso, Consumo conEnerg) {
        super(precio, color, peso, conEnerg); //constructor de la clase padre
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

//    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//    el atributo propio de la lavadora.
    
    public void crearLavadora (){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("***** LAVARROPA *****");
        super.crearElectrodomestico();
        System.out.println("Cuántos kilos de ropa carga?");
        this.carga = leer.nextInt();
        
    }
    
//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//    visto en la clase Electrodoméstico también deben afectar al precio.

    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.carga > 30){
            System.out.println("Precio aumentado por carga");
            super.setPrecio(super.getPrecio() + 500);
        }
    }

    @Override
    public String toString() {
        return "Lavarropa capacidad de carga: " + carga + "\n" + super.toString();
    }
    
}
