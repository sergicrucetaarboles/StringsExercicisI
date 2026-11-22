import java.util.Scanner;

public class exercici07 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String correcta = "d";

        System.out.println("");
        System.out.println("Indica cual de las siguientes opciones no es un tipo primitivo en Java:");
        System.out.println("a. int");
        System.out.println("b. char");
        System.out.println("c. boolean");
        System.out.println("d. String");
        String respuesta = teclat.nextLine();

        respuesta = respuesta.trim().toLowerCase();
    }
}