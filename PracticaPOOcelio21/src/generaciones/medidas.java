/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaPOOcelio21.newpackage;

import java.util.Scanner;

/**
 *
 * @author ITSLOJA
 */
public class medidas {
    
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

       int KM;
       int CM;
       int Y;
       int op;
       double RES;

       System.out.println( "Ingrese la operacion" );
       System.out.println( "1.- kilometros a metros" );
       System.out.println( "2.- metros a Kilometros" );
       System.out.println( "3.- Kilometros a millas" );
       System.out.println( "\n" );
       op = leer.nextInt();

       switch (op){
                   case 1:
                          System.out.println( "Centimetros a pulgadas" );
                          System.out.println( "Ingrese los centimetros" );
                          CM = leer.nextInt();
                          RES = CM * 2.3;
                          System.out.println( "El resultado es: "+RES+" pulgadas" );
                          break;
                   case 2:
                          System.out.println( "Yardas a Metros" );
                          System.out.println( "Ingrese el numero de Yardas" );
                          Y = leer.nextInt();
                          RES = Y * 0.914401829;
                          System.out.println( "El resultado es: "+RES+" metros" );
                          break;
                   case 3:
                          System.out.println( "Kilometros a Millas" );
                          System.out.println( "Ingrese el numero de Kilometros" );
                          KM = leer.nextInt();
                          RES = KM * 0.621;
                          System.out.println( "El resultado es: "+RES+" millas" );
                          break;
                  }
       }
}
