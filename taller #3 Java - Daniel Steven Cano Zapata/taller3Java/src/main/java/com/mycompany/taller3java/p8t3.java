package com.mycompany.taller3java;

import java.util.Scanner;

/*
 * @author Daniel Steven Cano Z
 */
public class p8t3 {

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

    public static String[] calificar(String alumnos[][], int i) {
        Scanner lector = new Scanner(System.in);
        String print[] = new String[3];
        boolean salir = false;
        while (salir == false) {
            print[0] = "null";
            System.out.print("Para buscar escribe el nombre tal y como se registró :");
            String alt = lector.next();
            for (int j = 0; j < i; j++) {
                if (alt.equals(alumnos[j][0])) {
                    salir = true;
                    System.out.println("Alumno en curso: " + alumnos[j][0]);
                    System.out.print("1. aprobar\n2. reprobar\n :");
                    switch (lector.next()) {
                        case "1" -> {
                            print[0] = "APROVADO";
                            print[1] = String.valueOf(j);
                            print[2] = "y";
                            j = i;
                        }
                        case "2" -> {
                            print[0] = "REPROVADO";
                            print[1] = String.valueOf(j);
                            print[2] = "y";
                            j = i;
                        }
                        default ->
                            System.out.print("Opción inválida");
                    }
                } else if (alumnos[j][0].equals("null")) {
                    System.out.print("alumno no encontrado");
                    print[0] = "";
                    print[1] = "";
                    j = i;
                    salir = repetir();
                }
            }
        }
        return new String[]{print[0], print[1], print[2]};
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
        String alt;
        boolean exit;
        int cont = 0;
        int cont1 = 0;
        int i;
        String alumnos[][] = new String[8][2];
        String alumnosTotales[][] = new String[99][2];
        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 2; k++) {
                alumnos[j][k] = "null";
            }
        }
        for (int j = 0; j < 99; j++) {
            for (int k = 0; k < 2; k++) {
                alumnosTotales[j][k] = "null";
            }
        }
        System.out.print("Menú de contactos.\n¿Qué gestión deseas realizar?");
        exit = false;
        while (exit == false) {
            System.out.print("\n1. Registrar alumno \n2. Listado completo\n3. Calificar\n:");
            switch (lector.next()) {
                case "1" -> {
                    for (i = 0; i < 8; i++) {
                        if (alumnos[i][0].equals("null")) {
                            while (exit == false) {
                                cont = 0;
                                alt = solicitarDato("Por favor digita el nombre del alumno :");

                                for (int j = 0; j < 8; j++) {
                                    if (!alt.equals(alumnos[j][0])) {
                                        cont++;
                                    }
                                }
                                if (cont == 8) {
                                    alumnos[i][0] = alt;
                                    alumnos[i][1] = "En curso";
                                    System.out.println("Estudiante registrado con éxito.");
                                    i = 8;
                                    exit = true;
                                } else {
                                    System.out.println("Alumno con ese nombre se ya registrado anteriormente");
                                    exit = repetir();
                                    if (exit == true) {
                                        i = 8;
                                    }
                                }
                            }
                            exit = false;
                        }
                    }
                    if (i == 8) {
                        System.out.println("curso atualmente lleno");
                    }
                }
                case "2" -> {
                    System.out.println("Estos son los alumnos que han cursado hasta el momento :");
                    for (i = 0; i < cont1; i++) {
                        System.out.println("Nombre: " + alumnosTotales[i][0] + " - Estado: " + alumnosTotales[i][1]);
                    }
                }
                case "3" -> {
                    String print[] = calificar(alumnos, 8);
                    if ("y".equals(print[2])) {
                        System.out.println("Se ha calificado al estudiante: " + alumnos[Integer.parseInt(print[1])][0] + " como " + print[0]);
                        alumnosTotales[cont1][0] = alumnos[Integer.parseInt(print[1])][0];
                        alumnos[Integer.parseInt(print[1])][0] = "null";
                        alumnos[Integer.parseInt(print[1])][1] = "null";
                        alumnosTotales[cont1][1] = print[0];
                        cont1++;
                    }
                }
                case "4" ->
                    System.exit(0);
                default -> {
                    System.out.print("Opción no válida");
                }
            }
        }
    }
}
