
package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = input.next();
        input.close();
        System.out.println(nombre);
        
    }
    
}
