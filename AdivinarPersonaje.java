import java.util.Scanner;

public class AdivinarPersonaje {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String r;

        System.out.println("Piensa en uno de estos personajes:");
        System.out.println("Radamel Falcao García, Goku, Michael Jordan, Eminem, Darth Vader,");
        System.out.println("Adam Sandler, Bruce Wayne, Tintín, Ayudante de Santa,");
        System.out.println("Joe Biden, José Saramago, Günter Grass y Kim Jong Un.");
        System.out.println("Responde únicamente con: si o no.\n");

        // Pregunta 1
        System.out.print("¿Es un personaje ficticio? ");
        r = sc.next().toLowerCase();

        if (r.equals("si")) {

            // Pregunta 2
            System.out.print("¿Es un superhéroe? ");
            r = sc.next().toLowerCase();

            if (r.equals("si")) {
                System.out.println("Tu personaje es: Bruce Wayne.");
            } else {

                // Pregunta 3
                System.out.print("¿Es un personaje de anime? ");
                r = sc.next().toLowerCase();

                if (r.equals("si")) {
                    System.out.println("Tu personaje es: Goku.");
                } else {

                    // Pregunta 4
                    System.out.print("¿Pertenece a Star Wars? ");
                    r = sc.next().toLowerCase();

                    if (r.equals("si")) {
                        System.out.println("Tu personaje es: Darth Vader.");
                    } else {

                        // Pregunta 5
                        System.out.print("¿Es periodista? ");
                        r = sc.next().toLowerCase();

                        if (r.equals("si")) {
                            System.out.println("Tu personaje es: Tintín.");
                        } else {
                            System.out.println("Tu personaje es: Ayudante de Santa.");
                        }
                    }
                }
            }

        } else {

            // Pregunta 2
            System.out.print("¿Es político? ");
            r = sc.next().toLowerCase();

            if (r.equals("si")) {

                // Pregunta 3
                System.out.print("¿Es de Corea del Norte? ");
                r = sc.next().toLowerCase();

                if (r.equals("si")) {
                    System.out.println("Tu personaje es: Kim Jong Un.");
                } else {
                    System.out.println("Tu personaje es: Joe Biden.");
                }

            } else {

                // Pregunta 3
                System.out.print("¿Es escritor? ");
                r = sc.next().toLowerCase();

                if (r.equals("si")) {

                    // Pregunta 4
                    System.out.print("¿Es portugués? ");
                    r = sc.next().toLowerCase();

                    if (r.equals("si")) {
                        System.out.println("Tu personaje es: José Saramago.");
                    } else {
                        System.out.println("Tu personaje es: Günter Grass.");
                    }

                } else {

                    // Pregunta 4
                    System.out.print("¿Es deportista? ");
                    r = sc.next().toLowerCase();

                    if (r.equals("si")) {

                        // Pregunta 5
                        System.out.print("¿Es futbolista? ");
                        r = sc.next().toLowerCase();

                        if (r.equals("si")) {
                            System.out.println("Tu personaje es: Radamel Falcao García.");
                        } else {
                            System.out.println("Tu personaje es: Michael Jordan.");
                        }

                    } else {

                        // Pregunta 5
                        System.out.print("¿Es rapero? ");
                        r = sc.next().toLowerCase();

                        if (r.equals("si")) {
                            System.out.println("Tu personaje es: Eminem.");
                        } else {
                            System.out.println("Tu personaje es: Adam Sandler.");
                        }
                    }
                }
            }
        }

        sc.close();
    }
}