package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese grados centigrados: ");
        int gradosC = input.nextInt();
        
        System.out.println("Grados Fahrenheit: "+ (32+(9*gradosC/5)));


    }
    
}
