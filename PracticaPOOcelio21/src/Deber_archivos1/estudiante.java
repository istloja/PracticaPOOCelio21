/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_archivos1;

/**
 *
 * @author ITSLOJA
 */
public class estudiante extends Serializable {

  
    private String nombre;
      private String apellido ;
    private  int edad;
      private String direccion;
       private Materia Materia;

    public estudiante() {
    }

    public estudiante(String nombre, String apellido, int edad, String direccion, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.Materia = materia;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMateria() {
        return Materia;
    }
    

    public void setMateria(String materia) {
        this.Materia = materia;
    }
 public static void main (String [] args) {
        // (String nombre, int numerCiclos, int numeroCreditos)
        Estudiante p1 = new Estudiante ("Celio", "Alvarado", 22, "El Sauce", new Materia
        ("Matematicas", 2, "jhon", new Carrera ("Software", 5,2)));
        System.out.println ("nombre del estudiante" + p1.getNombre () + "Materia" + p1.getMateria (). GetNombre () + "Carrera" + p1.getMateria (). GetCarrera (). GetNombre ()) ;
        
    }
    
 
}
}
