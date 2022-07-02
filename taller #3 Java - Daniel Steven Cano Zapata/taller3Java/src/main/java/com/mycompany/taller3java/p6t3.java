package com.mycompany.taller3java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Daniel Steven Cano Z
 */
public class p6t3 {

    public static boolean repetir() {
        Scanner lector = new Scanner(System.in);
        boolean alt1, alt2;
        alt1 = false;
        alt2 = false;
        while (alt2 == false) {
            System.out.print("\n¿deseas realizar otro intento? \nsi/no\n:");
            switch (lector.next()) {
                case "si" -> {
                    alt1 = false;
                    alt2 = true;
                }
                case "no" -> {
                    alt1 = true;
                    alt2 = true;
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

    public static String[] buscar(String contactos[][]) {
        Scanner lector = new Scanner(System.in);
        String print[] = new String[3];
        boolean salir = false;
        while (salir == false) {
            print[0] = "null";
            System.out.print("Para buscar escribe el nombre, numero u organizacion completo tal y como se registró :");
            String alt = lector.next();
            for (int i = 0; i <= 2; i++) {
                if (alt.equals(contactos[i][0]) || alt.equals(contactos[i][1]) || alt.equals(contactos[i][2])) {
                    System.out.print("contacto encontrado");
                    print[0] = "Nombre: " + contactos[i][0];
                    print[1] = " - Número: " + contactos[i][1];
                    print[2] = " - Organización: " + contactos[i][2];
                    salir = true;
                }
            }
            if (print[0].equals("null")) {
                System.out.print("contacto no encontrado con ese valor");
                print[0] = "";
                print[1] = "";
                print[2] = "";
                salir = repetir();
            }
        }
        return new String[]{print[0], print[1], print[2]};
    }

    public static String[] eliminar(String contactos[][]) {
        Scanner lector = new Scanner(System.in);
        String print[] = new String[5];
        boolean salir = false;
        while (salir == false) {
            print[0] = "null";
            System.out.print("Para buscar escribe el nombre, numero u organizacion completo tal y como se registró :");
            String alt = lector.next();
            for (int i = 0; i <= 2; i++) {
                if (alt.equals(contactos[i][0]) || alt.equals(contactos[i][1]) || alt.equals(contactos[i][2])) {
                    System.out.print("contacto encontrado");
                    print[0] = "Nombre: " + contactos[i][0];
                    print[1] = " - Número: " + contactos[i][1];
                    print[2] = " - Organización: " + contactos[i][2];
                    print[3] = "y";
                    print[4] = String.valueOf(i);
                    salir = true;
                    i = 3;
                } else if (contactos[i][0].equals("null")) {
                    System.out.print("contacto no encontrado con ese valor");
                    print[0] = "";
                    print[1] = "";
                    print[2] = "";
                    print[3] = "n";
                    print[4] = "";
                    salir = repetir();
                }
            }
        }
        return new String[]{print[0], print[1], print[2], print[3], print[4]};
    }

    public static String solicitarDato(String mensaje) {
        Scanner lector = new Scanner(System.in);
        String retorno;
        System.out.print(mensaje);
        retorno = lector.next();
        return retorno;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String alt[] = new String[3];
        boolean exit;
        int cont = 0;
        int i;
        String contactos[][] = new String[3][3];
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                contactos[j][k] = "null";
                contactos[j][k] = "null";
                contactos[j][k] = "null";
            }
        }
        System.out.print("Menú de contactos.\n¿Qué gestión deseas realizar?");
        exit = false;
        while (exit == false) {
            System.out.print("\n1. registrar contacto\n2. buscar contacto\n3. eliminar contacto\n4. Terminar día\n:");
            switch (lector.next()) {
                case "1" -> {
                    for (i = 0; i < 3; i++) {
                        if (contactos[i][0].equals("null")) {
                            while (exit == false) {
                                cont = 0;
                                alt[0] = solicitarDato("Por favor digita el número del contacto :");
                                alt[1] = solicitarDato("Por favor digita el nombre del contacto :");
                                alt[2] = solicitarDato("Por favor digita la organizacion del contacto : ");
                                for (int j = 0; j < 3; j++) {
                                    for (int k = 0; k < 3; k++) {
                                        if (!alt[0].equals(contactos[j][k]) && !alt[1].equals(contactos[j][k]) && !alt[2].equals(contactos[j][k])) {
                                            cont++;
                                        }
                                    }
                                }
                                if (cont == 9) {
                                    contactos[i][0] = alt[0];
                                    contactos[i][1] = alt[1];
                                    contactos[i][2] = alt[2];
                                    System.out.println("Contacto agregado con éxito.");
                                    i = 3;
                                    exit = true;
                                } else {
                                    System.out.println("Uno o varios valores coinciden con otros contactos");
                                    exit = repetir();
                                    if (exit == true) {
                                        i = 4;
                                    }
                                }
                            }
                            exit = false;
                        }
                    }
                    if (i == 3) {
                        System.out.println("Memoria llena");
                    }
                }
                case "2" -> {
                    String print = Arrays.toString(buscar(contactos));
                    System.out.print(print);
                }
                case "3" -> {
                    String print[] = eliminar(contactos);
                    if ("y".equals(print[3])) {
                        System.out.println(print[0] + print[1] + print[2] + "ELIMINANDO...");
                        contactos[Integer.parseInt(print[4])][0] = "null";
                        contactos[Integer.parseInt(print[4])][1] = "null";
                        contactos[Integer.parseInt(print[4])][2] = "null";
                    }

                }
                case "4" -> {
                    exit = true;
                }
                default -> {
                    System.out.print("Opción no válida");
                }
            }
        }
    }
}
