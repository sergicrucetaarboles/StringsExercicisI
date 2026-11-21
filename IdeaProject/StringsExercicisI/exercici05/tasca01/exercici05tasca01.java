import java.util.Scanner;

public class exercici05tasca01 {
    public static void main(String[] args) {

        String[] catalogo = {
                "Los muertos vivientes",
                "Brevísima historia del tiempo",
                "La clave secreta del universo",
                "Mi universo",
                "Patria",
                "De mayor quiero ser feliz",
                "Empieza por los zapatos"
        };

        Scanner teclat = new Scanner(System.in);
        System.out.println("Bienvenido a nuestra biblioteca");
        System.out.println("Escribe el título del libro que quieres buscar:");
        String titulo = teclat.nextLine().trim();

        boolean localizado = false;
        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].equalsIgnoreCase(titulo)) {
                localizado = true;
            }

            if (localizado) {
                System.out.println("Se ha localizado el libro");
            } else {
                System.out.println("No se ha localizado el libro");
            }

            teclat.close();
        }
    }
}