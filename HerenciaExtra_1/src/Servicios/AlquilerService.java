/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

/**
 *
 * @author yamila
 */
public class AlquilerService {
    
    Scanner leer;

    public AlquilerService() {
        this.leer = new Scanner(System.in);
    }
    
    public void creaPuerto(){
        int op = 0;
        
        do{
            System.out.println("******* ALQUILER DE PUERTO *******");
            System.out.println("** 1. Alquiler de Barco s/Motor **");
            System.out.println("** 2. Alquiler de Velero        **");
            System.out.println("** 3. Alquiler de Yate de Lujo  **");
            System.out.println("** 4. Alquiler de Barco c/Motor **");
            System.out.println("** 5. Salir                     **");
            System.out.println("**********************************");
            System.out.println("\nSelecciona una opción");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    Barco b = creaBarco();
                    System.out.println("El costo del día de amarre es: $" + b.valorModulo());
                    alquila(b);
                    break;
                case 2:
                    Velero v = creaVelero();
                    System.out.println("El costo del día de amarre es: $" + v.valorModulo());
                    alquila(v);
                    break;
                case 3:
                    Yate y = creaYate();
                    System.out.println("El costo del día de amarre es: $" + y.valorModulo());
                    alquila(y);
                    break;
                case 4:
                    Motor m = creaMotor();
                    System.out.println("El costo del día de amarre es: $" + m.valorModulo());
                    alquila(m);
                    break;
                case 5:
                    System.out.println("ADIOS!!");
                
            }
        }while(op != 5);
    }
    
    private Barco creaBarco(){
        Barco b = new Barco();
        System.out.println("Cuál es la Matricual del Barco?");
        b.setMatricula(leer.next().toUpperCase());
        System.out.println("Cuántos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricación: AAAA");
        b.setAnioFabr(leer.nextInt());
        
        return b;
    }
    
    private Motor creaMotor(){
        Motor b = new Motor();
        System.out.println("Cuál es la Matricula del Barco?");
        b.setMatricula(leer.next().toUpperCase());
        System.out.println("Cuántos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricación: AAAA");
        b.setAnioFabr(leer.nextInt());
        System.out.println("Cuántos CV tiene el Motor?");
        b.setCv(leer.nextInt());
        
        return b;
    }
    
    private Velero creaVelero(){
        Velero b = new Velero();
        System.out.println("Cuál es la Matricula del Barco?");
        b.setMatricula(leer.next().toUpperCase());
        System.out.println("Cuántos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricación: AAAA");
        b.setAnioFabr(leer.nextInt());
        System.out.println("Cuántos mastiles tiene?");
        b.setMastiles(leer.nextInt());
        
        return b;
    }
    
    private Yate creaYate(){
        Yate b = new Yate();
        System.out.println("Cuál es la Matricula del Barco?");
        b.setMatricula(leer.next().toUpperCase());
        System.out.println("Cuántos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricación: AAAA");
        b.setAnioFabr(leer.nextInt());
        System.out.println("Cuántos camarotes tiene?");
        b.setCantCamarotes(leer.nextInt());
        System.out.println("Cuál es la potencia del motor en CV?");
        b.setCv(leer.nextInt());
        
        return b;
    }
    
    private void alquila(Barco b){
        Character op;
        String cadenaFecha;
        Alquiler a = new Alquiler();
        System.out.println("Amarra barco al puerto? S/N");
        op = leer.next().toUpperCase().charAt(0);
        
        switch(op){
            case 'S':
                a.getCapitan().setNave(b);
                System.out.println("Excelente!, Cuál es el nombre del Capitan?");
                a.getCapitan().setNombre(leer.next().toUpperCase());
                System.out.println("Número de documento");
                a.getCapitan().setDni(leer.nextLong());
                System.out.println("A partir de este día se alquila");
                a.setFechaAlq(LocalDate.now()); //Tiene logica de que se alquila hoy
                System.out.println("Ingrese la fecha de entrega (dd/mm/aaaa)");
                cadenaFecha = leer.next();
                
                while(validaCFecha(cadenaFecha) == null){
                    cadenaFecha = leer.next();
                }
                a.setFechaDev(validaCFecha(cadenaFecha));
                a.calculaAlquiler();
                break;
            case 'N':
                System.out.println("Gracias, vuelva otro día");
                break;
            default:
                System.out.println("Ingreso un opción no valida, vuelva otro día");
        }
    }
    
    public static LocalDate validaCFecha(String date){
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha;
        
        try{
            fecha = LocalDate.parse(date,dtf);
        }catch(DateTimeParseException e){
            return null;
        }
        
        return fecha;
        
    }
    
}
