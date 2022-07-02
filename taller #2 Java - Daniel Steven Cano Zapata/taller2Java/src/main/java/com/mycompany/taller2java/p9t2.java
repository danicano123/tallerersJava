package com.mycompany.taller2java;
import java.util.Scanner;
/**
 * @author Daniel Steven Cano Z
 */
public class p9t2 {
     public static float solicitarDato(String mensaje){
    Scanner lector = new Scanner(System.in);
    float retorno;
    System.out.print(mensaje);
    retorno = lector.nextFloat();
    return retorno;
    }
    
     public static void op(float b,float a, float B, int i){
         float r;
         switch (i) {
             case 1 -> {
                r = b*a;
                System.out.print("el área es :"+ r);
             }
             case 2 -> {
                 r = (b*a)/2; 
                 System.out.print("el área es :"+ r);
             }
             case 3 -> {
                 r = ((b+B)*a)/2;
                 System.out.print("el área es :"+ r);
             }
         }
         
     }
     
    public static void main(String[] args) {
        float b,B,a;
        Scanner lector = new Scanner(System.in);
    System.out.print("Calcular el área de: \n1. Rectángulo\n2. Triangulo\n3. Trapecio\n: ");
        switch (lector.nextInt()) {
            case 1 -> {
                b = solicitarDato("Digite la base: ");
                a = solicitarDato("Digite la altura: ");
                op(b,a,0,1);
            }
            case 2 -> {
                b = solicitarDato("Digite la base: ");
                a = solicitarDato("Digite la altura: ");
                op(b,a,0,2);
            }
            case 3 -> {
                b = solicitarDato("Digite la base menor: ");
                a = solicitarDato("Digite la altura: ");
                B = solicitarDato("Digite la base mayor");
                op(b,a,B,3);
            }
            default -> System.out.print("Opción no válida");
        }
    }
}
