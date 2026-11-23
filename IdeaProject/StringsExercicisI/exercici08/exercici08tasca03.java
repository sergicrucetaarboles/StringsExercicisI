import java.util.Scanner;

public class exercici08tasca03 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String pelicula = "Forrest Gump";
        final int MAX_INTENTOS = 3;

        char[] progreso = new char[pelicula.length()];

        for (int i = 0; i < pelicula.length(); i++) {
            if (i == 0) {
                progreso[i] = pelicula.charAt(0);
            } else if (pelicula.charAt(i) == ' ') {
                progreso[i] = ' ';
            } else {
                progreso[i] = '*';
            }
        }

        System.out.println("Bienvenido al Mini juego del ahorcado");
        System.out.println("Intenta adivinar la pelicula");

        System.out.println(String.valueOf(progreso));

        int intentos = 0;
        boolean acertado = false;

        while (intentos < MAX_INTENTOS && !acertado) {

            System.out.println("Introduce una letra (intento "
                    + (intentos + 1)
                    + " de "
                    + MAX_INTENTOS + "):");
        }
        String entrada = teclat.nextLine().trim();

        if (entrada.length() != 1
                || !Character.isLetter(entrada.charAt(0))) {

            System.out.println("Debes escribir una sola letra");
            continue;

        }

        char letra = entrada.charAt(0);
        intentos++;

        for (int i = 0; i < pelicula.length(); i++) {
            if (Character.toLowerCase(pelicula.charAt(i))
                    == Character.toLowerCase(letra)) {

                progreso[i] = pelicula.charAt(i);
            }
        }

        System.out.println(String.valueOf(progreso));

        acertado = true;

        for (int i = 0; i < progreso.length; i++) {
            if (progreso[i] == '*') {
                acertado = false;
            }
        }

        if (acertado) {
            System.out.println("¡Enhorabuena! Has adivinado la película: " + pelicula);
        } else {
            System.out.println("Se acabaron los intentos. La película era: " + pelicula);
        }

    }
}