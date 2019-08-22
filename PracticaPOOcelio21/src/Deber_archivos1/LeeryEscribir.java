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
public class LeeryEscribir {
      public Lista <Estudiante> leerPersonas (String url) {
        
            List <Estudiante> Lista = new ArrayList <Estudiante> ();
            try {
                ObjectInputStream lector = nuevo ObjectInputStream (nuevo FileInputStream (url));
                Objeto auxiliar = lector.readObject ();
                while (auxiliar! = nulo) {
                    Estudiante p1 = (Estudiante) auxiliar;
                    Lista.add (p1);
                    auxiliar = lector.readObject ();
                }

            } catch (Excepción e) {//
                System.out.println ("error" + e);
            }

      
        return Lista;

    }

    public void leerLista (variable de cadena) {
        try {
            ObjectInputStream lector = nuevo ObjectInputStream (nuevo FileInputStream (variable));
            Objeto auxiliar = lector.readObject ();
            while (auxiliar! = nulo) {
                Estudiante p1 = (Estudiante) auxiliar;
                System.out.println ("su direccion" + p1.getDireccion ());
                auxiliar = lector.readObject ();
            }

        } catch (Excepción e) {
            System.out.println ("error" + e);
        }

    }

    public void escribirObjeto (String direccion, Estudiante p1) {

        try {
            ObjectOutputStream escritorio = nuevo ObjectOutputStream (nuevo FileOutputStream (direccion));
            escritorio.writeObject (p1);                                                                 
            escritorio.close ();
        } catch (Excepción e) {
            System.out.println ("se produjo un error en" + e);
        }
    }

    public void leerArchivo (String direccion) {
        try {
            ObjectInputStream lector = nuevo ObjectInputStream (nuevo FileInputStream (direccion));
            Objeto auxiliar = lector.readObject ();
            Estudiante p1 = (Estudiante) auxiliar;
            System.out.println ("leer direccion");
        } catch (Excepción e) {
            System.out.println (e);
        }
    }

    public void escribirLista (String direccion, List <Estudiante> lista) {
        try {
            ObjectOutputStream escritorio = nuevo ObjectOutputStream (nuevo FileOutputStream (direccion));
            para (Estudiante estudiante: lista) {
                escritorio.writeObject (estudiante);
            }
            escritorio.close ();
        } catch (Excepción e) {
            System.out.println ("error" + e);

        }
    }

    public static void main (String [] args) {
        LeeryEscribir objeto = nuevo LeeryEscribir ();
        Estudiante p2 = nuevo Estudiante ("Fernando", "ortega", 20, "quito", nueva Materia
        ("álgebra", 2, "jhon", nueva Carrera ("software", 5,2)));
        Estudiante p3 = nuevo Estudiante ("Pedro", "nitales", 23, "carcelen", nueva Materia
        ("quimica", 2, "manuel", nueva Carrera ("electricidad", 5,2)));
           Estudiante p4 = nuevo Estudiante ("Juan", "ramirez", 24, "malacatos", nueva Materia
        ("fisica", 2, "eduardo", nueva Carrera ("Contabilidad", 5,2)));
              Estudiante p5 = nuevo Estudiante ("ander", "ullauri", 27, "saraguro", nueva Materia
        ("matematicas", 2, "freddy", nueva Carrera ("software", 5,2)));
                Estudiante p6 = nuevo Estudiante ("Ana", "remache", 12, "cumbe", new Materia
        ("quimica", 2, "andrea", nueva Carrera ("Contabilidad3", 5,2)));
                  Estudiante p7 = nuevo Estudiante ("Juan", "ramirez", 24, "malacatos", nueva Materia
        ("fisica", 2, "eduardo", nueva Carrera ("Contabilidad", 5,2)));
              Estudiante p8 = nuevo Estudiante ("Joel", "ullauri", 27, "saraguro", nueva Materia
        ("matematicas", 2, "freddy", nueva Carrera ("software", 5,2)));
                Estudiante p9 = nuevo Estudiante ("josue", "remache", 12, "cumbe", new Materia
        ("quimica", 2, "andrea", nueva Carrera ("Contabilidad3", 5,2)));
  Estudiante p10 = nuevo Estudiante ("luis", "ramirez", 24, "malacatos", nueva Materia
        ("fisica", 2, "eduardo", nueva Carrera ("Contabilidad", 5,2)));
              Estudiante p11 = nuevo Estudiante ("alex", "ullauri", 27, "saraguro", nueva Materia
        ("matematicas", 2, "freddy", nueva Carrera ("software", 5,2)));              
       
        
        
        List <Estudiante> Lista = new ArrayList <> (); // hacemos una lista para guarar objetos
        // guardamos los objetos en la variable

        Lista.add (p2);
        Lista.add (p3);
        Lista.add (p4);
       Lista.add (p5);
       Lista.add (p6);
         Lista.add (p7);
        Lista.add (p8);
        Lista.add (p9);
       Lista.add (p10);
       Lista.add (p11);
        int a = Lista.size (); // numero de listas
        System.out.println ("numero de listas" + a);
     for (Estudiante estudiante: Lista) {// imporimo los nombres de la lista
       // Estudiante p1 = nuevo Estudiante ("Vicente", "Luzuriaga", 22, "El Sauce", nueva Materia
       // ("Matematicas", 2, "jhon", nueva Carrera ("Contabilidad", 5,2)));
        
          System.out.println ("Nombre" + estudiante.getNombre () + "Apellido" + estudiante.getA apellido () + "edad" + estudiante.getEdad () + "Direccion" + estudiante.getDireccion () + "Materia" +
                  estudiante.getMateria (). getNombre () + "Creditos" + estudiante.getMateria (). getCreditos () + "Docente" + estudiante.getMateria (). getDocente () + "Carrera" + estudiante.getMateria (). getCarrera ( ) .getNombre ()
                  + "Ciclos" + estudiante.getMateria (). GetCarrera (). GetNumerCiclos () + "Numero de creditos" + estudiante.getMateria (). GetCarrera (). GetNumeroCreditos ());
//            
//            
//}
// System.out.println (Lista.size ());
       objeto.escribirLista ("C: \\ Users \\ ISTLOJA12 \\ Desktop / ejemplo.txt", Lista);

      // objeto.escribirObjeto ("C: \\ Users \\ USUARIO \\ Desktop \\ ejemplo.txt", p2);
        //objeto.leerArchivo("C:\\Users\\ist loja \\ Desktop \\\\ ejemplo.txt ");
        //objeto.leerLista("C:\\Users\\USUARIO\\Desktop\\ejemplo.txt ");
      // Lista <Estudiante> b = objeto.leerPersonas ("C: \\ Users \\ ISTLOJA12 \\ Desktop / ejemplo.txt");
        // para (Estudiante estudiante: b) {
           // System.out.println ("edades" + p2.getNombre ());
            
        }

    }
}
