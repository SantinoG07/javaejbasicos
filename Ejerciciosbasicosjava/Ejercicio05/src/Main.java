import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numing; // Numero ingresado
        Scanner scanner=new Scanner(System.in); // Lee datos del usuario
        System.out.println("Ingrese un numero entero positivo");
        numing=scanner.nextInt(); // Lee numero

        for(int i=1; i<11; i++){ // Recorre del 1 al 10
            System.out.println(numing+"*"+i+"="+numing*i); // Muestra tabla de multiplicar
        }
    }
}
