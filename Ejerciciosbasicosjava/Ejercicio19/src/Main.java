import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String frase; // Entrada usuario para continuar o salir
        int suma, dado1, dado2; // Dados y suma de dados
        boolean flag=true; // Control del ciclo
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario

        do{
            System.out.println("Presione 's' para lanzar dados, 'n' para salir : ");
            frase=scanner.next(); // Lee opcion del usuario

            if (Objects.equals(frase, "s")) { // Si es 's' lanza dados
                dado1=(int)(Math.random()*6)+1; // Dado 1 aleatorio 1-6
                dado2=(int)(Math.random()*6)+1; // Dado 2 aleatorio 1-6
                suma=dado1+dado2; // Suma de dados
                System.out.println("Dado 1: "+dado1);
                System.out.println("Dado 2: "+dado2);
                System.out.println("La suma de ambos: "+suma);
            }else{ // Si no es 's', sale
                System.out.println("Saliendo del programa...");
                flag=false; // Termina ciclo
            }
        }while (flag); // Repite mientras flag sea true
    }
}
