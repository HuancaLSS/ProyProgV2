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
        if (nroCarreras == 0) {
            return;
        }
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

    public void asignarCarr(Psa p) {
        System.out.print("es general? (s/n): ");
        String respuesta = sc.next();
        String[] carr = new String[20];
        int nro = 0;
        if (this.nroCarreras > 0) {
            if (respuesta.trim().equals("s")) {

                for (int i = 0; i < nroCarreras; i++) {
                    carr[i] = carreras[i].getNombre();

                }
                nro = nroCarreras;

            } else if (respuesta.trim().equals("n")) {
                System.out.print("Nro de carreras: ");
                nro = sc.nextInt();
                mostrarCarr();
                System.out.println("");
                System.out.println("Seleccione carreras ( Nro. )");
                for (int i = 0; i < nro; i++) {
                    System.out.print("Carrera Nro. " + (i + 1) + " : ");
                    int x = sc.nextInt();
                    carr[i] = carreras[x - 1].getNombre();
                }

            } else {
                return;
            }
            p.setNroCarreras(nro);
            p.setCarrera(carr);

        } else {
            System.out.println("No existen carreras registradas...");
        }
    }

    //SECCION DE CONVOCATORIAS
    public int asignarMat(String materiaExamen[]) {
        System.out.print("numero de materias a estudiar: ");
        int nroMaterias = sc.nextInt();
        for (int i = 0; i < nroMaterias; i++) {
            System.out.print("Materia " + (i + 1) + " : ");
            materiaExamen[i] = sc.next();
        }
        return nroMaterias;
    }

    public void adicionarPsa(Psa p) {
        int i = 0;
        while (i < psa.length && psa[i] != null) {
            i++;
        }
        if (i < psa.length) {
            psa[i] = p;
            asignarCarr(psa[i]);
            String[] materias = new String[5];
            psa[i].setNroMaterias(asignarMat(materias));
            psa[i].setMateriaExamen(materias);
            System.out.println("PSA añadido correctamente.");
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

    public void eliminarConv(int tipo) {
        if (tipo == 1) { // esto es para el psa
            int totalPsa = 0;
            System.out.println("Convocatorias PSA Disponibles: ");
            System.out.println("");
            for (int i = 0; i < psa.length; i++) {
                if (psa[i] != null) {
                    System.out.println("Convocatoria PSA Numero: [" + (i + 1) + "]");
                    totalPsa++;
                }
            }
            if (totalPsa == 0) {
                System.out.println("No hay convocatorias PSA para eliminar.");
                return;
            }
            System.out.print("Ingrese el numero de la convocatoria PSA a eliminar: ");
            int pos = sc.nextInt() - 1;

            if (pos >= 0 && pos < psa.length && psa[pos] != null) {
                psa[pos] = null;
                System.out.println("Convocatoria PSA eliminada con exito.");
            } else {
                System.out.println("Numero de convocatoria no válido.");
            }
        } else if (tipo == 2) { // para el prefa
            int totalPrefas = 0;
            System.out.println("Convocatorias Prefacultativos Disponibles: ");
            for (int i = 0; i < prefas.length; i++) {
                if (prefas[i] != null) {
                    System.out.println("Convocatoria Prefacultativo Numero: [" + (i + 1) + "]");
                    totalPrefas++;
                }
            }
            if (totalPrefas == 0) {
                System.out.println("No hay convocatorias de Prefacultativos para eliminar.");
                return;
            }
            System.out.print("Ingrese el numero del Prefacultativo a eliminar: ");
            int pos = sc.nextInt() - 1;

            if (pos >= 0 && pos < prefas.length && prefas[pos] != null) {
                prefas[pos] = null;
                System.out.println("Convocatoria de Prefacultativo eliminada con exito.");
            } else {
                System.out.println("Numero de convocatoria no valido.");
            }
        } else {
            System.out.println("Tipo de convocatoria no valido.");
        }
    }
}
