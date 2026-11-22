import java.util.Scanner;

public class exercici07 {

    public static void main(String[] args) {

        // 1. Creem l'objecte Scanner per llegir del teclat
        Scanner teclat = new Scanner(System.in);

        // 2. Resposta correcta de la pregunta
        String correcta = "d";

        // 3. Mostrem la pregunta i les quatre opcions
        System.out.println("");
        System.out.println("Indica cual de las siguientes opciones no es un tipo primitivo en Java:");
        System.out.println("a. int");
        System.out.println("b. char");
        System.out.println("c. boolean");
        System.out.println("d. String");
        String respuesta = teclat.nextLine();

        // 4. Llegim la resposta; la passem a minúscules i traiem espais sobrants
        respuesta = respuesta.trim().toLowerCase();

        // 5. Comprovem la resposta
        if (respuesta.equals(correcta)) {
            System.out.println("Respuesta correcta!");
        }
        else if (respuesta.equals("a")
                || respuesta.equals("b")
                || respuesta.equals("c")) {

            System.out.println(
                    "Respuesta incorrecta, la respuesta correcta es: "
                            + correcta);
        }
        else {
            System.out.println("Respuesta no válida: a, b, c, d");
        }

        // 6. Tanquem el Scanner
        teclat.close();
    }
}