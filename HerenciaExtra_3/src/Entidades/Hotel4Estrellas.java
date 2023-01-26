/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum.Gimnasio;
import java.util.Scanner;

/**
 *
 * @author yamila
 */

/*Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.*/

public class Hotel4Estrellas extends Hotel{
    
    private String restaurant;
    private Integer capRestaurant;
    private Gimnasio gym;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String restaurant, Integer capRestaurant, Gimnasio gym, Integer cantHab, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHab, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.restaurant = restaurant;
        this.capRestaurant = capRestaurant;
        this.gym = gym;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public Integer getCapRestaurant() {
        return capRestaurant;
    }

    public void setCapRestaurant(Integer capRestaurant) {
        this.capRestaurant = capRestaurant;
    }

    public Gimnasio getGym() {
        return gym;
    }

    public void setGym(Gimnasio gym) {
        this.gym = gym;
    }
    
    public void creaHotel4E(){
        super.creaHotel();
        System.out.println("RESTAURANT Y GIMNASIO: ");
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuál es el nombre del Restorant");
        this.restaurant = leer.next().toUpperCase();
        System.out.println("Cantidad de comensales: ");
        this.capRestaurant = leer.nextInt();
        System.out.println("De qué Categoria es el Gimnasio? A ó B");
        char gy = leer.next().toUpperCase().charAt(0);
        this.gym = compruebaGym(gy);
    }
    
    private Gimnasio compruebaGym(char letra){
        Gimnasio g;
        
        switch(letra){
            case 'A':
                g = Gimnasio.A;
                break;
            case 'B':
                g = Gimnasio.B;
                break;
            default:
                System.out.println("Ingreso una opción no valida, se asignará tipo B");
                g = Gimnasio.B;
                break;
        }
        return g;
    }
    
    @Override
    public void precioHabitacion(){
        super.precioHabitacion();
        double vAgregado = 0;
        
        if(this.capRestaurant > 50){
            vAgregado += 50;
        }else if(this.capRestaurant > 30){
            vAgregado += 30;
        }else{
            vAgregado += 10;
        }
        
        if(this.gym == Gimnasio.A){
            vAgregado += 50;
        }else{
            vAgregado += 30;
        }
        
        super.precioHabitacion += vAgregado;
    }
    
    @Override
    public String toString(){
        System.out.println(super.toString());
        return "Restaurant: " + restaurant + " - Capacidad " + capRestaurant + " Comensales"
                + "\nGimnasio de tipo: " + gym;
    }
    
}
