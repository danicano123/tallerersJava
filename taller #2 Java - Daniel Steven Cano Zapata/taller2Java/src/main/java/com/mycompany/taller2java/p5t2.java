package com.mycompany.taller2java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p5t2 {
        public static boolean confirmarNuevaGestion(){
    Scanner lector = new Scanner(System.in);
    boolean alt1,alt2;
    alt1 = false;
    alt2 = false;
    while (alt2 == false){
    System.out.print("\n¿deseas realizar otra gestión ? \nsi/no\n:");
        switch (lector.next()) {
            case "si" ->  {
                alt1 = false;  
                alt2 = true;
            }
            case "no" ->  {
                alt1 = true;  
                alt2 = true;
                System.out.print("¡Gracias por su visita!. ¡Hasta pronto!");
            }
            default ->  {
                System.out.println("Opción no válida");
                alt1 = false;
                alt2 = false;
            }
        }
    }
    return alt1;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean exit;
        System.out.print("!Bienvenido a Mi salud! Ese producto se llama [Nombre del producto], está compuesto por [Ingredientes del producto], y está diseñado para tratar [Función del producto]\n¿Qué gestión deseas realizar?");
        exit = false;
        while (exit == false) {
            System.out.print("\n1. Comprar producto\n2. Consultar precio\n3. Devolver producto\n:");
            switch (lector.next()) {
            case "1" -> {
                System.out.print("Producto vendido con éxito");
            exit = confirmarNuevaGestion();
            }
            case "2" -> {
                System.out.print("El precio de ese producto es de [Precio del producto]");
            exit = confirmarNuevaGestion();
            }
            case "3" -> {
                System.out.print("Devolución realizada con éxito");
            exit = confirmarNuevaGestion();
            }
            default ->{
                System.out.print("Opción no válida");
            
            }
            }   
        }
        
    }
}
