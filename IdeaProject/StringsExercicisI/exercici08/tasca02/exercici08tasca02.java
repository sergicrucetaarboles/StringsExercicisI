import java.util.Scanner;

public class exercici08tasca02 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        // 1. Frase a endevinar
        String pelicula = "Forrest Gump";

        // 2. Construïm el progrés (pista + espais + asteriscs)
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

            // 3. Demanem una lletra a l'usuari
            System.out.println("Introduce una letra:");
            String entrada = teclat.nextLine().trim();

            // 4. Validem que sigui exactament 1 caràcter
            if (entrada.length() != 1) {
                System.out.println("Debes escribir una sola letra");
            }
            char letra = entrada.charAt(0);

            // 5. Descobrim la lletra a TOTES les posicions on aparegui
            //    (sense distingir majúscules/minúscules)
            for (int i = 0; i < pelicula.length(); i++) {
                if (Character.toLowerCase(pelicula.charAt(i))
                        == Character.toLowerCase(letra)) {

                    progreso[i] = pelicula.charAt(i);
                }
            }
            progreso[i] = pelicula.charAt(i);

            // 6. Mostrem el progrés actualitzat
            System.out.println(String.valueOf(progreso));
        }
        teclat.close();
    }
}