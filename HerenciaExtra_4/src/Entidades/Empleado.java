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
public class Empleado extends Persona{
    
    protected int anioIncorp;
    protected String numDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorp, String numDespacho, String nombreCompleto, String dni, String estadoC) {
        super(nombreCompleto, dni, estadoC);
        this.anioIncorp = anioIncorp;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorp() {
        return anioIncorp;
    }

    public void setAnioIncorp(int anioIncorp) {
        this.anioIncorp = anioIncorp;
    }

    public String getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(String numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpleado" + "\nAño de incorporación: " + anioIncorp + "\nDespacho" + numDespacho;
    }

    //Servicios
    public void crearEmpleado(){
        crearPersona();
        System.out.println("En que año se incorporo al establecimiento?");
        setAnioIncorp(leer.nextInt());
        System.out.println("Indique a que despacho está asignado");
        setNumDespacho(leer.next());
    }
    
    
}
