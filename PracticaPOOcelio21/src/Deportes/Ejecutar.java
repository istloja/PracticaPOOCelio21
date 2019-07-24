/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deportes;

/**
 *
 * @author ITSLOJA
 */
public class Ejecutar {
    public static void main(String[] args) {
        Deportes objeto=new Deportes("futbol","cancha",90,true,"Inglaterra");
        Individual objeto1=new Individual();
       
        System.out.println(objeto.informaciónDeporte());
        System.out.println(objeto1.informaciónDeporte());
    }
}
