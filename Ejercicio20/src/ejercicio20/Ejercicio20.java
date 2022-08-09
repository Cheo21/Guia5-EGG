package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingre un valor para la matriz cuadrada");

        int n = input.nextInt();
        int matriz[][] = new int[n][n];

    }

    public static int revisarColumna(int[][] matriz) {
        int sumaAct = 0;
        int sumaAnt = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaAct= 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaAct = matriz[i][j] + sumaAct;
            }
            if (sumaAnt == 0) {
                sumaAnt = sumaAct;
            } else if (sumaAnt != sumaAct) {
                return -1;
            }
        }
        return sumaAct;
    }

    public static int revisarFila(int[][] matriz){
         int sumaAct = 0;
        int sumaAnt = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaAct = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaAct= matriz[j][i] + sumaAct;
            }
            if (sumaAnt == 0){
                sumaAnt = sumaAct;
            }
            else if(sumaAnt != sumaAct){
                return -2;
            }
        }
        return sumaAct;
    }
    
    
    public static int revisarDiagonales(int[][] matriz){
          int suma1 = 0;
          int suma2 = 0;
        
          for (int i = 0; i < matriz.length; i++) {
            suma1 = suma1 + matriz[i][i];
        }
          
          for (int i = matriz.length -1, j=0  ; j < matriz.length; j++, i--) {
            suma2= suma2 + matriz[i][j];
        }
          if (suma1 == suma2)  return suma1;
          else return -3;
          
        }
          
          
          
    
    
    
    public static boolean esMagica(int[][] matriz) {
        int aux = revisarColumna(matriz);
        boolean resultado = ((aux == revisarFila(matriz)) && (aux == revisarDiagonales(matriz)));
        
        return resultado;
    }

}
