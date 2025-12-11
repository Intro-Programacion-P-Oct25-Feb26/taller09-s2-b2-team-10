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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] ventas = new int[5];
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        int ventasDia;
        String mensaje = "";
        
        for(int i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
            System.out.println("Ingrese las ventas");
            ventasDia = entrada.nextInt();
            ventas[i] = ventasDia;
            mensaje = String.format("%s%s $%s\n", mensaje, dias[i], ventas[i]);
      
        }
        System.out.println(mensaje);
    }

}
