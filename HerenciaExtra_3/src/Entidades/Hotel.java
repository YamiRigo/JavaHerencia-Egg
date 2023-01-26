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

/*Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones.*/

public class Hotel extends Alojamiento{
    
    protected Integer cantHab, nroCamas, cantPisos;
    protected Double precioHabitacion;

    public Hotel(){
        precioHabitacion();
    }
    
    public Hotel(Integer cantHab, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
    }
    
    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }
    
    public void precioHabitacion(){
        this.precioHabitacion = (double) this.nroCamas + 50;
    }
  
    public void creaHotel(){
        super.creaAlojamiento();
        System.out.println("HOTEL");
        Scanner leer =  new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Camas: ");
        this.nroCamas = leer.nextInt();
        System.out.println("Cuántas habitaciones tiene?");
        this.cantHab = leer.nextInt();
        System.out.println("Cuántos pisos tiene?");
        this.cantPisos = leer.nextInt();
    }
    
    @Override
    public String toString(){
        System.out.println(super.toString());
        return "Tipo Hotel con " + cantHab + " habitaciones y " + nroCamas + " camas, " + cantPisos + " pisos"
                + "\nPrecio de la Habitación: $" + precioHabitacion;
    }

}
