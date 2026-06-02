package com.mycompany.ofertaacademica2;

import java.util.*;

public class Convocatoria {

    private int semestre, gestion;
    private String inicioInscripcion, finInscripcion, telefono, direccion;
    private String requisitos[] = new String[5];
    private double costo;
    Scanner sc = new Scanner(System.in);

    public Convocatoria() {
    }

    public void leer() {
        System.out.println("");
        System.out.print("inicio de inscripcion: ");
        inicioInscripcion = sc.next();
        System.out.print("fin de inscripcion: ");
        finInscripcion = sc.next();
        System.out.print("telefono: ");
        telefono = sc.next();
        System.out.print("direccion: ");
        direccion = sc.next();
        System.out.print("costo: ");
        costo = sc.nextInt();
        semestre = 1;
        gestion = 2026;
        requisitos[0] = "ci";
        requisitos[1] = "certificado de Nacimiento";
        requisitos[2] = "foto 3x3";
        requisitos[3] = "Fotocopia de diploma de bachiller";
        requisitos[4] = "formulario de inscripcion";
    }

    public static Convocatoria crearConvocatoria() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("tipo de convocatoria: ");
        System.out.println("   1 : Examen PSA");
        System.out.println("   2 : Curso Prefacultativo");
        System.out.println("   0 : Volver atras");
        System.out.println("");
        System.out.print("Elige una opcion: ");
        int opc = sc.nextInt();

        if (opc == 1) {
            Psa nuevaPsa = new Psa();
            nuevaPsa.leer();
            return nuevaPsa;
        } else if (opc == 2) {
            Prefacultativo nuevoPre = new Prefacultativo();
            nuevoPre.leer();
            return nuevoPre;
        } else if (opc == 0) {
            System.out.println("Cancelando registro. Volviendo al menu principal...");
            return null;
        } else {
            System.out.println("Opcion no válida.");
            return null;
        }
    }

    public void mostrar() {
        System.out.println("");
        System.out.println("Gestion:             " + gestion);
        System.out.println("Semestre:            " + semestre);
        System.out.println("Inicio Inscripcion:  " + inicioInscripcion);
        System.out.println("Fin Inscripcion:     " + finInscripcion);
        System.out.println("Telefono:            " + telefono);
        System.out.println("Direccion:           " + direccion);
        System.out.println("Costo:               " + costo + " Bs.");
        System.out.println("Requisitos:");

        for (int i = 0; i < requisitos.length; i++) {
            if (requisitos[i] != null && !requisitos[i].isEmpty()) {
                System.out.println("  - " + requisitos[i]);
            } 
        }
    }

    public void calcularDias() {
        System.out.println("Calculando días...");
    }

    public void mostrarCosto() {
        System.out.println("El costo es: " + costo + " Bs.");
    }
}