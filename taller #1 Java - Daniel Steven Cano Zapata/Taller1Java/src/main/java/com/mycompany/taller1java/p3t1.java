package com.mycompany.taller1java;
import java.util.Scanner;
/**
 * @author Daniel Steven Cano Z
 */
public class p3t1 {
    public static String mensaje (String parametro){
        Scanner lector = new Scanner (System.in);
        String asignacion;
    System.out.print(parametro);
    asignacion = lector.next();
    return asignacion;
    }
    public static void main(String[] args) {

        int i = 3;
        String[] n = {"Por favor, digite su(s) nombre(s):","Por favor, digite el nombre de su madre :","Por favor, digite el nombre de su padre :"};
	String[] a = {"Por favor, digite su(s) apellido(s):","Por favor, digite el apellido de su madre :","Por favor, digite el apellido de su padre :"};
        String[] nombre = new String [i];
	String[] apellido = new String [i]; 

        for (int j = 0; j <= 2; j++) {
            nombre [j] = mensaje(n[j]);
            apellido [j] = mensaje(a[j]);
        }
        System.out.println("Yo "+nombre[0]+" "+apellido[0]+", soy hijo de "+nombre[1]+" y "+nombre[2]+".");
    }
    
}
