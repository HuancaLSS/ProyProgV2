package OfertaAcademica;

import java.util.Scanner;

public class Prefacultativo extends Convocatoria {
    private String modalidad, fechaInicio, fechaFin;
    private String materias[]=new String[8];
    private int nroMaterias;
    Scanner sc = new Scanner(System.in);
    
    public Prefacultativo() {
        
    }
    
    public void leer() {
        super.leer();
        System.out.print("modalidad: ");
        modalidad = sc.next();
        System.out.print("fecha inicio: ");
        fechaInicio = sc.next();
        System.out.print("fecha fin: ");
        fechaFin = sc.next();
        System.out.print("numero de materias: ");
        nroMaterias = sc.nextInt();
        for (int i = 0; i < nroMaterias; i++) {
            System.out.print("materia: ");
            materias[i] = sc.next();
        }
    }
    
    public void mostrar() {
        super.mostrar();
        System.out.println("Modalidad: " + modalidad);
        System.out.println("Fecha Inicio: " + fechaInicio);
        System.out.println("Fecha Fin: " + fechaFin);
        System.out.println("Numero de materias: " + nroMaterias);
        for (int i = 0; i < nroMaterias; i++) {
            System.out.println("  - Materia: " + materias[i]);
        }
    }
    
    public void calcularSemanas() {
        System.out.println("Calculando semanas del prefacultativo...");
    }
}