import java.util.Scanner;

public class Ejercicio2 {

    // Literal A
    public static double conversionALas8AM(double P) {
        return P;
    }

    // Literal B
    public static double conversionAlMediodia(double P) {
        return P * 0.90;
    }

    // Literal C
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el dinero: ");
        double dinero = teclado.nextDouble();

        System.out.println("Dinero a las 8am: " + conversionALas8AM(dinero));
        System.out.println("Dinero al mediodia: " + conversionAlMediodia(dinero));
    }
}