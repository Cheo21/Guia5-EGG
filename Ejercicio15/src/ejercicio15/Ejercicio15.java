package ejercicio15;
import java.util.Scanner;
public class Ejercicio15 {


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int vector[] = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = input.nextInt();
        }
        
     input.close();
        
    }
    
}
