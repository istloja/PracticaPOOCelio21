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
public class Calcudora {
    public static void main(String[] args) {
    
		Scanner entrada=new Scanner(System.in);
               
		int division;
		double multiplicacion;
		int num;
		String num1;
		String num2;
		int num3;
		int num4;
		int num5;
		int num6;
		int num7;
		int num8;
		int resta;
		int suma;
		System.out.println("Menu de operaciones");
		System.out.println("1 para Suma");
		System.out.println("2 para Resta");
		System.out.println("3 para Multiplicacion");
		System.out.println("4 para Division");
		System.out.println("Ingrese una opcion: ");
		num=entrada.nextInt();
		switch (num) {
		case 1:
                        
			System.out.println("Usted ha seleccionado Suma");
			System.out.println("Ingrese un numero");
			int numero1 = 0;
                        numero1=entrada.nextInt();
			System.out.println("ingrese el numero que desea sumar");
			int numero2 = 0;
                        numero2=entrada.nextInt();
			suma = numero1+numero2;
			System.out.println("El resultado de su suma es  "+suma);
	
			break;
		case 2:
			System.out.println("Usted a seleccionado Resta");
			System.out.println("ingrese un numero");
			int numero5 = 0;
                        numero5=entrada.nextInt();
			System.out.println("ingrese oel numero que desea restar");
			int numero6 = 0;
                        numero6=entrada.nextInt();
			resta = numero5-numero6;
			System.out.println("EL resultado de su resta es  "+resta);
			
			break;
		case 3:
			System.out.println("Usted ha seleccionado Multiplicacion");
			System.out.println("ingrese un numero");
			int numero7 = 0;
                        numero7=entrada.nextInt();
			System.out.println("ingrese el numero al que desea multiplicar");
			int numero8 = 0;
                        numero8=entrada.nextInt();
			multiplicacion = numero7*numero8;
			System.out.println("El resultado de su multiplicacion es  "+multiplicacion);
			
		case 4:
			System.out.println("Usted ha seleccionado Division");
			System.out.println("ingrese un numero");
                        
			int numero9 = 0;
                        numero9=entrada.nextInt();
			System.out.println("ingrese el numero por el cual desea dividir");
			int numero10 = 0;
                        numero10=entrada.nextInt();
			division = numero9/numero10;
			System.out.println("El resultado de su division es   "+division);
			
			break;
		default:
			System.out.println("La opcion ingresada no es valida");
		}
    }
}

