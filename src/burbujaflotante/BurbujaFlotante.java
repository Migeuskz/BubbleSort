/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burbujaflotante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mikey
 */
public class BurbujaFlotante {
public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
public static String entrada;

public static int[] leerArreglo(int n) throws IOException{
    int[] a = new int[n]; 
    System.out.println("================================");
    for(int i =0; i<a.length; i++){
        System.out.println("Escriba el valor del arreglo [ " + i + " ]: ");
        entrada = bufer.readLine();
        a[i] = Integer.parseInt(entrada);
    }
    return a;
}

public static void imprimirArreglo(int[]a){
    System.out.println("============================");
    System.out.println("Imprimiendo arreglo: ");
    for(int i = 0; i<a.length; i++){
        System.out.printf("%4d", a[i]);
        System.out.println();
    }
}

public static int[] bubbleSort( int[] datos ){
        
        int auxiliar;
        boolean noCambios;
        int pasada = 0;
        
        do {
            noCambios = false;
            
            for ( int i = 0; i<(datos.length-1)-pasada; i++){
                
                if ( datos[i] > datos[i+1]){
                    auxiliar = datos[i];
                    datos[i] = datos[i+1];
                    datos[i+1] = auxiliar;
                    noCambios = true;
                }               
            }  
            pasada += 1;
            System.out.println("Pasada: ");        
            imprimirArreglo(datos);
        } while ( noCambios == true );
        
        return datos;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int[]datos;
        int[]bubble;
        int t;
        System.out.println("Programa de la Burbuja Flotante");
        System.out.println("Escribe la longitud del arreglo: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        
        datos = leerArreglo(t);
        imprimirArreglo(datos);
        bubble = bubbleSort( datos );
    }
    
}
