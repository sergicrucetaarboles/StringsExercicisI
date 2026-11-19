import java.util.Scanner;

public class exercici03 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un Text i Prem Enter:");

        String text = teclat.nextLine();
        String majuscules = text.toUpperCase();
        String minuscules = text.toLowerCase();

        System.out.println("En majúscules: " + majuscules);
        System.out.println("En minúscules: " + minuscules);
    }
}
