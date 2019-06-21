/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoocelio21;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA V
 */
public class VoidyDatos {
        // es un metodo de tipo void que suma dos numero y presenta el resultado
    public void sumar(int numero1, int numero2){//recibe 2 numeros de tipo entero
        System.out.println("la suma es"+(numero1+numero2));//presenta el resultado
    }
    //loa metodos que devuelvan datos pueden ser de diferntes tipos como
    //int.double,String,char,booleano y tanbien pueden ser obvjeto
    public int sumar1(int numero1, int numero2){
        return numero1+numero2; //devolvemos el valor
    }
    public String unirCadenas(String cadena1,String cadena2){
        return cadena1+cadena2;
    }
    public boolean iniciaSesion(String usuario,String password){
        boolean valor = false;
        if (usuario.equals("admin")&& password.equals("123")){
        valor = true;
    }
        return valor;
    }

    public static void main(String[] args) {
        VoidyDatos objeto=new VoidyDatos();// creamos un objeto
        objeto.sumar(10,8);//llamamos al metodo sumar y enviamos 2 nu8meros
        objeto.sumar(11,23);
        objeto.sumar(80, 7);
        int resultado=objeto.sumar1(40,10);//guardo lo que devuelve el metodo sumar
        System.out.println("la suma es"+resultado);
        System.out.println(resultado+resultado);
        String cadena=objeto.unirCadenas("hola", "mundo");
        System.out.println("la cadena unida es:"+cadena);
        boolean variableinicio=objeto.iniciaSesion("admin", "123");
        System.out.println(variableinicio);
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese el usuario");
        String usuario=entrada.next();
        System.out.println("ingrese la contraseña");
        String password=entrada.next();
        boolean inicioSesion=objeto.iniciaSesion(usuario,password);
        if(inicioSesion){
            System.out.println("bienbenido al sistema");
        }else{
            System.out.println("credenciales incorrecto");
        }
        
        
}
}
