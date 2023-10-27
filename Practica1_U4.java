/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_u4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica1_U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lectura = new Scanner(System.in);
       
        int opc;

        double[] elemt = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};

        do {
            System.out.println("Hola");
            System.out.println("********************************");
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Multplicacion");
            opc = lectura.nextInt();

            switch (opc) {

                case 1:

                    double d = 0;
                    for (int i = 0; i < elemt.length; i++) {
                        d += elemt[i];
                        System.out.println(d);
                    }
                    break;
                case 2:
                    double e = 0;
                    for (int i = 0; i < elemt.length; i++) {
                        e *= elemt[i];
                        System.out.println(e);
                    }
                    break;

                default: System.out.println("No valido");

            }

        } while (opc != 2);
    }

}
