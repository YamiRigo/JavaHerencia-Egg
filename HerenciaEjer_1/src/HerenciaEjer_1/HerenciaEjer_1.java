/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjer_1;

import Entidades.*;

/**
 *
 * @author yamila
 */

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.*/

public class HerenciaEjer_1 {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberma");
        perro1.seAlimenta();
        
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.seAlimenta();
        
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato.seAlimenta();
        
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.seAlimenta();
        
        //Accedo al toString de Animal
        System.out.println(caballo);
    }
    
}
