/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2java;

import java.util.Scanner;

/**
 *
 * @author Daniel Steven Cano Z
 */
public class p3t2 {
    public static void print (int arg1,String arg2) {
        if (arg1 >= 18){
            System.out.println(arg2+" usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }else{
            System.out.println(arg2+" usted es menor de edad, por lo tanto no puede entrar a la fiesta, por favor devúelvase a su casa");
        }
            
    }
    public static void main(String[] args) {
    Scanner lector = new Scanner (System.in);
    String name;
    int age;
    System.out.print("Digite su nombre: ");
    name = lector.next();
    System.out.print("Digite su edad: ");
    age = lector.nextInt();
    print(age,name);
    }
}
