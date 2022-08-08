package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String corte = "&&&&&";
        String frase;
        int correctos = 0;
        int incorrectos = 0;
        do {
            frase = input.next();
            if (!frase.equals(corte)) {
                if ((frase.length() == 5) && (frase.startsWith("X") ||
                    frase.startsWith("x")) && (frase.endsWith("O") || 
                    frase.endsWith("o"))) {
                    correctos++;
                } else {
                    incorrectos++;
                }
            }

        } while (!frase.equals(corte));

        System.out.println("Correctos: " + correctos);
        System.out.println("Incorrectos: " + incorrectos);
        
        input.close();
    }
}
