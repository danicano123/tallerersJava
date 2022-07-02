package com.mycompany.taller2java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p10t2 {

    public static boolean repetir() {
        Scanner lector = new Scanner(System.in);
        boolean alt1, alt2;
        alt1 = false;
        alt2 = false;
        while (alt2 == false) {
            System.out.print("\n¿Intentar de nuevo? \nsi/no\n:");
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

    public static int modificar(String saldo, int i) {
        int print = Integer.parseInt(saldo);
        switch (i) {
            case 1 -> {
                int alt = Integer.parseInt(solicitarDato("Digite el monto a ingresar: "));
                if (alt > 0) {
                    print += alt;
                    System.out.print("Ingreso exitoso. Nuevo saldo: $" + print);
                } else {
                    System.out.println("Cantidad no válida");
                }
            }
            case 2 -> {
                int alt = Integer.parseInt(solicitarDato("Digite el monto a retirar: "));
                if ((print - alt) >= 0) {
                    print -= alt;
                    System.out.print("Retiro exitoso. Nuevo saldo: $" + print);
                } else {
                    System.out.println("Cantidad no válida");
                }
            }
        }
        return print;
    }

    public static String[] ingresar(String arreglo[][], int cont) {
        Scanner lector = new Scanner(System.in);
        String print, alt;
        alt = "";
        print = "null";
        boolean salir = false;
        while (salir == false) {
            print = "null";
            System.out.print("Usuario :");
            String user = lector.next();
            System.out.print("Contraseña :");
            String pass = lector.next();
            for (int i = 0; i <= cont; i++) {
                if (user.equals(arreglo[i][0]) && pass.equals(arreglo[i][1])) {
                    System.out.println("Ingresando...");
                    print = arreglo[i][2];
                    alt = String.valueOf(i);
                    salir = true;
                }
            }
            if (print.equals("null")) {
                System.out.print("Error de credenciales");
                print = "";
                salir = repetir();
            }
        }
        return new String[]{print, alt};
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
        boolean exit;
        int cont = 0;
        String arreglo[][] = new String[99][3];
        System.out.print("!Bienvenido a Su banco fiel¡.\n¿Qué gestión deseas realizar?");
        exit = false;
        while (exit == false) {
            System.out.print("\n1. Registrar nuevo usuario\n2. Ingresar\n:");
            switch (lector.next()) {
                case "1" -> {
                    arreglo[cont][0] = solicitarDato("Por favor digite su nombre de usuario :");
                    arreglo[cont][1] = solicitarDato("Por favor digite una contraseña :");
                    arreglo[cont][2] = "0";
                    cont++;
                    System.out.println("usuario registrado con éxito");
                }
                case "2" -> {
                    String print[] = ingresar(arreglo, cont);
                    if (!"".equals(print[0])) {
                        System.out.print("Su saldo actual es de: " + print[0]);
                        while (exit == false) {
                            System.out.print("\n1. Ingresar dinero\n2. Retirar dinero\n3. Salir\n:");
                            switch (lector.nextInt()) {
                                case 1 -> {
                                    arreglo[Integer.parseInt(print[1])][2] = String.valueOf(modificar(arreglo[Integer.parseInt(print[1])][2], 1));
                                    exit = repetir();
                                }
                                case 2 -> {
                                    arreglo[Integer.parseInt(print[1])][2] = String.valueOf(modificar(arreglo[Integer.parseInt(print[1])][2], 2));
                                    exit = repetir();
                                }
                                case 3 -> {
                                    exit = true;
                                }
                                default ->
                                    System.out.print("Opción no válida");
                            }
                        }
                    }
                    exit = false;
                }
                default -> {
                    System.out.print("Opción no válida");
                }
            }
        }
    }
}
