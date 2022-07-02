package com.mycompany.taller2java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p6t2 {

    public static boolean repetir() {
        Scanner lector = new Scanner(System.in);
        boolean alt1, alt2;
        alt1 = false;
        alt2 = false;
        while (alt2 == false) {
            System.out.print("\n¿deseas realizar otra búsqueda ? \nsi/no\n:");
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

    public static String[] buscar(String arregloMotos[][], int cont) {
        Scanner lector = new Scanner(System.in);
        String print[] = new String[6];
        boolean salir = false;
        while (salir == false) {
            print[0] = "null";
            System.out.print("Digite la placa de la moto a buscar: ");
            String alt = lector.next();
            for (int i = 0; i <= cont; i++) {
                if (alt.equals(arregloMotos[i][1])) {
                    System.out.print("moto encontrada");
                    print[0] = "marca: " + arregloMotos[i][0];
                    print[1] = " - placa: " + arregloMotos[i][1];
                    print[2] = " - Motivo de ingreso: " + arregloMotos[i][2];
                    print[3] = " - estado del vehículo: " + arregloMotos[i][3];
                    print[4] = " - Anotación de salida: " + arregloMotos[i][4];
                    print[5] = String.valueOf(i);
                    salir = true;
                }
            }
            if (print[0].equals("null")) {
                System.out.print("moto no encontrada con esa placa");
                print[0] = "";
                print[1] = "";
                print[2] = "";
                print[3] = "";
                print[4] = "";
                salir = repetir();
            }
        }
        return new String[]{print[0], print[1], print[2], print[3], print[4], print[5]};
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
        String arregloMotos[][] = new String[99][5];
        System.out.print("!Bienvenido a El Maquinista¡.\n¿Qué gestión deseas realizar?");
        exit = false;
        while (exit == false) {
            System.out.print("\n1. Ingresar moto\n2. Consultar registros\n3. Entregar moto\n4. Terminar día\n:");
            switch (lector.next()) {
                case "1" -> {
                    arregloMotos[cont][0] = solicitarDato("Por favor digita la marca de la moto :");
                    arregloMotos[cont][1] = solicitarDato("Por favor digita la placa de la moto :");
                    arregloMotos[cont][2] = solicitarDato("Por favor digita el motivo de la consulta: ");
                    arregloMotos[cont][3] = "recibida";
                    arregloMotos[cont][4] = null;
                    cont++;
                    System.out.println("Moto " + arregloMotos[cont][1] + " ingresada con éxito.");
                }
                case "2" -> {
                    String print = Arrays.toString(buscar(arregloMotos, cont));
                    System.out.print(print);
                }
                case "3" -> {
                    String print[] = buscar(arregloMotos, cont);
                    System.out.println(print[1]);
                    arregloMotos[Integer.parseInt(print[5])][3] = "Entregada";
                    arregloMotos[Integer.parseInt(print[5])][4] = solicitarDato("Digite los arreglos realizados y costes adicionales por repuestos en caso de haber: ");
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
