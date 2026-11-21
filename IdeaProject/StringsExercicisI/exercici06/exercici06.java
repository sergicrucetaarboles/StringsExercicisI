import java.util.Scanner;

public class exercici06 {

    public static void main(String[] args) {

        // 1. Creem l'objecte Scanner per llegir del teclat
        Scanner teclat = new Scanner(System.in);

        // 2. Demanem el text a l'usuari
        System.out.println("Introduce un texto y pulsa enter:");
        String texto = teclat.nextLine();

        // 3. Construïm el text invertit: recorrem l'original de l'última posició a la 0
        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }

        // 4. Mostrem el resultat per pantalla
        System.out.println("Texto invertido: " + invertido);

        // 5. Tanquem el Scanner
        teclat.close();
    }
}