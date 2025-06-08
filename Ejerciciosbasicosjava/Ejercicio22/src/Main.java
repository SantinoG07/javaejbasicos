import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double calificaciones[]; // Array para almacenar calificaciones
        double prom=0, numero=0; // Variables para promedio y auxiliar
        calificaciones = new double[10]; // Reserva espacio para 10 elementos
        Scanner scanner = new Scanner(System.in); // Scanner para entrada

        for (int i = 0; i < 5; i++) { // Pide 5 calificaciones
            System.out.println("Ingrese calificacion "+(i+1));
            calificaciones[i]=scanner.nextInt(); // Guarda cada calificacion
        }

        for (double num:calificaciones){ // Suma las calificaciones
            prom+=num;
        }
        prom=prom/5; // Calcula el promedio de las 5 ingresadas
        System.out.println("El promedio es:  "+prom); // Muestra el promedio
    }
}
