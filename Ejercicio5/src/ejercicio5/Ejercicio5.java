/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        System.out.println("El doble es:  "+ num*2);
        System.out.println("El triple es: " + num*3);
        System.out.println("La raiz cuadrada es: "+ Math.sqrt(num));
       
    }
    
}
