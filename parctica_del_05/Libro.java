/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parctica_del_05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITSLOJA
 */
public class Libro implements Serializable {

    private String Nombre;
    private int Num_pag;
    private Autor Autor;
    private int año_edi;
    private String Genero;

    public Libro() {
    }

    public Libro(String Nombre, int Num_pag, Autor Autor, int Fecha_edi, String Genero) {
        this.Nombre = Nombre;
        this.Num_pag = Num_pag;
        this.Autor = Autor;
        this.año_edi = Fecha_edi;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNum_pag() {
        return Num_pag;
    }

    public void setNum_pag(int Num_pag) {
        this.Num_pag = Num_pag;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }

    public int getFecha_edi() {
        return año_edi;
    }

    public void setFecha_edi(int Fecha_edi) {
        this.año_edi = Fecha_edi;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void Escribirlibro(String ruta, Libro libro) {
        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(ruta));
            ejemplo.writeObject(libro);
            ejemplo.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
public int LibroMasAntiguo(List<Libro>lista){
    int masantiguo=lista.get(0)
}


   

    public static void main(String[] args) {
        Libro objeto = new Libro();
        Libro libro1 = new Libro("La mecanica del corazón", 12, new Autor("Mathias", "Malzieu", 20, "Masculino"), 2015, "Romance");
        Libro libro2 = new Libro("Los ojos de mi princesa", 12, new Autor("Carlos", "Cuatemuck", 20, "Masculino"), 2000, "Romance");
        Libro libro3 = new Libro("Cuando los Guayacanes Florecian", 12, new Autor("Nelson ", "Estupiñan", 20, "Masculino"), 2010, "Romance");
        Libro libro4 = new Libro("La emancipada", 12, new Autor("Migiel", "Riofrio", 20, "Masculino"), 2012, "Romance");
        Libro libro5 = new Libro("Cumanda", 12, new Autor("Juan", "Mera", 20, "Masculino"), 2006, "Romance");

        List<Libro> lista = new ArrayList<>();

    lista.add(libro1);
    lista.add(libro2);
    lista.add(libro3);
    lista.add(libro4);
    lista.add(libro5);

    objeto.Escribirlibro("C:\\Users\\ITSLOJA\\Desktop\\Libro.txt",libro1);
//    objeto.Leerlibro("C:\\Users\\ITSLOJA\\Desktop\\Libro.txt");
    
}
}
