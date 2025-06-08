import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numesp; // Numero de lineas para imprimir
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario

        System.out.println("Ingrese la cantidad de lineas: ");
        numesp =scanner.nextInt(); // Lee cantidad de lineas

        for (int i = 0; i < numesp+1; i++) { // Ciclo para cada linea
            for (int j = 0; j < i; j++) { // Imprime asteriscos segun linea
                System.out.print("*");
            }
            System.out.println(" "); // Salto de linea
        }
    }
}
