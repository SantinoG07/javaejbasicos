import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int numero = 0, numero0=1; // Numero ingresado y resultado factorial
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario
        boolean flag=true; // Controla ciclo de validacion
        do{
            System.out.println("Ingrese un numero entero positivo, para obtener su factorial:");
            numero = scanner.nextInt(); // Lee numero
            if (numero <= 0) {
                System.out.println("Numero no valido"); // Valida que sea positivo
            }else{
                flag=false; // Sale del ciclo si es valido
            }
        }while(flag==true);
        for(int i=1; i<=numero; i++){ // Calcula factorial
            numero0*=i;
        }
        System.out.println("El numero factorial es: "+numero0); // Muestra resultado
    }
}
