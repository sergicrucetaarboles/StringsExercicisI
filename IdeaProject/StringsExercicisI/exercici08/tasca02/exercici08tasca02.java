import java.util.Scanner;

public class exercici08tasca02 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String pelicula = "Forrest Gump";

        char[] progreso = new char[pelicula.length()];

        for (int i = 0; i < pelicula.length(); i++) {

            if (i == 0) {
                progreso[i] = pelicula.charAt(0);
            }
            else if (pelicula.charAt(i) == ' ') {
                progreso[i] = ' ';
            }
            else {
                progreso[i] = '*';
            }

            System.out.println("Bienvenido al Mini juego del ahorcado");
            System.out.println("Intenta adivinar la pelicula");
            System.out.println(String.valueOf(progreso));

            System.out.println("Introduce una letra:");
            String entrada = teclat.nextLine().trim();

            if (entrada.length() != 1) {
                System.out.println("Debes escribir una sola letra");
            }

            char letra = entrada.charAt(0);
            for (int i = 0; i < pelicula.length(); i++) {
                if (Character.toLowerCase(pelicula.charAt(i))
                        == Character.toLowerCase(letra)) {

                    progreso[i] = pelicula.charAt(i);
                }
            }

            progreso[i] = pelicula.charAt(i);
            System.out.println(String.valueOf(progreso));


        }
    }
}