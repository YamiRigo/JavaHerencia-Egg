/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


/**
 *
 * @author yamila
 */
public final class PersonalDeServicio extends Empleado{
    
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, int anioIncorp, String numDespacho, String nombreCompleto, String dni, String estadoC) {
        super(anioIncorp, numDespacho, nombreCompleto, dni, estadoC);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPersonal De Servicio" + "\nSección: " + seccion;
    }

    //Servicios
    public void crearPersonalServ(){
        System.out.println("CREO UN PERSONAL DE SERVICIO");
        crearEmpleado();
        String sec;
        
        do{
            System.out.println("Indique a que sección pertenece. Biblioteca/Decanato/Secretaria");
            sec = leer.next();
        }while(!sec.equalsIgnoreCase("Biblioteca") && !sec.equalsIgnoreCase("Decanato") && !sec.equalsIgnoreCase("Secretaria"));
        
        setSeccion(sec);
        
    }
    
}
