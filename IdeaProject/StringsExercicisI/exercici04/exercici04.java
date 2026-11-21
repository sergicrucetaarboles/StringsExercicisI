import java.util.Scanner;

public class exercici04 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("");
        System.out.println("Introdueix un text:");
        String text = teclat.nextLine();


        if (text.isEmpty()) {
            System.out.println("El text està buit. El programa acaba.");
        } else {
            System.out.println("Introdueix la paraula que vols buscar:");
            String paraula = teclat.nextLine();
        }

    }
}