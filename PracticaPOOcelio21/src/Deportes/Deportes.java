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
public class Deportes {
    private String nombre;
    private String lugar_juego;
    private float tiempo_juego;
    private boolean deporte_olimpico;
    private String Lugar_Creación;

    public Deportes(String nombre, String lugar_juego, float tiempo_juego, boolean deporte_olimpico, String Lugar_Creación) {
        this.nombre = nombre;
        this.lugar_juego = lugar_juego;
        this.tiempo_juego = tiempo_juego;
        this.deporte_olimpico = deporte_olimpico;
        this.Lugar_Creación = Lugar_Creación;
    }

    public Deportes() {
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar_juego() {
        return lugar_juego;
    }

    public void setLugar_juego(String lugar_juego) {
        this.lugar_juego = lugar_juego;
    }

    public float getTiempo_juego() {
        return tiempo_juego;
    }

    public void setTiempo_juego(float tiempo_juego) {
        this.tiempo_juego = tiempo_juego;
    }

    public boolean isDeporte_olimpico() {
        return deporte_olimpico;
    }

    public void setDeporte_olimpico(boolean deporte_olimpico) {
        this.deporte_olimpico = deporte_olimpico;
    }

    public String getLugar_Creación() {
        return Lugar_Creación;
    }

    public void setLugar_Creación(String Lugar_Creación) {
        this.Lugar_Creación = Lugar_Creación;
    }
    public void nombredeporte(){
        System.out.println("Nombre del deporte");
    }
   public String informaciónDeporte(){
        String información=nombre+" "+lugar_juego+" "+tiempo_juego+" "+deporte_olimpico+" "+Lugar_Creación;
        return información;
    }
    public static void main(String[] args) {
        Deportes objeto=new Deportes();
       objeto.setnombre("Tenis");
       objeto.setLugar_juego("mesa");
        objeto.setTiempo_juego(12);
        objeto.setDeporte_olimpico(true);
        objeto.setLugar_Creación("Inglaterra");
       
        
        objeto.setTiempo_juego(94);
        System.out.println(objeto.informaciónDeporte());
        Deportes objeto1=new Deportes("Futbol","cancha",90,true,"Italia");
        System.out.println(objeto1.informaciónDeporte());
    }
}
