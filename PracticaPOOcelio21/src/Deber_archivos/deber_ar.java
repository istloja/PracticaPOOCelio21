/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_archivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ITSLOJA
 */
public class deber_ar {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opción;
        System.out.println("Menu de operaciones");
		System.out.println("1 musica");
		System.out.println("2 imagenes");
		System.out.println("3 Documentos");
		System.out.println("4 para NetBeans");
                System.out.println("5 Para videos");
		
        opción=entrada.nextInt();
        switch (opción) {
            case 1:
                System.out.println("Usted ha seleccionado musica");
                File carpeta = new File("C:\\Users\\ITSLOJA\\Music");
                String[] arregloarchivos = carpeta.list();
                for (int i = 0; i < arregloarchivos.length; i++) {
                    System.out.println(arregloarchivos[i]);
                }
                break;
            case 2:
                System.out.println("Usted ha seleccionado Imagenes");
                File carpeta1 = new File("C:\\Users\\ITSLOJA\\Pictures");
                String[] arregloarchivos1 = carpeta1.list();
                for (int i = 0; i < arregloarchivos1.length; i++) {
                    System.out.println(arregloarchivos1[i]);
                }
                break;
         case 3:
                System.out.println("Usted ha seleccionado Documentos");
                File carpeta2 = new File("C:\\Users\\ITSLOJA\\Documents");
                String[] arregloarchivos2 = carpeta2.list();
                for (int i = 0; i < arregloarchivos2.length; i++) {
                    System.out.println(arregloarchivos2[i]);
                }
                break;
                 case 4:
                System.out.println("Usted ha seleccionado NetBeans");
                File carpeta3 = new File("C:\\Users\\ITSLOJA\\Documents\\NetBeansProjects");
                String[] arregloarchivos3 = carpeta3.list();
                for (int i = 0; i < arregloarchivos3.length; i++) {
                    System.out.println(arregloarchivos3[i]);
                }
           break;
                 case 5:
                System.out.println("Usted ha seleccionado Videos");
                File carpeta4 = new File("C:\\Users\\ITSLOJA\\Videos");
                String[] arregloarchivos4 = carpeta4.list();
                for (int i = 0; i < arregloarchivos4.length; i++) {
                    System.out.println(arregloarchivos4[i]);
        }
        
    }
    }
}
        
        
    
    

