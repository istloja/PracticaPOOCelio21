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
public class Equipo extends Deportes{
    private String nombre_equipo;
    private int titulos_nacionales;
    private int titulos_internacionales;
    private String DT;
    private String Presidente_club;

    public Equipo(String nombre_equipo, int titulos_nacionales, int titulos_internacionales, String DT, String Presidente_club, String nombre, String lugar_juego, float tiempo_juego, boolean deporte_olimpico, String Lugar_Creación) {
        super(nombre, lugar_juego, tiempo_juego, deporte_olimpico, Lugar_Creación);
        this.nombre_equipo = nombre_equipo;
        this.titulos_nacionales = titulos_nacionales;
        this.titulos_internacionales = titulos_internacionales;
        this.DT = DT;
        this.Presidente_club = Presidente_club;
    }

    public Equipo() {
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public int getTitulos_nacionales() {
        return titulos_nacionales;
    }

    public void setTitulos_nacionales(int titulos_nacionales) {
        this.titulos_nacionales = titulos_nacionales;
    }

    public int getTitulos_internacionales() {
        return titulos_internacionales;
    }

    public void setTitulos_internacionales(int titulos_internacionales) {
        this.titulos_internacionales = titulos_internacionales;
    }

    public String getDT() {
        return DT;
    }

    public void setDT(String DT) {
        this.DT = DT;
    }

    public String getPresidente_club() {
        return Presidente_club;
    }

    public void setPresidente_club(String Presidente_club) {
        this.Presidente_club = Presidente_club;
    }

    
    }

   
    
   

