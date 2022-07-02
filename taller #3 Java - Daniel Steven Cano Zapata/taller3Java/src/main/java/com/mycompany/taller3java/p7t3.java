package com.mycompany.taller3java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p7t3 {

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

    public static String[] buscar(String vehiculos[][]) {
        Scanner lector = new Scanner(System.in);
        String print[] = new String[4];
        boolean salir = false;
        while (salir == false) {
            print[0] = "null";
            System.out.print("Para buscar escribe la placa tal y como se registró :");
            String alt = lector.next();
            for (int i = 0; i <= 4; i++) {
                if (alt.equals(vehiculos[i][0])) {
                    System.out.print("vehículo dentro del parqueadero: ");
                    print[0] = "placa: " + vehiculos[i][0];
                    print[1] = " - marca: " + vehiculos[i][1];
                    print[2] = " - conductor: " + vehiculos[i][2];
                    print[3] = " - número de contacto: " + vehiculos[i][3];
                    salir = true;
                }
            }
            if (print[0].equals("null")) {
                System.out.print("Ese vehículo no se encuentra en el parqueader");
                print[0] = "";
                print[1] = "";
                print[2] = "";
                print[3] = "";
                salir = repetir();
            }
        }
        return new String[]{print[0], print[1], print[2], print[3]};
    }

    public static String[] salida(String vehiculos[][]) {
        Scanner lector = new Scanner(System.in);
        String print[] = new String[5];
        boolean salir = false;
        while (salir == false) {
            print[0] = "null";
            System.out.print("Para buscar escribe la placa tal y como se registró :");
            String alt = lector.next();
            for (int i = 0; i <= 4; i++) {
                if (alt.equals(vehiculos[i][0]) || alt.equals(vehiculos[i][1]) || alt.equals(vehiculos[i][2])) {
                    System.out.print("contacto encontrado");
                    print[0] = "Placa: " + vehiculos[i][0];
                    print[1] = " - marca: " + vehiculos[i][1];
                    print[2] = " - conductor: " + vehiculos[i][2];
                    print[3] = "y";
                    print[4] = String.valueOf(i);
                    salir = true;
                    i = 5;
                } else if (vehiculos[i][0].equals("null")) {
                    System.out.print("Vehículo no encontrado");
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
        String alt[] = new String[4];
        boolean exit;
        int cont = 0;
        int i;
        String vehiculos[][] = new String[5][4];
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 4; k++) {
                vehiculos[j][k] = "null";
            }
        }
        System.out.print("Menú de contactos.\n¿Qué gestión deseas realizar?");
        exit = false;
        while (exit == false) {
            System.out.print("\n1. Ingresar vehículo\n2. buscar vehículo\n3. salida de vehículo\n4. Terminar día\n:");
            switch (lector.next()) {
                case "1" -> {
                    for (i = 0; i < 5; i++) {
                        if (vehiculos[i][0].equals("null")) {
                            while (exit == false) {
                                cont = 0;
                                alt[0] = solicitarDato("Por favor digita la placa del vehículo :");
                                alt[1] = solicitarDato("Por favor digita la marca del vehículo :");
                                alt[2] = solicitarDato("Por favor digita el nombre del conductor : ");
                                alt[3] = solicitarDato("Por favor digita un número de contacto : ");
                                for (int j = 0; j < 5; j++) {
                                    if (!alt[0].equals(vehiculos[j][0])) {
                                        cont++;
                                    }
                                }
                                if (cont == 5) {
                                    vehiculos[i][0] = alt[0];
                                    vehiculos[i][1] = alt[1];
                                    vehiculos[i][2] = alt[2];
                                    vehiculos[i][3] = alt[3];
                                    System.out.println("vehículo ingresado con éxito.");
                                    i = 5;
                                    exit = true;
                                } else {
                                    System.out.println("placa ya registrada");
                                    exit = repetir();
                                    if (exit == true) {
                                        i = 6;
                                    }
                                }
                            }
                            exit = false;
                        }
                    }
                    if (i == 5) {
                        System.out.println("estacionamiento lleno");
                    }
                }
                case "2" -> {
                    String print = Arrays.toString(buscar(vehiculos));
                    System.out.print(print);
                }
                case "3" -> {
                    String print[] = salida(vehiculos);
                    if ("y".equals(print[3])) {
                        System.out.println(print[0] + print[1] + print[2] + " Entregando...");
                        vehiculos[Integer.parseInt(print[4])][0] = "null";
                        vehiculos[Integer.parseInt(print[4])][1] = "null";
                        vehiculos[Integer.parseInt(print[4])][2] = "null";
                        vehiculos[Integer.parseInt(print[4])][3] = "null";
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
