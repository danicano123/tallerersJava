package com.mycompany.taller3java;
/**
 * @author Daniel Steven Cano Z
 */
public class p2t3 {
    public static void main(String[] args) {
    StringBuilder cadena = new StringBuilder("         *");
    String alt = cadena.toString();
    String alt1 = "*";
    int i = 0;
    while (i <10){
            System.out.println(alt);
            cadena = cadena.deleteCharAt(0);
            alt = cadena.toString()+alt1;
            alt1 = alt1+"*";
            i++;
        }   
    }
}
