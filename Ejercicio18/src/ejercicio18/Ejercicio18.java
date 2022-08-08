
package ejercicio18;

public class Ejercicio18 {

 
    public static void main(String[] args) {
    
        int vector[][] = new int[4][4];
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
               vector[i][j] = (int) ((Math.random() * 10)+1);
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
         
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(vector[j][i]+ " ");
            }
            System.out.println("");
        }
    }
    
}
