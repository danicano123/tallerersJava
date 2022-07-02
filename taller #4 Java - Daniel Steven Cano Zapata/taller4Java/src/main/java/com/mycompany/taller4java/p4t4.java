package com.mycompany.taller4java;

/**
 * @author Daniel Steven Cano Z
 */
public class p4t4 {

    public static void main(String[] args) {
        String print = "";
        int arreglo[] = new int[20];
        int cont = 0;
        int alt = 1;
        for (int i = 0; i <= 1; i++) {
            print += "° ";
            for (int j = 0; j <= 4; j++) {
                arreglo[cont] = alt;
                cont++;
                if (alt < 10) {
                    print += 0;
                }
                alt++;
                print += arreglo[cont - 1] + " ";
            }
            alt += 4;
            print += "\n";
            print += "° ";
            for (int j = 0; j <= 4; j++) {
                arreglo[cont] = alt;
                cont++;
                if (alt < 10) {
                    print += 0;
                }
                alt--;
                print += arreglo[cont - 1] + " ";
            }
            alt += 6;
            print += "\n";
        }
        System.out.println(print);
    }
}
