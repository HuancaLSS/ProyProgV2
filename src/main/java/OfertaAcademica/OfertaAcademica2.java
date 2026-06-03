package OfertaAcademica;

import java.util.Scanner;
import Grafica.Principal;
import javax.swing.SwingUtilities;

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
            System.out.println("   4  : Agregar Convocatoria ");
            System.out.println("   5  : Ver Convocatorias Disponibles");
            System.out.println("   0  : salir");
            System.out.println("------------------------------------- ");
            System.out.println(" ");
            System.out.print("elige una opcion: ");
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
                    Convocatoria nuevaConvo = Convocatoria.crearConvocatoria();
                    if (nuevaConvo != null) {
                        U.adicionarConvocatoria(nuevaConvo);
                    }
                    break;
                case 5:
                    U.mostrarConvocatoriasDisponibles();
                    break;

                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Universidad U = new Universidad();
        //iniciar(U);
        SwingUtilities.invokeLater(() -> {
            new Principal(U).setVisible(true);
        });
//        Principal t1=new Principal();
//        t1.setVisible(true);

    }
}
