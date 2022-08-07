
package ejercicio3;

import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     String frase = input.next();
     input.close();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
     
    }
    
}
