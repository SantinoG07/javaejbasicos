import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero=0, numero0=0, numero1=1, numero2=0; // Variables para Fibonacci
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario

        System.out.println("Ingrese un numero N");
        numero = scanner.nextInt(); // Lee cantidad de terminos

        System.out.println("Secuencia de Fibonacci");
        for (int i=0; i<numero; i++){ // Repite N veces
            System.out.print(numero0 + " "); // Imprime termino actual
            numero2 = numero0 + numero1; // Calcula siguiente termino
            numero0 = numero1; // Actualiza numero0
            numero1 = numero2; // Actualiza numero1
        }
    }
}
