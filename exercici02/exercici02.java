public class exercici02 {
    public static void main(String[] args) {

        String path = "home/user/index.html";

        int sep = path.lastIndexOf('/');
        int dot = path.lastIndexOf('.');

        String nom = path.substring(sep + 1, dot);
    }
}