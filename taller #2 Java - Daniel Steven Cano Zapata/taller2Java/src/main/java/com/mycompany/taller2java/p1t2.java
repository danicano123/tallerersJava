package com.mycompany.taller2java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p1t2 { 
    public static void print (int parametro) {
        if (parametro >= 18){
            System.out.println("Usted es mayor de edad");
        }        
    }
    public static void main(String[] args) {
    Scanner lector = new Scanner (System.in);
    int edad;
    System.out.print("Digite su edad: ");
    edad = lector.nextInt();
    print(edad);
    }
}
