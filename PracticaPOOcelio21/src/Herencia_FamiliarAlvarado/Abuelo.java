/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_FamiliarAlvarado;

/**
 *
 * @author ITS LOJA
 */
public class Abuelo extends Persona {
    Hijo nieto;
    Hija nieta;
    Padre hijo;
    Madre hierna;

    public Hijo getNieto() {
        return nieto;
    }

    public void setNieto(Hijo nieto) {
        this.nieto = nieto;
    }

    public Hija getNieta() {
        return nieta;
    }

    public void setNieta(Hija nieta) {
        this.nieta = nieta;
    }

    public Padre getHijo() {
        return hijo;
    }

    public void setHijo(Padre hijo) {
        this.hijo = hijo;
    }

    public Madre getHierna() {
        return hierna;
    }

    public void setHierna(Madre hierna) {
        this.hierna = hierna;
    }
    public Abuelo(){
    setNombres("Celio ");
    setApellidos("Alvarado");
    setEdad(68);
    
}
}
