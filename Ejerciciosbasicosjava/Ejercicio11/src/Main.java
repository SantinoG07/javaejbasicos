import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int numero = 0, numero0=1; // Año ingresado (numero0 no se usa)
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario
        boolean flag=true; // Variable no utilizada
        System.out.println("Ingrese el año para saber si es biciesto");
        numero=scanner.nextInt(); // Lee año
        if(numero%4==0 && numero%100!=0 || numero%400==0){ // Condicion para año biciesto
            System.out.println("El año es biciesto");
        }else{
            System.out.println("El año no es biciesto");
        }
    }
}
