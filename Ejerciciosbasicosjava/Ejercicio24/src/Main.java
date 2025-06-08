//Con un bucle for-each, recorrer un array e imprimir todos sus elementos
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String ciudades[]; // Array de ciudades
        ciudades = new String[5];

        ciudades[0]="Buenos Aies"; // Asignacion de ciudades
        ciudades[1]="Melbourne";
        ciudades[2]="Canberra";
        ciudades[3]="Rio de janeiro";
        ciudades[4]="Cincinnati";

        for (String ciudad: ciudades){ // Recorrido y muestra de ciudades
            System.out.println(ciudad);
        }
    }
}
