/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidades.*;
import java.util.ArrayList;

/**
 *
 * @author yamila
 */
public class Utilidad {
    
    final static Scanner leer = new Scanner(System.in);
    
    public static void creando(){
        ArrayList<Persona> lista = new ArrayList<>();
        crearEstudiante(lista);
        crearEmpleado(lista);
        
        
        menu();
        int opc;
        
        do{
            System.out.println("Ingrese opción");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    cambiarEC(lista);
                    break;
                case 2:
                    reasignarDespacho(lista);
                    break;
                case 3:
                    cambiarCurso(lista);
                    break;
                case 4:
                    reasignarCurso(lista);
                    break;
                case 5:
                    reasignarPersServ(lista);
                    break;
                case 6:
                    mostrarPersonas(lista);
                    break;
                case 7:
                    menu();
                    break;
                case 8:
                    System.out.println("HA SALIDO");
                    break;
                default:
                    System.out.println("OPCIÓN INVALIDA");
            }
        }while(opc != 8);
    }
    
    public static void menu(){
        System.out.println("*********** MENU ************");
        System.out.println("** 1. Cambiar Estado Civil **");
        System.out.println("** 2. Reasignar Despacho   **");
        System.out.println("** 3. Cambiar Curso        **");
        System.out.println("** 4. Reasignar Profesor   **");
        System.out.println("** 5. Reasignar Personal   **");
        System.out.println("** 6. Mostrar Personas     **");
        System.out.println("** 7. Mostrar Menu         **");
        System.out.println("** 8. Salir                **");
        System.out.println("*****************************");
    }
    
    public static void crearEmpleado(ArrayList<Persona>lista){
        for (int i = 0; i < 1; i++) {
            Profesor prof = new Profesor();
            prof.crearProfesor();
            lista.add(prof);
            PersonalDeServicio perServ = new PersonalDeServicio();
            perServ.crearPersonalServ();
            lista.add(perServ);
        }
    }
    
    public static void crearEstudiante(ArrayList<Persona>lista){
        for (int i = 0; i < 1; i++) {
            Estudiante est = new Estudiante();
            est.crearEstudiante();
            lista.add(est);
        }
    }
    
    public static void cambiarEC(ArrayList<Persona>lista){
        for(Persona aux : lista){
            if(validarDNI(lista)){
                System.out.println("Indique su nuevo estado civil");
                String estC = leer.next();
                aux.setEstadoC(estC);
                break;
            }else{
                System.out.println("El DNI ingresado es incorrecto");
            }
        }
    }
    
    public static void reasignarDespacho(ArrayList<Persona>lista){
        for(Persona aux : lista){
            if(aux instanceof Profesor){
                if(validarDNI(lista)){
                    System.out.println("Indique su nuevo despacho");
                    String desp = leer.next();
                    ((PersonalDeServicio)aux).setNumDespacho(desp);
                    break;
                }else{
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }
            }
            if(aux instanceof PersonalDeServicio){
                if(validarDNI(lista)){
                    System.out.println("Indique su nuevo despacho");
                    String despacho = leer.next();
                    ((PersonalDeServicio)aux).setNumDespacho(despacho);
                    break;
                }else{
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }
            }
        }
    }
    
    public static void cambiarCurso(ArrayList<Persona>lista){
        String newCurso;
        for(Persona aux : lista){
            if(aux instanceof Estudiante){
                if(validarDNI(lista)){
                    do{
                        System.out.println("Indique el nuevo newCurso a cambiarse. Matematica/Lengua/Arquitectura/Ingenieria");
                        newCurso = leer.next();
                    }while(!newCurso.equalsIgnoreCase("Matematica") && !newCurso.equalsIgnoreCase("Lengua")
                            && !newCurso.equalsIgnoreCase("Arquitectura") && !newCurso.equalsIgnoreCase("Ingenieria"));
                    ((Estudiante)aux).setCurso(newCurso);
                    break;
                }else{
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }
            }
        }
    }
    
    public static void reasignarCurso(ArrayList<Persona>lista){
        String newCurso;
        for(Persona aux : lista){
            if(aux instanceof Estudiante){
                if(validarDNI(lista)){
                    do{
                        System.out.println("Indique a que curso va a cambiar el profesor. Matematica/Lengua/Arquitectura/Ingenieria");
                        newCurso = leer.next();
                    }while(!newCurso.equalsIgnoreCase("Matematica") && !newCurso.equalsIgnoreCase("Lengua")
                            && !newCurso.equalsIgnoreCase("Arquitectura") && !newCurso.equalsIgnoreCase("Ingenieria"));
                    ((Profesor)aux).setDpto(newCurso);
                    break;
                }else{
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }
            }
        }
    }
    
    public static void reasignarPersServ(ArrayList<Persona>lista){
        String newSeccion;
        for(Persona aux : lista){
            if(aux instanceof PersonalDeServicio){
                if(validarDNI(lista)){
                    do{
                        System.out.println("Indique a que newSeccionción se cambia. Biblioteca/Decanato/Secretaria");
                        newSeccion = leer.next();
                    }while(!newSeccion.equalsIgnoreCase("Biblioteca") && !newSeccion.equalsIgnoreCase("Decanato") 
                            && !newSeccion.equalsIgnoreCase("Secretaria"));
                    ((PersonalDeServicio)aux).setSeccion(newSeccion);
                    break;
                }else{
                    System.out.println("El DNI ingresado es incorrecto");
                    break;
                }
            }
        }
    }
    
    public static void mostrarPersonas(ArrayList<Persona>listas){
        for(Persona lista : listas){
            System.out.println(lista);
        }
    }
    
    public static boolean validarDNI(ArrayList<Persona>lista){
        System.out.println("Ingrese el DNI");
        String auxDNI = leer.next();
        
        for(Persona aux : lista){
            if(aux.getDni().equalsIgnoreCase(auxDNI)){
                return true;
            }
        }
        return false;
    }
    
}
