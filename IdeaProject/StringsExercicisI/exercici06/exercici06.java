import java.util.Scanner;

public class exercici06 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introduce un texto y pulsa enter:");
        String texto = teclat.nextLine();

        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);
    }

}