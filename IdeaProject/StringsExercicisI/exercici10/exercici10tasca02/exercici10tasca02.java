package exercici10tasca02;

import java.util.Scanner;

public class exercici10tasca02 {

    public static void mostrarNombres(String[] nombres) {

        for (int i = 0; i < nombres.length; i++) {

            System.out.print(nombres[i]);

            if (i < nombres.length - 1) {
                System.out.print(", ");
            }

            System.out.println();

            public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
            }

            String[] alumnos = {
                    "Paula",
                    "Santiago",
                    "Pascual",
                    "Jorge",
                    "Saul",
                    "Enrique"
            };

            mostrarNombres(alumnos);

            System.out.println("¿Qué posición quieres cambiar?");

            if (!teclado.hasNextInt()) {
                System.out.println("La posición debe ser un número");
            } else {
                int posicion = teclado.nextInt();

                if (posicion < 0 || posicion >= alumnos.length) {
                    System.out.println("La posición debe estar entre 0 y " + (alumnos.length - 1));
                } else {
                    int posicion = teclado.nextInt();
                    teclado.nextLine();
                }
            }
            if (posicion >= 0 && posicion < alumnos.length) {


            }
        }
    }
}