package com.mycompany.taller2java;

import java.util.Scanner;

/**
 * @author Daniel Steven Cano Z
 */
public class p7t2 {
     public static String solicitarDato(String mensaje){
    Scanner lector = new Scanner(System.in);
    String retorno;
    System.out.print(mensaje);
    retorno = lector.next();
    return retorno;
    }
    
    public static void imc (float peso,float altura){
    float respuesta = peso / (altura*altura);
    if (respuesta < 18.5){
    System.out.print("Tu índice de masa corporal es de: "+respuesta+", por lo que te encuentras en peso bajo");
    }else if(respuesta >= 18.5 && respuesta < 25){
    System.out.print("Tu índice de masa corporal es de: "+respuesta+", por lo que te encuentras en peso normal");
    }else if(respuesta >= 25 && respuesta <= 30){
    System.out.print("Tu índice de masa corporal es de: "+respuesta+", por lo que te encuentras en sobre peso");
    }else System.out.print("Tu índice de masa corporal es de: "+respuesta+", por lo que te encuentras en obesidad");
    }
    
    public static void main(String[] args) {
    float altura = Float.valueOf(solicitarDato("Digite su altura en metros: ")) ;
    float peso = Float.valueOf(solicitarDato("Digite su peso en kilos: "));
    imc(peso,altura);                
    }
}
