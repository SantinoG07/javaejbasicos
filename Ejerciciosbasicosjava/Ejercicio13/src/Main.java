import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float Cel=0, Fahr=0; // Variables para temperaturas
        int numero=0; // Opcion elegida por usuario
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario

        System.out.println("Convertir Celsius a Fahrenheit(1)");
        System.out.println("Convertir Fahrenheit a Celsius(2)");
        numero = scanner.nextInt(); // Lee opcion

        if(numero==1){
            System.out.println("Ingrese la temperatura en Celsius");
            Cel= scanner.nextFloat(); // Lee temperatura Celsius
            Fahr=(Cel*9)/5; // Convierte a Fahrenheit parte 1
            Fahr= Fahr+32;  // Convierte a Fahrenheit parte 2
            System.out.println("La temperatura en grado Fahrenheit es: "+Fahr); // Muestra resultado
        }
        if(numero==2){
            System.out.println("Ingrese la temperatura en Fahrenheit");
            Fahr= scanner.nextFloat(); // Lee temperatura Fahrenheit
            Cel = (Fahr - 32) * 5 / 9; // Convierte a Celsius
            System.out.println("La temperatura en grado Celsius es: "+Cel); // Muestra resultado
        }
    }
}
