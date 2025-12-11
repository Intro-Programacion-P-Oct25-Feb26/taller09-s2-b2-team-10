/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] cafe = {"Café tradicional", "Café francés", "Café alemán"};

        double[] arreglo2 = {1.5, 2.1, 2.3};

        String mensaje = "";
        boolean bandera = true;
        double sumaf = 0;

        while (bandera) {
            System.out.println("Ingrese el café a comprar , 0 = Café tradicional,"
                    + " 1 = Café francés, 2 = Café alemán");
            int i = entrada.nextInt();
            System.out.println("Ingrese el número de tazas a comprar");
            int tazas = entrada.nextInt();

            if (i == 0 || i == 1 || i == 2) {
                double precio = arreglo2[i];
                double valor_total = tazas * precio;
                sumaf += valor_total;
                mensaje = String.format("%s %s (%s t), valor a cancelar %.2f\n\t",
                        mensaje, cafe[i], tazas, valor_total);

            }
            entrada.nextLine();
            System.out.println("Desea ingresar más valores? (si/no)");
            String salida = entrada.nextLine();

            if (salida.equals("no")) {
                bandera = false;

            }

        }
        System.out.printf("El usuario ha comprado\n\t%s\nTotal a pagar: %.1f\n", mensaje,
                sumaf);
    }
}
