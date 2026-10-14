package EntregaFinal;
import java.util.Scanner;


/*
 * Estudiante: Daniela Zuluaga Vasquez
 * Cedula: 1152693761
 * Correo dzuluagav@poli.edu.co
 * */


public class CadenasAmigas {

    public static boolean sonAmigas(String S, String T) {

        // Si tienen diferente longitud, no pueden ser amigas
        if (S.length() != T.length()) {
            return false;
        }

        // Concatenamos S consigo misma
        String dobleS = S + S;

        // Si T aparece dentro de S + S, son amigas
        if (dobleS.contains(T)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cadena S: ");
        String S = teclado.nextLine();

        System.out.print("Ingrese la cadena T: ");
        String T = teclado.nextLine();

        if (sonAmigas(S, T)) {
            System.out.println("Las cadenas son amigas.");
        } else {
            System.out.println("Las cadenas NO son amigas.");
        }

        teclado.close();
    }
}
