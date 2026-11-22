public class exercici08tasca01 {
    public static void main(String[] args) {

        String pelicula = "Forrest Gump";

        char[] progreso = new char[pelicula.length()];

        for (int i = 0; i < pelicula.length(); i++) {

            if (i == 0) {
                progreso[i] = pelicula.charAt(0);
            }
        }
    }
}