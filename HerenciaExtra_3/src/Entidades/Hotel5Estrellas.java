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

/*Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.*/

public class Hotel5Estrellas extends Hotel4Estrellas{
    
    private Integer cantSalonConf, cantSuit, cantLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantSalonConf, Integer cantSuit, Integer cantLimosinas, String restaurant, Integer capRestaurant, Gimnasio gym, Integer cantHab, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(restaurant, capRestaurant, gym, cantHab, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonConf = cantSalonConf;
        this.cantSuit = cantSuit;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonConf() {
        return cantSalonConf;
    }

    public void setCantSalonConf(Integer cantSalonConf) {
        this.cantSalonConf = cantSalonConf;
    }

    public Integer getCantSuit() {
        return cantSuit;
    }

    public void setCantSuit(Integer cantSuit) {
        this.cantSuit = cantSuit;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
    public void creaHotel5E(){
        
        super.creaHotel4E();
        System.out.println("SALONES Y SUITS: ");
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuántos Salones de Eventos tiene?");
        this.cantSalonConf = leer.nextInt();
        System.out.println("Cantidad de Suits: ");
        this.cantSuit = leer.nextInt();
        
    }
    
    @Override
    public void precioHabitacion(){
        super.precioHabitacion();
        super.precioHabitacion += this.cantLimosinas * 15;
    }
    
    @Override
    public String toString(){
        System.out.println(super.toString());
        return cantSuit + " Suits y, " + cantLimosinas + " Limusinas";
    }
    
}
