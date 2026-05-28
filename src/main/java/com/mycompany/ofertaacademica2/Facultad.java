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
        for (int i = 0; i < 20; i++) {
            CR[i] = new Carrera();
        }

    }

    public void mostrar() {
        System.out.println("nombre: " + nombre + " direccion: " + direccion);
    }

    public void mostrarCarr() {
        if (nroCarreras == 0) {
            System.out.println("");
            System.out.println("No hay carreras registradas...");
        } else {
            for (int i = 0; i < nroCarreras; i++) {
                System.out.print(i + 1 + " ");
                CR[i].mostrar();
            }
        }

    }

    public void leerCarr() {
        CR[nroCarreras].leer();
        nroCarreras++;
    }

    public void eliminarCarr() {
        System.out.println("");
        System.out.print("Ingrese Nro de la Carrera: ");
        int x = sc.nextInt();
        for (int i = 0; i < nroCarreras; i++) {
            if (i + 1 == x) {
                for (int j = i; j < nroCarreras; j++) {
                    CR[j] = CR[j + 1];
                }
                nroCarreras--;
            }
        }
    }

}
