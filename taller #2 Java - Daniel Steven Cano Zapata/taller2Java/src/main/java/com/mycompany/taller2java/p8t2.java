package com.mycompany.taller2java;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Daniel Steven Cano Z
 */
public class p8t2 {
     public static boolean repetir(){
    Scanner lector = new Scanner(System.in);
    boolean alt1,alt2;
    alt1 = false;
    alt2 = false;
    while (alt2 == false){
    System.out.print("\n¿deseas realizar otra búsqueda ? \nsi/no\n:");
        switch (lector.next()) {
            case "si" ->  {
                alt1 = false;  
                alt2 = true;
            }
            case "no" ->  {
                alt1 = true;  
                alt2 = true;
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
     
     public static String [] imprimir(String arregloTortas [][], int i){
     String print[] = new String[6];
      print[0]="sabor: "+ arregloTortas[i][0];
      print[1]=" - cantidad de porciones: "+arregloTortas[i][1];
      print[2]=" - decoracion: "+arregloTortas[i][2];
      print[3]=" - cantidad de unidades disponibles: "+arregloTortas[i][3];
      print[4]=" - ventas totales: "+arregloTortas[i][4];
      print[5]=" - índice de la torta: "+arregloTortas[i][5];
      
      return new String[]{print[0],print[1],print[2],print[3],print[4],print[5]};
     }
    
    public static String [] buscar(String arregloTortas[][], int cont){
        Scanner lector = new Scanner(System.in);
        String print[] = new String[6];
        boolean salir = false;
        while (salir == false) {
        print[0]= "null";            
        System.out.print("Digite el indice de una torta para buscarla :");
        String alt = lector.next();
        for (int i = 0; i <= cont; i++) {
            if (alt.equals(arregloTortas[i][5])) {
            System.out.print("torta encontrada");
            print[0]="sabor: "+ arregloTortas[i][0];
            print[1]=" - cantidad de porciones: "+arregloTortas[i][1];
            print[2]=" - decoracion: "+arregloTortas[i][2];
            print[3]=" - cantidad de unidades disponibles: "+arregloTortas[i][3];
            print[4]=" - ventas hasta el momento: "+arregloTortas[i][4];
            print[5]=" - índice de la torta: "+arregloTortas[i][5];
            salir = true;
                }
            }
        if (print[0].equals("null")) {
            System.out.print("torta no encontrada con ese índice");
             print[0]= "";
             print[1]= "";
             print[2]= "";
             print[3]= "";
             print[4]= "";
             print[5]= "";
             salir = repetir();
            }
        }   
        return new String[]{print[0],print[1],print[2],print[3],print[4],print[5]};
    }
    
    public static String [] vender(String arregloTortas[][], int cont){
        Scanner lector = new Scanner(System.in);
        String print[] = new String[6];
        boolean salir = false;
        while (salir == false) {
        print[0]= "null";            
        System.out.print("Digite el indice de una torta para buscarla :");
        String alt = lector.next();
        for (int i = 0; i <= cont; i++) {
            if (alt.equals(arregloTortas[i][5])) {
            System.out.print("torta encontrada");
            print[0]=arregloTortas[i][0];
            print[1]=arregloTortas[i][1];
            print[2]=arregloTortas[i][2];
            print[3]=arregloTortas[i][3];
            print[4]=arregloTortas[i][4];
            print[5]=arregloTortas[i][5];
            salir = true;
                }
            }
        if (print[0].equals("null")) {
            System.out.print("torta no encontrada con ese índice");
             print[0]= "";
             print[1]= "";
             print[2]= "";
             print[3]= "";
             print[4]= "";
             print[5]= "";
             salir = repetir();
            }
        }   
        return new String[]{print[0],print[1],print[2],print[3],print[4],print[5]};
    }
    
    public static String solicitarDato(String mensaje){
    Scanner lector = new Scanner(System.in);
    String retorno;
    System.out.print(mensaje);
    retorno = lector.next();
    return retorno;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean exit;
        int cont = 0;
        String arregloTortas[][]= new String [99][6];
        System.out.print("!Bienvenido a la pastelería de don Carlos¡.\n¿Qué gestión deseas realizar?");
        exit = false;
        while (exit == false) {
            System.out.print("\n1. registrar nueva torta\n2. Consultar existencias\n3. vender torta\n4. Terminar día\n:");
            switch (lector.next()) {
                        case "1" -> {
                            arregloTortas[cont][0] = solicitarDato("Por favor digita el sabor de la torta :");
                            arregloTortas[cont][1] = solicitarDato("Por favor digita la cantidad de porciones :");
                            arregloTortas[cont][2] = solicitarDato("Por favor digita la decoracion: ");
                            arregloTortas[cont][3] = solicitarDato("Por favor digita la cantidad de unidades :");
                            arregloTortas[cont][4] = "0";
                            arregloTortas[cont][5] = String.valueOf(cont);
                            cont++;
                            System.out.println("torta registrada con éxito con indice: "+(cont-1));
                            }
            case "2" -> {
               String print = Arrays.toString(buscar(arregloTortas, cont));
               System.out.print(print);
            }
            case "3" -> {
               String print []= vender(arregloTortas, cont);
               if (!"".equals(print[0])){
               int alt = Integer.parseInt(solicitarDato("Digita la cantidad de tortas de este tipo a vender :") );
               int alt1 = Integer.parseInt(arregloTortas[Integer.parseInt(print[5])][3]);
               if ((alt1-alt)>=0){
                   arregloTortas[Integer.parseInt(print[5])][3]=String.valueOf(alt1-alt);
                   arregloTortas[Integer.parseInt(print[5])][4]=String.valueOf(Integer.parseInt(arregloTortas[Integer.parseInt(print[5])][4])+alt);
               }else {
                   System.out.println("Cantidad insuficiente para realizar la venta. Actualmente hay "+alt1+" unidades");
               }               
               }          
            }
             case "4" -> {
                 for (int  j= 0; j <= cont-1; j++) {
                     String print = Arrays.toString(imprimir(arregloTortas, j));
                     System.out.println(print);
                 }
                exit = true ;
            }
            default ->{
                System.out.print("Opción no válida");
            }
            }   
        }   
    }
}
