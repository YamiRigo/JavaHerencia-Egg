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

/*Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.*/

public class Residencia extends ExtraHotelero{
    
    private int cantHab;
    private boolean desGremio;
    private boolean campDepor;

    public Residencia() {
    }

    public Residencia(int cantHab, boolean desGremio, boolean campDepor, boolean privado, Integer mts2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.desGremio = desGremio;
        this.campDepor = campDepor;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDesGremio() {
        return desGremio;
    }

    public void setDesGremio(boolean desGremio) {
        this.desGremio = desGremio;
    }

    public boolean isCampDepor() {
        return campDepor;
    }

    public void setCampDepor(boolean campDepor) {
        this.campDepor = campDepor;
    }
    
    public void creaResidencia(){
        
        super.creaExtraHotel();
        System.out.println("RESIDENCIA");
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuántas Habitaciones tiene?");
        this.cantHab = leer.nextInt();
        System.out.println("Tiene Campo Deportivo? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        
        if(op == 'S'){
            this.campDepor = true;
        }else if(op == 'N'){
            this.campDepor = false;
        }else{
            System.out.println("Ingreso una opción no valida, se tomará por defecto que No tiene");
            this.campDepor = false;
        }
        
        System.out.println("Tiene descuento para Gremios? S/N");
        op = leer.next().toUpperCase().charAt(0);
        
        if(op == 'S'){
            this.desGremio = true;
        }else if(op == 'N'){
            this.desGremio = false;
        }else{
            System.out.println("Ingreso una opción no valida, se tomará por defecto que No tiene");
            this.desGremio = false;
        }
        
    }
    
    @Override
    public String toString(){
        String desc = "No tiene";
        String camp = "No tiene";
        if(desGremio){
            desc = "Si tiene";
        }
        if(campDepor){
            camp = "Si tiene";
        }
        System.out.println(super.toString());
        return "Residencia: " + cantHab + " habitaciones, " + desc + " Descuento a Gremio y " + camp + " Campo Deportivo";
    }
    
}
