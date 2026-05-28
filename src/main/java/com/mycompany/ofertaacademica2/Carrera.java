
package com.mycompany.ofertaacademica2;

import java.util.Scanner;


public class Carrera {
    private String nombre, direccion, telefono;
    private int nroSemestres;
    Scanner sc = new Scanner(System.in);
    
    public Carrera(){}
    
    public Carrera(String n, String d, String t, int ns){
        nombre = n;
        direccion = d;
        telefono = t;
        nroSemestres = ns;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre+" Direccion: "+direccion+" Telefonio: "+telefono+" Nro de semestres: "+nroSemestres);
    }
    
    public void leer(){
        System.out.println("");
        System.out.print("Nombre: ");
        nombre = sc.next();
        System.out.print("Direccion: ");
        direccion = sc.next();
        System.out.print("Telefono: ");
        telefono = sc.next();
        System.out.print("nro de semestres: ");
        nroSemestres = sc.nextInt(); 
    }
}
