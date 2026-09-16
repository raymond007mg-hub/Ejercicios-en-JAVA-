package Entrega1;
import java.util.Scanner;
/*
 * Ejercicio de Conversión de metros
 * Integrante: Daniela Zuluaga Vasquez
 * Cedula: 1152693761
 * Correo:  dzuluagav@poligran.edu.co
 * 
 * */

public class ConversionMetros {
	
	// Metodo principal de entrada de aplicación
	  public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de metros: ");
        double metros = teclado.nextDouble();

        double pies = metrosAPies(metros);
        double pulgadas = metrosAPulgadas(metros);
        double centimetros = metrosACentimetros(metros);


		System.out.println("Luego de las convesiones los valores son");
        System.out.println("Metros: " + metros);
        System.out.println("Pies: " + pies);
        System.out.println("Pulgadas: " + pulgadas);
        System.out.println("Centímetros: " + centimetros);

        teclado.close();
    }

    // Convierte metros a pies
    public static double metrosAPies(double metros) {
        return metros * 3.28084;
    }

    // Convierte metros a pulgadas
    public static double metrosAPulgadas(double metros) {
        return metros * 39.3701;
    }

    // Convierte metros a centímetros
    public static double metrosACentimetros(double metros) {
        return metros * 100;
    }

  
}
