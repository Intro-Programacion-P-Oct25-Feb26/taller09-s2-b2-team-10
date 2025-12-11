package paquete02;

public class Ejercicio03 {

    public static void main(String[] args) {

        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        double media;
        int arriba_media = 0;
        int bajo_media = 0;

        String mensaje = "";


        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        } 
        media = suma / arreglo.length;


        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < media) {
                bajo_media= bajo_media + 1;
            } else {
                arriba_media = arriba_media + 1;
                
            }
        }


        mensaje = String.format(
                "Media aritmética: %.2f\n"
                + "Elementos por debajo de la media: %d\n"
                + "Elementos por encima de la media: %d",
                media, bajo_media, arriba_media);


        System.out.println(mensaje);
    }
}
