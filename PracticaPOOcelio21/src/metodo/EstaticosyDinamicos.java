/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

/**
 *
 * @author ISTLOJA V
 */
class EstaticosyDinamicos {
       public static void main(String[] args) {
        saludar();//para llamar un metodo estatico
        //si quiero llamar a despedir debo crear un objeto
        EstaticosyDinamicos objeto=new EstaticosyDinamicos();
        objeto.despedir();//asi se llama a un metodo no estatico
    }
    public static void saludar(){//este es un metodo estatico
        System.out.println("hola"); 
    }
       public static void despedir(){//este metodo no estatico
           System.out.println("chao");
       }
        
}
