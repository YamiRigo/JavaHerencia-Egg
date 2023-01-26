/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjer_4;

import Entidades.*;

/**
 *
 * @author yamila
 */

/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.*/

public class HerenciaEjer_4 {

    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(3);
        Rectangulo r1 = new Rectangulo(3, 5);
        
        System.out.println("-> AREA CIRCULO <-");
        System.out.println(c1.calculaArea());
        System.out.println("-> PERIMETRO CIRCULO <-");
        System.out.println(c1.calculaPerimetro());
        System.out.println("********");
        System.out.println("-> AREA RECTANGULO <-");
        System.out.println(r1.calculaArea());
        System.out.println("-> PERIMETRO RECTANGULO <-");
        System.out.println(r1.calculaPerimetro());
        
    }
    
}
