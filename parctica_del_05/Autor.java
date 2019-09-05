/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parctica_del_05;

import java.io.Serializable;

/**
 *
 * @author ITSLOJA
 */
public class Autor implements Serializable {
   private String Nombre;
   private String Apellido;
   private int Edad;
   private String Sexo;
   

    public Autor() {
    }

    public Autor(String Nombre, String Apellido, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
        
            
        
    }
 public void EscribirArchivo(String ruta,Libro libro){
    
    

}
}