package com.mycompany.taller3java;

/**
 * @author Daniel Steven Cano Z
 */
public class p3t3 {
    public static void main(String[] args) {
    StringBuilder cadena = new StringBuilder("          *");
    String alt = cadena.toString();
    String alt1 = "**";
    int i = 0 ;
    do{
            System.out.println(alt);
            cadena = cadena.deleteCharAt(0);
            alt = cadena.toString()+alt1;
            alt1 = alt1+"**";
            i++;
        }   while (i<11);
    
    alt1 = "         ***";
    System.out.println(alt1);
    i = 0;
    do{
            System.out.println(alt1);
            alt1  = alt1.substring(1)+"**";
            i++;
        }   while (i<3);
    }
}
