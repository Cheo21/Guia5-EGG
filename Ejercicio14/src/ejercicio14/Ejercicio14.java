
package ejercicio14;
import java.util.Scanner;

public class Ejercicio14 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el monto a convertir: ");
        double monto = input.nextDouble();
        
        System.out.println("Ingrese que divisa es: ");
        String divisa = input.next();
        
        if (cambiar(monto, divisa) != 0){
        System.out.println("Se cambio " + monto +" "+ divisa + " a ->"+ cambiar(monto, divisa) + " EURO");}
        
        input.close();
        
    }
    
    public static double cambiar(double monto, String divisa){
    switch(divisa.toLowerCase()){
        case "dolar": return monto/1.28611;
        case "libra": return monto / 0.86;
        case "yenes": return monto * 129.852; 
        default: {System.out.println("divisa incorrecta"); return 0;}
    }    
    };
    
}
