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
public final class Estudiante extends Persona{
    
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombreCompleto, String dni, String estadoC) {
        super(nombreCompleto, dni, estadoC);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstudiante" + "\nCurso: " + curso;
    }

    //Servicios
    public void crearEstudiante(){
        System.out.println("CREO UN ESTUDIANTE");
        crearPersona();
        String curso;
        do{
            System.out.println("Indique a que curso pertenece. Matematica/Lengua/Arquitectura/Ingenieria");
            curso = leer.next();
        }while(!curso.equalsIgnoreCase("Matematica") && !curso.equalsIgnoreCase("Lengua")
                && !curso.equalsIgnoreCase("Arquitectura") && !curso.equalsIgnoreCase("Ingenieria"));
        
        setCurso(curso);
    }
    
}
