package OfertaAcademica;

import java.util.Scanner;

public class Psa extends Convocatoria {

    private String fechaExamen;
    private int nroMaterias;
    private String materiaExamen[] = new String[5];
    private int nroCarreras;
    private String carrera[] = new String[20];
    Scanner sc = new Scanner(System.in);

    public Psa() {

    }

    public String[] getCarrera() {
        return carrera;
    }

    public void setCarrera(String[] carrera) {
        this.carrera = carrera;
    }

    public String[] getMateriaExamen() {
        return materiaExamen;
    }

    public void setMateriaExamen(String[] materiaExamen) {
        this.materiaExamen = materiaExamen;
    }

    public int getNroCarreras() {
        return nroCarreras;
    }

    public void setNroCarreras(int nroCarreras) {
        this.nroCarreras = nroCarreras;
    }

    public int getNroMaterias() {
        return nroMaterias;
    }

    public void setNroMaterias(int nroMaterias) {
        this.nroMaterias = nroMaterias;
    }
    

    public void leer() {
        System.out.println("");
        super.leer();
        System.out.print("fecha de examen : ");
        fechaExamen = sc.next();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Fecha Examen: " + fechaExamen);
//        System.out.println("Es General: " + esGeneral);
//        System.out.println("Numero de Carreras: " + nroCarreras);
        System.out.println("Carreras:");
        for (int i = 0; i < nroCarreras; i++) {
            System.out.print("  - " + carrera[i]);
        }
        System.out.println("");
        System.out.println("Materias del Examen:");
        for (int i = 0; i < nroMaterias ; i++) {
            System.out.print("  - " + materiaExamen[i]);
        }
        System.out.println("");
    }

}
