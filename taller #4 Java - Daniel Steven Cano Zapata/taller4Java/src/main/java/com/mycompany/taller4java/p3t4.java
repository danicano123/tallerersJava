package com.mycompany.taller4java;

/**
 * @author Daniel Steven Cano Z
 */
public class p3t4 {
    public static void main(String[] args) {
        String primos = "Números primos:\n";
        int cont;
        for (int i = 1; i <= 1000; i++) {
            cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j==0){
                cont++;
                } 
            }
            if(cont == 1 || cont == 2){
            primos = primos +" "+i+"\n";
            }
        }
        System.out.println(primos);
    }
}
