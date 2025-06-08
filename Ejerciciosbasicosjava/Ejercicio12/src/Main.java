import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero = 0, suma=0; // Numero ingresado y suma de digitos
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario

        System.out.println("Ingrese un numero entero positivo, de 3 digitos para obtener su suma:");
        numero = scanner.nextInt(); // Lee numero

        while (numero > 0) { // Repite mientras queden digitos
            int digito = numero % 10; // Saca ultimo digito
            suma += digito;           // Suma digito
            numero = numero / 10;     // Saca ultimo digito
        }

        System.out.println("La suma de los digitos es: "+suma); // Muestra resultado
    }
}
