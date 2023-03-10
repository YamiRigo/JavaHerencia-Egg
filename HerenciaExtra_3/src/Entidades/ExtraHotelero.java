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

/*En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.*/

public abstract class ExtraHotelero extends Alojamiento{
    
    protected boolean privado;
    protected Integer mts2;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, Integer mts2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mts2 = mts2;
    }
    
    public void creaExtraHotel(){
        
        super.creaAlojamiento();
        System.out.println("ESTABLECIMIENTO EXTRA HOTELERO");
        Scanner leer = new Scanner(System.in);
        System.out.println("Es un Establecimiento Privado? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        
        if(op == 'S'){
            this.privado = true;
        }else if(op == 'N'){
            this.privado = false;
        }else{
            System.out.println("Ingreso una opción no valida, se tomará por defecto que es privado");
            this.privado = true;
        }
        
        System.out.println("Cuántos Metros cuadrados tiene?");
        this.mts2 = leer.nextInt();
        
    }
    
    @Override
    public String toString(){
        String priv = "Publico";
        if(privado){
            priv = "Privado";
        }
        System.out.println(super.toString());
        return "Establecimiento Extra Hotelero de tipo " + priv + " con " + mts2 + " mts2";
    }
    
}
