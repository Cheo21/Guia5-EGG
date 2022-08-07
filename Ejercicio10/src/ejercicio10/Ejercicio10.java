/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese tope de la suma");
        
        int tope = input.nextInt();
        
        int acumulador = 0;
        System.out.println("Ingrese numeros para acumular");
        while (acumulador < tope){
            acumulador =+ input.nextInt();
        }
        System.out.println("Acumulador");
    }
    
}
