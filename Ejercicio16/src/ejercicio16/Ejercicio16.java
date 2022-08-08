package ejercicio16;

import java.util.Scanner;
public class Ejercicio16 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        int n = input.nextInt();
        
        int vector[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 100) +1;
        }
        System.out.println("Ingrese un numero a buscar");
        int nro = input.nextInt();
        
        for (int i = 0; i < 10; i++) {
            if(nro == vector[i]){
                System.out.println(i);}
        }
        
        input.close();
    }
    
}
