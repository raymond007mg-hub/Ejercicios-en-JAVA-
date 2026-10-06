import java.util.Scanner;

public class ContrasenaSegura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = entrada.nextLine();

        boolean tieneLetra = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;

        // Revisar cada carácter de la contraseña
        for (int i = 0; i < contrasena.length(); i++) {

            char caracter = contrasena.charAt(i);

            if (Character.isLetter(caracter)) {
                tieneLetra = true;
            }

            if (Character.isDigit(caracter)) {
                tieneNumero = true;
            }

            if (!Character.isLetterOrDigit(caracter)) {
                tieneSimbolo = true;
            }
        }

        // Verificar la longitud
        if (contrasena.length() < 10) {
            System.out.println("La contraseña debe tener al menos 10 caracteres");
        }

        // Verificar si tiene letra
        if (!tieneLetra) {
            System.out.println("La contraseña debe tener al menos una letra");
        }

        // Verificar si tiene número
        if (!tieneNumero) {
            System.out.println("La contraseña debe tener al menos un número");
        }

        // Verificar si tiene símbolo
        if (!tieneSimbolo) {
            System.out.println("La contraseña debe tener al menos un símbolo especial");
        }

        // Resultado final
        if (contrasena.length() >= 10 &&
                tieneLetra &&
                tieneNumero &&
                tieneSimbolo) {

            System.out.println("La contraseña es segura.");

        } else {

            System.out.println("La contraseña no es segura. Corrija los requisitos indicados.");
        }

        entrada.close();
    }
}