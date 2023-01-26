/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjer_3;

import Entidades.*;
import Enum.*;
import java.util.ArrayList;

/**
 *
 * @author yamila
 */

/*Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/

public class HerenciaEjer_3 {

    public static void main(String[] args) {
        
        double total = 0, lavaT = 0, tvT = 0;
        ArrayList<Electrodomestico> comercio = new ArrayList<>();
        
        Lavarropa l1 = new Lavarropa(15, 48000d, Color.BLANCO, 60d, Consumo.A);
        comercio.add(l1);
        Lavarropa l2 = new Lavarropa(35, 78000d, Color.AZUL, 68d, Consumo.A);
        comercio.add(l2);
        System.out.println("*********");
        Televisor t1 = new Televisor(32, true, 25000d, Color.GRIS, 8d, Consumo.D);
        comercio.add(t1);
        Televisor t2 = new Televisor(55, true, 150000d, Color.NEGRO, 12d, Consumo.D);
        comercio.add(t2);
        
        for(Electrodomestico aux : comercio){
            aux.precioFinal();
            System.out.println(aux);
            total += aux.getPrecio();
            if(aux instanceof Lavarropa){
                lavaT += aux.getPrecio();
            }else if(aux instanceof Televisor){
                tvT += aux.getPrecio();
            }
        }
        
        System.out.println("*********");
        
        System.out.println("El precio de todos los Lavarropas es: $" + lavaT);
        System.out.println("El precio de todos los Televisores es: $" + tvT);
        System.out.println("El precio total de todos los electrodomesticos es: $" + total);
        
    }
    
}
