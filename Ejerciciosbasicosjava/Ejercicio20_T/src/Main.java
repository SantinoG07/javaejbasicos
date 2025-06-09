import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String frase, contrasena="";
        int longitud;
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de la contraseña: ");
        longitud = scanner.nextInt();

        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";

        String caracteres = minusculas + mayusculas + numeros; // Une todos los caracteres posibles

        for (int i = 0; i < longitud; i++) {
            int indice= (int) (Math.random()*caracteres.length()); // Genera un indice aleatorio
            contrasena += caracteres.charAt(indice); // Agrega el caracter aleatorio a la contraseña
        }
        System.out.println("Su contraseña es: " + contrasena); // Muestra la contraseña generada


    }
}
