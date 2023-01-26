/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author yamila
 */

/*Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.*/

public class Camping extends ExtraHotelero{
    
    private Integer capMaxCarpas, cantBanio;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(Integer capMaxCarpas, Integer cantBanio, boolean restaurant, boolean privado, Integer mts2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanio = cantBanio;
        this.restaurant = restaurant;
    }

    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantBanio() {
        return cantBanio;
    }

    public void setCantBanio(Integer cantBanio) {
        this.cantBanio = cantBanio;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }
    
    public void creaCamping(){
        
        super.creaExtraHotel();
        System.out.println("CAMPING");
        Scanner leer = new Scanner(System.in);
        System.out.println("Capacidad Maxima de Carpas?");
        this.capMaxCarpas = leer.nextInt();
        System.out.println("Cantidad de Baños?");
        this.cantBanio = leer.nextInt();
        System.out.println("Tiene Restaurant? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        
        if(op == 'S'){
            this.restaurant = true;
        }else if(op == 'N'){
            this.restaurant = false;
        }else{
            System.out.println("Ingreso una opción no valida, se tomará por defecto que No tiene");
            this.restaurant = false;
        } 
        
    }
    
    @Override
    public String toString(){
        String rest = "No posee";
        if(restaurant){
            rest = "Si posee";
        }
        System.out.println(super.toString());
        return "Camping: " + capMaxCarpas + " carpas, " + cantBanio + " baños" 
                +"\nRestaurant " + rest;
    }
    
    
}
