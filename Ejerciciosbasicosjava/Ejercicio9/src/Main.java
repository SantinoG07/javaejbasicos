import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[3]; // Array para 3 numeros
        Scanner scanner=new Scanner(System.in); // Lee datos del usuario
        System.out.println("Ingrese 3 numeros enteros:");
        for (int i=0; i<numeros.length; i++){ // Pide 3 numeros
            System.out.println("Ingrese el numero "+i);
            numeros[i]= scanner.nextInt(); // Guarda numero en array
        }
        Arrays.sort(numeros); // Ordena el array
        System.out.println("El numero mayor es: "+numeros[numeros.length-1]); // Muestra el mayor
    }
}
