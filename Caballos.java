package Entrega2;

import java.util.Scanner;

/*
 * Ejercicio de Conversión de moneda
 * Integrante: Daniela Zuluaga Vasquez
 * Cedula: 1152693761
 * Correo:  dzuluagav@poligran.edu.co
 * 
 * */
public class Caballos {

    // Literal A
    public static boolean caballoAtacaRey(int fila_cab, int col_cab,
                                           int fila_rey, int col_rey) {

        int diferenciaFila = Math.abs(fila_cab - fila_rey);
        int diferenciaColumna = Math.abs(col_cab - col_rey);

        if ((diferenciaFila == 2 && diferenciaColumna == 1) ||
            (diferenciaFila == 1 && diferenciaColumna == 2)) {
            return true;
        } else {
            return false;
        }
    }

    // Literal B
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== ATAQUE DEL CABALLO ===");

        System.out.print("Ingrese fila del caballo (1-8): ");
        int fila_cab = teclado.nextInt();

        System.out.print("Ingrese columna del caballo (1-8): ");
        int col_cab = teclado.nextInt();

        System.out.print("Ingrese fila del rey (1-8): ");
        int fila_rey = teclado.nextInt();

        System.out.print("Ingrese columna del rey (1-8): ");
        int col_rey = teclado.nextInt();

        boolean atacado = caballoAtacaRey(
            fila_cab, col_cab, fila_rey, col_rey
        );

        if (atacado) {
            System.out.println("El rey está siendo atacado por el caballo.");
        } else {
            System.out.println("El rey NO está siendo atacado por el caballo.");
        }

        teclado.close();
    }
}