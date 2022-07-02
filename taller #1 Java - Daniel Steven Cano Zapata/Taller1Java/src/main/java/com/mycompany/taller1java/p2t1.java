package com.mycompany.taller1java;
import java.util.Scanner;
/**
 *
 * @author Daniel Steven Cano Z
 */
public class p2t1 {
     public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String nombre;
	String apellido;
        float estatura; 

	System.out.print("Por favor, digite su(s) nombre(s):");
	nombre = lector.next();
	System.out.print("Por favor, digite su(s) apellido(s):");
	apellido = lector.next();
        System.out.print("Por favor, digite su estatura :");
	estatura = lector.nextFloat();
    }
}
