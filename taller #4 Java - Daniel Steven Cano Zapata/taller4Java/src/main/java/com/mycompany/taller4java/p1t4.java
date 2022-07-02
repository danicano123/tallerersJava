package com.mycompany.taller4java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p1t4 {

    public static String solicitarDato(String mensaje) {
        Scanner lector = new Scanner(System.in);
        String retorno;
        System.out.print(mensaje);
        retorno = lector.next();
        return retorno;
    }

    public static void print(int arreglo[]) {
        for (int i = 0; i < 5; i++) {
            System.out.println("[ " + i + " ]" + " = " + arreglo[i]);
        }
    }

    public static void main(String[] args) {
        int arreglo[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arreglo[i] = Integer.parseInt(solicitarDato("Digite el número del campo " + i + " :"));
        }
        print(arreglo);
    }
}
