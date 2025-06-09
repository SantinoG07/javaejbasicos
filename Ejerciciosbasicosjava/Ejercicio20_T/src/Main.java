import java.util.Objects;
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

        String caracteres = minusculas + mayusculas + numeros;

        for (int i = 0; i < longitud; i++) {
            int indice= (int) (Math.random()*caracteres.length());
            contrasena+=caracteres.charAt(indice);
        }
        System.out.println("Su contraseña es: "+contrasena);

    }
}
