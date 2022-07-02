package com.mycompany.taller3java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p5t3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
    String name="";
    boolean exit = false;
    while (exit == false){
       System.out.print("\n1. registrar nombre\n2. saludar\n3. salir\n:");
        switch (lector.next()) {
            case "1" -> {
                System.out.print("Digite un nombre: ");
                name = lector.next();
                }
            case "2" -> {
                if (!"".equals(name)) {
                    System.out.println("Es un gusto saludarte "+name);
                }else System.out.print("Aún no hay nombres");
                
                }
            case "3" -> {
                exit = true;
                }
            default -> System.out.println("Opcion no válida");
        }
    }
}
}
