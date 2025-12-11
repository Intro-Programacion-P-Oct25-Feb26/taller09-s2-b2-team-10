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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int numero;
        int suma = 0;
        double promedio;
        String mensaje = "";
        double diferencia;
        
        for(int i = 0; i < numeros.length; i ++){
            System.out.println("Ingrese un valor");
            numero = entrada.nextInt();
            
            numeros[i] = numero;
        }
        for(int i = 0; i < numeros.length; i ++){
            suma = suma + numeros[i];
        
        } 
        promedio = suma / numeros.length;
        
        for(int i = 0; i < numeros.length; i ++){
            
            diferencia = numeros[i] - promedio;
            
            mensaje = String.format("%sNumero: %S Diferencia del promedio: "
                    + "%.2f\n", mensaje, 
                    numeros[i],  
                    diferencia);
            
        
        
        }
        System.out.printf("%sPromedio: %.2f\n", mensaje, promedio);
      

    }

}
