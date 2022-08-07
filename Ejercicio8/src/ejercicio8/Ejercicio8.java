
package ejercicio8;


import java.util.Scanner;
public class Ejercicio8 {

   
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String frase= input.next();
        input.close();
        if (frase.length() == 8) {
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");}
        
    }
    
}
