import java.util.Scanner;

public class Ejercicio1 {

    public static int siglo(int anho) {
        return (anho + 99) / 100;
    }

    public static int primer_anho(int siglo) {
        return (siglo - 1) * 100 + 1;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anho = teclado.nextInt();

        int numeroSiglo = siglo(anho);
        int primerAnho = primer_anho(numeroSiglo);

        System.out.println("El siglo es: " + numeroSiglo);
        System.out.println("El primer año del siglo es: " + primerAnho);

        teclado.close();
    }
}