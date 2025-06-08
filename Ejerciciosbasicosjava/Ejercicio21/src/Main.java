import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numeros[]; // Array para 10 numeros
        int mayores=0, numero=0; // Contador y numero para comparar
        numeros = new int[10];
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese elemento "+(i+1));
            numeros[i]=scanner.nextInt(); // Lee cada numero
        }
        System.out.println("Ingrese el numero a comparar");
        numero=scanner.nextInt(); // Lee numero para comparar

        for (int num:numeros){ // Recorre array
            if(num>numero){ // Si numero es mayor que el dado
                mayores++; // Incrementa contador
            }
        }
        System.out.println("Hay "+mayores+" numeros mayores"); // Muestra resultado
    }
}
