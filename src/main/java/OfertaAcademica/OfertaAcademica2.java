package OfertaAcademica;

import java.io.File;
import java.util.Scanner;

public class OfertaAcademica2 {

    public static void iniciar(Universidad U) {
        boolean sw = true;
        Scanner sc = new Scanner(System.in);

        while (sw) {

            System.out.println(" ");
            System.out.println("------------------------------------- ");
            System.out.println("   1  : Gestionar Facultades");
            System.out.println("   2  : Gestionar Carreras");
            System.out.println("   3  : Gestionar Convocatorias por facultad");
            System.out.println("   4  : Agregar Convocatoria");
            System.out.println("   5  : Ver Convocatorias Disponibles");
            System.out.println("   0  : Salir");
            System.out.println("------------------------------------- ");
            System.out.println(" ");
            System.out.print("Elige una opcion: ");

            int x = sc.nextInt();

            switch (x) {

                case 0:
                    sw = false;
                    break;

                case 1:
                    U.gestionarFacu();
                    break;

                case 2:
                    U.gestionarCarr();
                    break;

                case 3:
                    U.gestionarConv(U);
                    break;

                case 4:
                    Convocatoria nuevaConvo =
                            Convocatoria.crearConvocatoria();

                    if (nuevaConvo != null) {
                        U.adicionarConvocatoria(nuevaConvo);
                    }
                    break;

                case 5:
                    U.mostrarConvocatoriasDisponibles();
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        ArchUniversidad arch =
                new ArchUniversidad("Universidad.dat");

        Universidad U;

        // Recuperar datos guardados
        if (new File("Universidad.dat").exists()) {

            try {
                U = arch.leer();
                System.out.println("Datos recuperados correctamente.");

            } catch (Exception e) {

                System.out.println("Error al recuperar datos.");
                System.out.println("Se creara una nueva universidad.");

                U = new Universidad();

                arch.guardar(U);
            }

        } else {

            U = new Universidad();

            arch.guardar(U);

            System.out.println("Primera ejecucion.");
            System.out.println("Se creo Universidad.dat");
        }
        iniciar(U);

        // Guardar cambios antes de salir
        arch.guardar(U);
        System.out.println("Datos guardados correctamente.");
    }
}