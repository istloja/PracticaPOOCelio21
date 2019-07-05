/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaPOOcelio21.newpackage;






/**
 *
 * @author ITSLOJA
 */
public class Switch {
     public static void main(String[] args)
     {
       int año = 7;
    
         
        String añoType;
        String añoInt;
         
        switch (año) 
        {
            case 1946:  añoInt = "Baby Boomers";
                     break;
            case 1964:  añoInt = "Baby Boomers";
                     break;
            case 1965:  añoInt = "Generación X";
                     break;
            case 1979:  añoInt = "Generación X";
                     break;
            case 1980:  añoInt = "Viernes";
                     break;
            case 1999:  añoInt = "Milennials o Generación Y";
                     break;
            case 2000:  añoInt = "Generación Z";
                     break;
            default: añoInt = "año invalido";
            }
         
        switch (año) 
        {
          //multiples cases sin declaraciones break
         
            case 1946:  
            
                añoType = "Tu generación es  ";
                break;
            case 1964:
            
                añoType = "Tu generación es"; 
                break;
                 
         
        }
         
  
    }
}

