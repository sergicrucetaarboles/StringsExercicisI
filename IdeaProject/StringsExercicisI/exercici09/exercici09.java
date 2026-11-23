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
    }
}