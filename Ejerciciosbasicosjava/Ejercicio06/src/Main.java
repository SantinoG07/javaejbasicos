import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String cadenaor=""; // Cadena original
        Scanner scanner=new Scanner(System.in); // Lee datos del usuario
        System.out.println("Ingrese cadena de caracteres");
        cadenaor=scanner.next(); // Lee cadena
        for(int i=cadenaor.length()-1; i>=0; i--) { // Recorre cadena de atras hacia adelante
            System.out.print(cadenaor.charAt(i)); // Imprime caracter actual
        }
    }
}
