import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0; // Variable para la opcion del menu
        int a, b, c; // Variables para operar
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario

        do {
            // Mostrar menu
            System.out.println("Bienvenido a la calculadora de Santino Gennuso");
            System.out.println("Seleccione una de las siguientes operaciones: ");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Division");
            System.out.println("5) Salir");
            op = scanner.nextInt(); // Leer opcion

            switch (op) {
                case 1: // Suma
                    System.out.println("Ingrese el primer elemento");
                    a = scanner.nextInt(); // Leer primer numero
                    System.out.println("Ingrese el segundo elemento");
                    b = scanner.nextInt(); // Leer segundo numero
                    c = a + b; // Calcular suma
                    System.out.println("El resultado es: " + c); // Mostrar resultado
                    break;
                case 2: // Resta
                    System.out.println("Ingrese el primer elemento");
                    a = scanner.nextInt(); // Leer primer numero
                    System.out.println("Ingrese el segundo elemento");
                    b = scanner.nextInt(); // Leer segundo numero
                    c = a - b; // Calcular resta
                    System.out.println("El resultado es: " + c); // Mostrar resultado
                    break;
                case 3: // Multiplicacion
                    System.out.println("Ingrese el primer elemento");
                    a = scanner.nextInt(); // Leer primer numero
                    System.out.println("Ingrese el segundo elemento");
                    b = scanner.nextInt(); // Leer segundo numero
                    c = a * b; // Calcular multiplicacion
                    System.out.println("El resultado es: " + c); // Mostrar resultado
                    break;
                case 4: // Division
                    System.out.println("Ingrese el numerador");
                    a = scanner.nextInt(); // Leer numerador
                    System.out.println("Ingrese el denominador");
                    b = scanner.nextInt(); // Leer denominador
                    c = a / b; // Calcular division
                    System.out.println("El resultado es: " + c); // Mostrar resultado
                    break;
                case 5: // Salir
                    System.out.println("Saliendo del programa"); // Mensaje de salida
                    break;
            }
        } while (op != 5); // Repetir hasta que la opcion sea 5
    }
}
