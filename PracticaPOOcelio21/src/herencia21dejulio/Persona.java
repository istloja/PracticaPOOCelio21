/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia21dejulio;

/**
 *
 * @author ISTLOJA V
 */
public class Persona {
    private String  nombre;
    private String apellidos;
    private int cedula;
    private String sexo;
    public void saludar(){
        System.out.println("hola");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public static void main(String[] args) {
        Persona objeto =new Persona();
        objeto.setNombre("manuel");
        System.out.println(objeto.getNombre());
    }
}
