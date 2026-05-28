package com.mycompany.ofertaacademica2;

import java.util.*;

public class Universidad {

    private String nombre;
    private int nroFacultades;
    private Facultad[] facultades;
    Scanner sc = new Scanner(System.in);

    public Universidad() {
        nombre = "Universidad mayor de San Andres";
        nroFacultades = 13;
        facultades = new Facultad[20];

        facultades[0] = new Facultad("Facultad de Agronomia", "Av. Saavedra");
        facultades[1] = new Facultad("Facultad de Arquitectura", "Calle Potosi ");
        facultades[2] = new Facultad("Facultad de Ciencias Economicas y Financieras", "Av. 6 de Agosto");
        facultades[3] = new Facultad("Facultad de Ciencias Farmaceuticas y Bioquimicas", "Calle Landaeta");
        facultades[4] = new Facultad("Facultad de Ciencias Geologicas", "Calle 27 de Cota Cota");
        facultades[5] = new Facultad("Facultad de Ciencias Puras y Naturales", "Calle 27 de Cota Cota");
        facultades[6] = new Facultad("Facultad de Ciencias Sociales", "Av. 6 de Agosto");
        facultades[7] = new Facultad("Facultad de Derecho y Ciencias Politicas", "Av. 6 de Agosto");
        facultades[8] = new Facultad("Facultad de Humanidades y Ciencias de la Educacion", "Calle Potosi");
        facultades[9] = new Facultad("Facultad de Ingenieria", "Calle 27 de Cota Cota");
        facultades[10] = new Facultad("Facultad de Medicina, Enfermeria, Nutricion y Tecnologia Medica", "Av. Saavedra");
        facultades[11] = new Facultad("Facultad de Odontologia", "Av. Saavedra");
        facultades[12] = new Facultad("Facultad de Tecnologia", "Av. Villazon");

        for (int j = nroFacultades; j < 20; j++) {
            facultades[j] = new Facultad("", "");
        }
    }

    public void mostrar() {
        System.out.println("nombre" + nombre);
    }

    public void mostrarFacu() {
        for (int i = 0; i < nroFacultades; i++) {
            System.out.print(i + 1 + " ");
            facultades[i].mostrar();
        }
    }

    public void leerFacu() {
        System.out.println("");
        System.out.print("Nombre: ");
        String nom = sc.next();
        System.out.print("direccion: ");
        String direc = sc.next();
        facultades[nroFacultades] = new Facultad(nom, direc);
        nroFacultades++;
    }

    public void eliminarFacu() {
        mostrarFacu();
        System.out.println("");
        System.out.print("ingrese numero de facultad: ");
        int n=sc.nextInt();
        for (int i = 0; i < nroFacultades; i++) {
            if (i+1==n) {
                for (int j=i; j < nroFacultades; j++) {
                    facultades[j]=facultades[j+1];
                }
                nroFacultades--;
            }
        }
    }

    public void gestionarFacu() {
        boolean sw = true;
        while (sw) {
            System.out.println(" ");
            System.out.println("   1  : Mostrar Facultades");
            System.out.println("   2  : Agregar Facultades");
            System.out.println("   3  : Eliminar Facultades");
            System.out.println("   0  : volver");
            System.out.println(" ");
            System.out.print("elige una opcion: ");
            int x = sc.nextInt();
            switch (x) {
                case 0:
                    sw = false;
                    break;
                case 1:
                    mostrarFacu();
                    break;
                case 2:
                    leerFacu();
                    break;
                case 3:
                    eliminarFacu();
                default:
                    break;
            }
        }
    }
}
