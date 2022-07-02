package com.mycompany.taller4java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p5t4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int arreglo[][] = new int[10][10];
        int n1, n2;
        System.out.println("                                          COLUMNAS                                         \n______________________________________________________________________________________________\n    |    0   |    1   |    2   |    3   |    4   |    5   |    6   |    7   |    8   |    9   |\n-----------------------------------------------------------------------------------------------");
        for (int i = 1; i < 11; i++) {
            System.out.print("| " + (i - 1) + " ");
            for (int j = 1; j < 11; j++) {
                arreglo[i - 1][j - 1] = i * j;
                if (i < 10) {
                    System.out.print("| " + String.valueOf(i) + " X " + String.valueOf(j) + " |");
                } else {
                    System.out.print("|" + String.valueOf(i) + " X " + String.valueOf(j) + " |");
                }
            }
            System.out.println("");
        }
        while (1 < 2) {
            System.out.print("Digita la fila que deseas multiplicar: ");
            n1 = lector.nextInt();
            System.out.print("Digita la columna que deseas multiplicar: ");
            n2 = lector.nextInt();
            if (n1 < 10 && n2 < 10) {
                System.out.println(arreglo[n1][n2]);
            } else {
                System.out.println("números fuera de rango");
            }
        }
    }
}
