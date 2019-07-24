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
public class Individual extends Deportes {
    private String jugador;
    private int edad;
    private int titulos;
    private String entrenador;
    private String lugar_nacimiento;

    public Individual(String jugador, int edad, int titulos, String entrenador, String lugar_nacimiento, String nombre, String lugar_juego, float tiempo_juego, boolean deporte_olimpico, String Lugar_Creación) {
        super(nombre, lugar_juego, tiempo_juego, deporte_olimpico, Lugar_Creación);
        this.jugador = jugador;
        this.edad = edad;
        this.titulos = titulos;
        this.entrenador = entrenador;
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public Individual() {
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

 

    
    }

    
    
    






