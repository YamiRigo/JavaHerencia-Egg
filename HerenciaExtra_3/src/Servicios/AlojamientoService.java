/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class AlojamientoService {
    
    Scanner leer;

    public AlojamientoService() {
        this.leer = new Scanner(System.in);
    }
    
    public void menu(ArrayList<Alojamiento> al){
        
        int op = 0;
        do{
            System.out.println("\n");
            System.out.println("*********  ALOJAMIENTO  *********");
            System.out.println("** 1. Todos los Alojamientos   **");
            System.out.println("** 2. Hoteles por precio       **");
            System.out.println("** 3. Campings c/restaurant    **");
            System.out.println("** 4. Residencias c/descuento  **");
            System.out.println("** 5. Salir                    **");
            System.out.println("*********************************");
            System.out.println("\nSeleccione una opción");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    muestraTodos(al);
                    break;
                case 2:
                    hotelesPrecio(al);
                    break;
                case 3:
                    campingResto(al);
                    break;
                case 4:
                    residenciaDesc(al);
                    break;
                case 5:
                    System.out.println("ADIOS!");
                    break;
                default:
                    System.out.println("Ingreso una opción no valida");
                    break;
            }
        }while(op != 5);
        
    }
    
    private void muestraTodos(ArrayList<Alojamiento> lista){
        lista.forEach(aux -> {
            System.out.println(aux);
        });
    }
    
    private void hotelesPrecio(ArrayList<Alojamiento> lista){
        ArrayList<Alojamiento> auxiliar = new ArrayList<>();
        
        lista.stream().filter(aux -> (aux instanceof Hotel)).forEachOrdered(aux -> {
            auxiliar.add(aux);
        });
        
        ArrayList<Hotel> hoteles = new ArrayList(auxiliar);
        Collections.sort(hoteles,porPrecio);
        
        hoteles.forEach(aux -> {
            System.out.println(aux);
        });
    }
    
    public static Comparator<Hotel> porPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return h2.getPrecioHabitacion().compareTo(h1.getPrecioHabitacion());
        }
    };
    
    private void campingResto(ArrayList<Alojamiento> lista){
        for(Alojamiento aux : lista){
            if(aux instanceof Camping){
                if(((Camping)aux).isRestaurant()){
                    System.out.println(aux);
                }
            }
        }
    }
    
    private void residenciaDesc(ArrayList<Alojamiento> lista){
        for(Alojamiento aux : lista){
            if(aux instanceof Residencia){
                if(((Residencia)aux).isDesGremio()){
                    System.out.println(aux);
                }
            }
        }
    }
    
}
