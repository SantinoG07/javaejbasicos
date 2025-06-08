import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); // Lee datos del usuario
        int numing; // Numero ingresado
        int pares=0, impares=0; // Acumuladores para pares e impares
        System.out.println("Ingrese un numero entero positivo");
        numing=scanner.nextInt(); // Lee numero ingresado

        for(int i=0; i<numing; i+=2){ // Suma numeros pares desde 0 hasta numing-1
            pares+=i;
        }
        for(int i=1; i<numing; i+=2){ // Suma numeros impares desde 1 hasta numing-1
            impares+=i;
        }
        System.out.println("La sumatoria de los numeros pares es: "+pares); // Muestra suma pares
        System.out.println("La sumatoria de los numeros impares es: "+impares); // Muestra suma impares
    }
}
