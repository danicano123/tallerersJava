package com.mycompany.taller1java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p5t1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String alt [] = new String [5];
        String op [] = {"Digite el nombre de su mascota :","Digite el tipo de mascota que tienes :","Digite su nombre completo: ","Digite la edad de su mascota en meses: "}; 
        for (int i = 0; i < 4; i++) {
            System.out.print(op[i]);
            alt [i] = lector.next();
        }
          alt [4] = "meses"; 
        System.out.print(alt[0]+" es un(a) "+alt[1]+", el cual, tiene "+alt[3]+" "+alt[4]+" de edad y "+alt[2]+" es actualmente su dueño(a).");
    }
}
