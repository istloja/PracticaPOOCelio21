/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

import java.util.Scanner;

/**
 *
 * @author ITSLOJA
 */
public class Número {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero=0;
        try {
            numero = entrada.nextInt();
        } catch (Exception e ) {
            System.out.println("Se genero el error en la linea"+e);
            System.out.println("Porfavor ingrese bien el numero");
        }
        System.out.println("El numero ingresado es"+numero);
        try{
        int resultado=numero/0;
        System.out.println(resultado);
        }catch(Exception e){
            System.out.println("No se puede dividir nunca para 0");
    }
}
}
