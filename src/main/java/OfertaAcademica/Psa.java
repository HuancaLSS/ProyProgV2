package OfertaAcademica;

import java.util.Scanner;

public class Psa extends Convocatoria {

    private static final long serialVersionUID = 1L;

    transient Scanner sc = new Scanner(System.in);

    private String fechaExamen;

    private int nroMaterias;
    private String materiaExamen[] = new String[5];

    private int nroCarreras;
    private String carrera[] = new String[20];


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

    @Override
    public void leer() {

        super.leer();

        System.out.print("fecha de examen: ");
        fechaExamen = sc.next();
    }

    @Override
    public void mostrar() {

        super.mostrar();

        System.out.println("Fecha Examen: " + fechaExamen);

        System.out.println("Carreras:");

        for (int i = 0; i < nroCarreras; i++) {
            System.out.println("- " + carrera[i]);
        }

        System.out.println("Materias:");

        for (int i = 0; i < nroMaterias; i++) {
            System.out.println("- " + materiaExamen[i]);
        }
    }
}