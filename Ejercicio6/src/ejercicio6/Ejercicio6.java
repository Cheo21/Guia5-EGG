package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Ingrese un numero:");
       int num1 = input.nextInt();
       input.close();
       if (num1 % 2 == 0) {
           System.out.println("Es par");
       }
       else{
           System.out.println("Es impar");}
    }
    
}
