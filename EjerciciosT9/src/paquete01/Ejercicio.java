package paquete01;


import java.util.Scanner;




/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidad = 0;
        boolean salida = true;
        String marca;
        String respuesta;

        String[] marcas = new String[100];

        while (salida) {
            System.out.println("Ingrese la marca del vehículo");
            marca = entrada.nextLine();
           

            String letra = marca.substring(0, 1).toLowerCase();

            switch (letra) {
                case "a":
                case "c":
                case "t":
                    System.out.println("No se puede ingresar marcas que inicien"
                            + " con A, C o T");
                    break;
                default:
                    marcas[cantidad] = marca;
                    cantidad = cantidad + 1;
                    break;
            }

            System.out.println("Desea agregar otra marca? s/n");
            respuesta = entrada.nextLine();

            if (respuesta.equals("n")) {
                salida = false;
            }
        }

        String mensaje = "Marcas ingresadas correctamente\n";

        for (int i = 0; i < cantidad; i++) {
            mensaje = String.format("%s%d. %s\n", mensaje, i + 1, marcas[i]);
        }

        System.out.println(mensaje);
    }

}

