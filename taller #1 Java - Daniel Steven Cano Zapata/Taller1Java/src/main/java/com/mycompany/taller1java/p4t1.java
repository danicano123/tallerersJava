package com.mycompany.taller1java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p4t1 {
        public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String [] alt = new String [2];

	System.out.print("Digite el nombre de una ciudad capital: ");
	alt [0] = lector.next();
	System.out.print("Digite el nombre del país correspondiente a la anterior ciudad capital:");
	alt [1] = lector.next();
        System.out.print("La ciudad "+alt[0]+", es la capital del país "+alt[1]);
    }
}
