package tasca03;

import java.util.Scanner;

public class exercici08tasca03 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        // 1. Frase a endevinar i nombre d'intents
        String pelicula = "Forrest Gump";
        final int MAX_INTENTOS = 3;

        // 2. Construïm el progrés (pista + espais + asteriscs)
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

        // 3. Bucle: fins esgotar els intents o endevinar la frase
        int intentos = 0;
        boolean acertado = false;

        while (intentos < MAX_INTENTOS && !acertado) {

            System.out.println("Introduce una letra (intento "
                    + (intentos + 1)
                    + " de "
                    + MAX_INTENTOS + "):");
        }
        String entrada = teclat.nextLine().trim();

        // 4. Validació: 1 caràcter i que sigui una lletra (no gasta intent)
        if (entrada.length() != 1
                || !Character.isLetter(entrada.charAt(0))) {

            System.out.println("Debes escribir una sola letra");
        }
        char letra = entrada.charAt(0);
        intentos++;

        // 5. Descobrim la lletra a TOTES les posicions on aparegui
        for (int i = 0; i < pelicula.length(); i++) {
            if (Character.toLowerCase(pelicula.charAt(i))
                    == Character.toLowerCase(letra)) {

                progreso[i] = pelicula.charAt(i);
            }
        }

        System.out.println(String.valueOf(progreso));

        // 6. Comprovem si ja no queda cap '*'
        acertado = true;
        for (int i = 0; i < progreso.length; i++) {
            if (progreso[i] == '*') {
                acertado = false;
            }
        }

        // 7. Missatge final
        if (acertado) {
            System.out.println("¡Enhorabuena! Has adivinado la película: " + pelicula);
        } else {
            System.out.println("Se acabaron los intentos. La película era: " + pelicula);
        }
        teclat.close();
    }
}