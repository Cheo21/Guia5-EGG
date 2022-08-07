/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = input.next();
        input.close();
        
        if(frase.startsWith("A")){
            System.out.println("Correcto!");}
        else{System.out.println("Incorrecto");}
        
    }
    
}
