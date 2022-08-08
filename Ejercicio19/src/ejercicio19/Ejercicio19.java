package ejercicio19;

import java.util.Scanner;



public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int vector[][] = new int[4][4];
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
               vector[i][j] = input.nextInt();
             }
            }
         
        
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(vector[i][j]+ " ");
            }
            System.out.println("");
        }
         
         System.out.println("");
         System.out.println("");
       
         
         boolean esAntiSimetrica =  true;
         for (int i = 0; i < 4 && esAntiSimetrica; i++) {
            for (int j = 0; j < 4 && esAntiSimetrica; j++) {
                esAntiSimetrica = (vector[i][j] == (-vector[j][i]));
            }   
        }

         System.out.println("Es anti simetrico: " + esAntiSimetrica);
    }
    
}
