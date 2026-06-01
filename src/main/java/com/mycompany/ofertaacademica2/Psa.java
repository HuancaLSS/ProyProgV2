package com.mycompany.ofertaacademica2;

import java.util.Scanner;

public class Psa extends Convocatoria {

    private String fechaExamen;
    private int nroMaterias;
    private String materiaExamen[] = new String[5];
    private String cronograma[][] = new String[5][5];
    private boolean esGeneral;
    private int nroCarreras;
    private String carrera[] = new String[20];
    Scanner sc = new Scanner(System.in);

    public Psa() {

    }

    public void leer() {
        System.out.println("");
        super.leer();
        System.out.print("fecha de examen : ");
        fechaExamen = sc.next();

        System.out.print("es general? (s/n): ");
        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("s")) {
            esGeneral = true;
        } else {
            esGeneral = false;
        }

        System.out.print("numero de carreras: ");
        nroCarreras = sc.nextInt();
        System.out.print("numero de materias a estudiar: ");
        nroMaterias = sc.nextInt();
        for (int i = 0; i < nroMaterias; i++) {
            System.out.print("materia: ");
            materiaExamen[i] = sc.next();
        }
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Fecha Examen: " + fechaExamen);
        System.out.println("Es General: " + esGeneral);
        System.out.println("Numero de Carreras: " + nroCarreras);
        System.out.println("Materias del Examen:");
        for (int i = 0; i < nroMaterias; i++) {
            System.out.println("  - " + materiaExamen[i]);
        }
    }

}
