
package ejercicio11;

import java.util.Scanner;
public class Ejercicio11 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ope 1: ");
        int ope1 = input.nextInt();
        System.out.println("");
        
        System.out.print("Ope 2: ");
        int ope2 = input.nextInt();
        System.out.println("");
        int opcion;
        
        
        do{
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir.");
        System.out.println("Elija una opcion:");
        
        

        opcion = input.nextInt();
        
        
        switch(opcion){    
            case 1:{
                System.out.println("Resultado: "+ (ope1 + ope2));
                break;
            }
            case 2:{
                System.out.println("Resultado: " + (ope1 - ope2));
                break;
            }
            case 3: {
                System.out.println("Resultado: "+ (ope1 * ope2));
                break;}
            
            case 4:{
                if (ope2 != 0) {
                     System.out.println("Resultado: "+ (ope1 / ope2));}
                else System.out.println("No se puede dividir por 0");
                break;}
        
            case 5:{
                System.out.println("confirmación: ¿Está seguro que desea salir del programa (S/N)?");
                if (!"S".equalsIgnoreCase(input.next())) opcion = 0;
                break;
            }
        }
        }while(opcion != 5); 
        
       
        input.close();
    }
    
}
