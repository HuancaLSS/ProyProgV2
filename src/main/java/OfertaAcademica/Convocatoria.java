package OfertaAcademica;

import java.io.Serializable;
import java.util.*;

public abstract class Convocatoria implements Serializable {

    private static final long serialVersionUID = 1L;

    transient Scanner sc = new Scanner(System.in);

    private int semestre, gestion;
    private String inicioInscripcion, finInscripcion, telefono, direccion;
    private String requisitos[] = new String[5];
    private double costo;

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
        costo = sc.nextDouble();

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
        System.out.println("tipo de convocatoria:");
        System.out.println("1 : Examen PSA");
        System.out.println("2 : Curso Prefacultativo");
        System.out.println("0 : Volver");

        System.out.print("Elige una opcion: ");

        int opc = sc.nextInt();

        if (opc == 1) {

            Psa p = new Psa();
            p.leer();
            return p;

        } else if (opc == 2) {

            Prefacultativo pre = new Prefacultativo();
            pre.leer();
            return pre;

        } else {

            return null;
        }
    }

    public void mostrar() {

        System.out.println("Gestion: " + gestion);
        System.out.println("Semestre: " + semestre);
        System.out.println("Inicio Inscripcion: " + inicioInscripcion);
        System.out.println("Fin Inscripcion: " + finInscripcion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
        System.out.println("Costo: " + costo + " Bs.");

        System.out.println("Requisitos:");

        for (int i = 0; i < requisitos.length; i++) {

            if (requisitos[i] != null &&
                !requisitos[i].isEmpty()) {

                System.out.println("- " + requisitos[i]);
            }
        }
    }

    public void calcularDias() {
        System.out.println("Calculando dias...");
    }

    public void mostrarCosto() {
        System.out.println("Costo: " + costo);
    }
}