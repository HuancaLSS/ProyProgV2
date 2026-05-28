package com.mycompany.ofertaacademica2;

import java.util.*;

public class Facultad {

    private String nombre, direccion;
    private int nroCarreras;
    private Carrera[] CR;
    Scanner sc = new Scanner(System.in);

    public Facultad(String n, String d) {
        nombre = n;
        direccion = d;
        nroCarreras = 0;
        CR = new Carrera[20];
//        for (int i = 0; i < 20; i++) {
//            CR[i] = new Carrera(0,"","","","",9);
//        }

    }
    
    public void mostrar (){
        System.out.println("nombre: " + nombre + " direccion: " + direccion);
    }
}
