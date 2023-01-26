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
public final class Profesor extends Empleado{
    
    private String dpto;

    public Profesor() {
    }

    public Profesor(String dpto, int anioIncorp, String numDespacho, String nombreCompleto, String dni, String estadoC) {
        super(anioIncorp, numDespacho, nombreCompleto, dni, estadoC);
        this.dpto = dpto;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesor" + "\nDepartamento: " + dpto;
    }

    //Servicios
    public void crearProfesor(){
        System.out.println("CREO UN PROFESOR");
        crearEmpleado();
        String asignatura;
        
        do{
            System.out.println("Indique a que departamento pertenece. Matematica/Lengua/Aquitectura/Ingenieria");
            asignatura = leer.next();
        }while(!asignatura.equalsIgnoreCase("Matematica") && !asignatura.equalsIgnoreCase("Lengua")
                && !asignatura.equalsIgnoreCase("Arquitectura") && !asignatura.equalsIgnoreCase("Ingenieria"));
        
        setDpto(asignatura);
    }
    
}
