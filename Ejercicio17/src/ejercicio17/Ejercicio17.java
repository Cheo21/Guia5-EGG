/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;
import javax.print.DocFlavor;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 10;
        int vector[] = new int[n];
        int contador[] = new int[5];
        

        for (int i = 0; i < n; i++) {
            vector[i] = (int) ((Math.random() * 99999)+1);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
            String aux = Integer.toString(vector[i]);
            if(aux.length() <=  5){
                contador[aux.length()-1]++;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(contador[i]);
        }
    input.close();
    }

}
