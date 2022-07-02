package com.mycompany.taller4java;

/**
 * @author Daniel Steven Cano Z
 */
public class p2t4 {

    public static float poner() {
        float retorno;
        retorno = (Math.round(Math.random() * 100));
        return retorno;
    }

    public static void main(String[] args) {
        float alt[] = new float[20];
        String pares = "Números pares: ";
        String impares = "Números impares: ";
        for (int i = 0; i < 20; i++) {
            alt[i] = poner();
            if (alt[i] % 2 == 0) {
                pares = pares + String.valueOf(alt[i]) + " ";
            } else {
                impares = impares + String.valueOf(alt[i] + " ");
            }
        }
        System.out.println(pares);
        System.out.println(impares);
    }

}
