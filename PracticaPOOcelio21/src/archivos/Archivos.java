/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;

/**
 *
 * @author ITSLOJA
 */
public class Archivos {
    public static void main(String[] args) {
        File archivo=new File("C:\\Users\\ITSLOJA\\Desktop//ejemplo.txt");//Crear objeto de clase archivo
        //En las comillas va el nombre y dirección del archivo
        System.out.println(archivo.exists());
        //Es una carpeta o no 
        System.out.println(archivo.isDirectory());
        //para saber si es carchivo o no
        System.out.println(archivo.isFile());
        //para saber si esta oculto
        System.out.println(archivo.isHidden());
        //para saber cuando fue la ultima modificación
        System.out.println(archivo.lastModified());
        archivo.delete();
        File carpeta=new File("C:\\Users\\ITSLOJA\\Desktop//");
        String[] arregloarchivos=carpeta.list();
        for(int i=0; i < arregloarchivos.length; i++){
        System.out.println(arregloarchivos[i]);
    }
    }
}
