import java.util.Scanner;

public class exercici09 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introduce un texto que termine con un punto:");

        String texto = teclat.nextLine().trim();

        int punto = texto.lastIndexOf('.');

        String cuerpo = texto;

        if (punto != -1) {
            cuerpo = texto.substring(0, punto);
        }

        int palabras = 0;

        if (!cuerpo.trim().isEmpty()) {
            String[] partes = cuerpo.trim().split(" ");
            palabras = partes.length;
        }

        String vocales = "aeiouáàéèíïóòúü";
        int numVocales = 0;

        for (int i = 0; i < cuerpo.length(); i++) {

            char c = Character.toLowerCase(cuerpo.charAt(i));

            if (vocales.indexOf(c) != -1) {
                numVocales++;
            }

        }

        System.out.println("Número de palabras: " + palabras);
        System.out.println("Número de vocales: " + numVocales);

        teclat.close();
    }
}