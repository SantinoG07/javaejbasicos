import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String frase; // Frase ingresada por usuario
        int numpal=1; // Cuenta palabras (empieza en 1)
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario

        System.out.println("Ingrese frase: ");
        frase=scanner.nextLine(); // Lee frase completa

        for (char letra:frase.toCharArray()) { // Recorre cada caracter
            if(letra==' '){ // Si encuentra espacio
                numpal++; // Incrementa contador de palabras
            }
        }

        System.out.println("La cantidad de palabras es: "+numpal); // Muestra resultado
    }
}
