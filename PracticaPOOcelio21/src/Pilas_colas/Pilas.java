/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaPOOcelio21.pilas_cola;

/**
 *
 * @author ITSLOJA
 */
public class Pilas {

 public static void main(String []args){
  
  System.out.println("------Pila------");
  Pila pila = new Pila();
  pila.apilar("A");
  pila.apilar("B");
  pila.apilar("C");
  pila.apilar("D");
  
  System.out.println("Esta vacia la pila?:" + pila.vacia());
  System.out.println("Tamaño de la pila:" + pila.size());
  
  System.out.println(pila.cima());
  pila.desapilar();
  System.out.println(pila.cima());
  pila.desapilar();
  System.out.println(pila.cima());
  pila.desapilar();
  System.out.println(pila.cima());
  pila.desapilar();
  
  System.out.println("Esta vacia la pila?:" + pila.vacia());
    
  System.out.println("------Cola------");
  Cola cola = new Cola();
  cola.encolar("A");
  cola.encolar("B");
  cola.encolar("C");
  cola.encolar("D");
  
  System.out.println("Esta vacia la cola?:" + cola.vacia());
  System.out.println("Tamaño de la cola:" + cola.size());
  
  System.out.println(cola.frente());
  cola.desencolar();
  System.out.println(cola.frente());
  cola.desencolar();
  System.out.println(cola.frente());
  cola.desencolar();
  System.out.println(cola.frente());
  cola.desencolar();
  
  System.out.println("Esta vacia la cola?:" + cola.vacia());
 }
}
