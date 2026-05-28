package com.mycompany.ofertaacademica2;

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
            System.out.println("   3  : Gestionar Convocatorias");
            System.out.println("   4  : Ver Convocatorias Disponibles");
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
                    
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Universidad U = new Universidad();

        iniciar(U);

    }
}
