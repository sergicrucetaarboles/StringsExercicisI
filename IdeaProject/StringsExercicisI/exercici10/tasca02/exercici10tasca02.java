
import java.util.Scanner;

public class exercici10tasca02 {

    public static void mostrarNombres(String[] nombres) {

        for (int i = 0; i < nombres.length; i++) {

            System.out.print(nombres[i]);

            if (i < nombres.length - 1) {
                System.out.print(", ");
            }

            System.out.println();
        }
    }
}