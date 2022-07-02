package com.mycompany.taller2java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p4t2 {

    public static boolean confirmarNuevaGestion() {
        Scanner lector = new Scanner(System.in);
        boolean alt1, alt2;
        alt1 = false;
        alt2 = false;
        while (alt2 == false) {
            System.out.print("\n¿deseas realizar otra gestión ? \nsi/no\n:");
            switch (lector.next()) {
                case "si" -> {
                    alt1 = false;
                    alt2 = true;
                }
                case "no" -> {
                    alt1 = true;
                    alt2 = true;
                    System.out.print("¡Gracias por su visita!. ¡Hasta pronto!");
                }
                default -> {
                    System.out.println("Opción no válida");
                    alt1 = false;
                    alt2 = false;
                }
            }
        }
        return alt1;
    }

    public static void devolverPelicula() {
        Scanner lector = new Scanner(System.in);
        System.out.print("¿Deseas añadir algún comentario sobre daños o novedades?\nsi/no\n:");
        if (lector.next().equals("si")) {
            lector.next();
            System.out.print("Película devuelta junto con la novedad.");
        } else {
            System.out.print("Película devuelta sin novedad.");
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean exit;
        System.out.print("¿Qué gestión deseas realizar?");
        exit = false;
        while (exit == false) {
            System.out.print("\n1. Alquilar película\n2. Consultar catálogo vigente\n3. Devolver película\n:");
            switch (lector.next()) {
                case "1" -> {
                    System.out.print("Película alquilada con éxito. Ten un buen día");
                    exit = confirmarNuevaGestion();
                }
                case "2" -> {
                    System.out.print("Mostrando catálogo actualizado");
                    exit = confirmarNuevaGestion();
                }
                case "3" -> {
                    devolverPelicula();
                    exit = confirmarNuevaGestion();
                }
                default -> {
                    System.out.print("Opción no válida");

                }
            }
        }

    }
}
