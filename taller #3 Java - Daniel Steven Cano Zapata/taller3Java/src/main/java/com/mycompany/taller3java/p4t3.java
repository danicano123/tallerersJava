package com.mycompany.taller3java;
import java.util.Scanner;
/**
 * @author Daniel Steven Cano Z
 */
public class p4t3 {
     public static void main(String[] args) {
     Scanner lector = new Scanner (System.in);
     System.out.print("Digite un número para que se multiplique por los números del 1 al 10 :");
     float n = lector.nextFloat();
     float r;
         for (int i = 1; i <= 10; i++) {
             r = n *i;
             System.out.println(n+" * "+i+" = "+r);
         }
     } 
}