package com.mycompany.ofertaacademica2;

import java.util.Scanner;

public class Facultad {

    private String nombre;
    private int nroCarreras;
    private String direccion;
    private Carrera[] carreras;
    private Prefacultativo[] prefas;
    private Psa[] psa;
    Scanner sc = new Scanner(System.in);

    public Facultad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroCarreras = 0;
        this.carreras = new Carrera[20];
        this.prefas = new Prefacultativo[100];
        this.psa = new Psa[100];
    }

    public void mostrar() {
        System.out.println(nombre + " - " + direccion);
    }

    public void mostrarCarr() {
        if (nroCarreras == 0) {
            System.out.println("No hay carreras registradas.");
            return;
        }
        for (int i = 0; i < nroCarreras; i++) {
            System.out.println((i + 1) + ". " + carreras[i].getNombre());
        }
    }

    public void leerCarr() {
        System.out.print("Ingrese nombre de la carrera: ");
        String nom = sc.next();
        carreras[nroCarreras] = new Carrera(nom);
        nroCarreras++;
    }

    public void eliminarCarr() {
        mostrarCarr();
        if (nroCarreras == 0) return;
        System.out.print("Ingrese el numero de carrera a eliminar: ");
        int n = sc.nextInt();
        if (n > 0 && n <= nroCarreras) {
            for (int j = n - 1; j < nroCarreras - 1; j++) {
                carreras[j] = carreras[j + 1];
            }
            carreras[nroCarreras - 1] = null;
            nroCarreras--;
        }
    }

    public void adicionarPsa(Psa p) {
        int i = 0;
        while (i < psa.length && psa[i] != null) {
            i++;
        }
        if (i < psa.length) {
            psa[i] = p;
            System.out.println("PSA añadida correctamente.");
        } else {
            System.out.println("Arreglo de PSA lleno.");
        }
    }

    public void adicionarPrefa(Prefacultativo pre) {
        int i = 0;
        while (i < prefas.length && prefas[i] != null) {
            i++;
        }
        if (i < prefas.length) {
            prefas[i] = pre;
            System.out.println("Prefacultativo añadido correctamente.");
        } else {
            System.out.println("Arreglo de Prefacultativos lleno.");
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void mostrarConvocatorias() {
        boolean tieneConvocatorias = false;
        
        for (int i = 0; i < psa.length; i++) {
            if (psa[i] != null) {
                System.out.println("[Tipo: Examen PSA]");
                psa[i].mostrar();
                tieneConvocatorias = true;
            }
        }
        
        for (int i = 0; i < prefas.length; i++) {
            if (prefas[i] != null) {
                System.out.println("[Tipo: Curso Prefacultativo]");
                prefas[i].mostrar();
                tieneConvocatorias = true;
            }
        }
        
        if (!tieneConvocatorias) {
            System.out.println("  No hay convocatorias vigentes en esta facultad.");
        }
    }
}