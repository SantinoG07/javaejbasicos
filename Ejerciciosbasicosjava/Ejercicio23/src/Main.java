import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String ciudades[]; // Array para almacenar las ciudades
        boolean salida=false; // Bandera para indicar si se encontro la ciudad
        ciudades = new String[5];
        Scanner scanner = new Scanner(System.in);

        ciudades[0]="Buenos Aies"; // Carga de ciudades
        ciudades[1]="Melbourne";
        ciudades[2]="Canberra";
        ciudades[3]="Rio de janeiro";
        ciudades[4]="Cincinnati";

        System.out.println("Ingrese ciudad a buscar");
        String busqueda= scanner.next(); // Ciudad a buscar

        for (String ciudad: ciudades){ // Busca en el array
            if(ciudad.equals(busqueda)){ // Compara la ciudad
                System.out.printf("La ciudad ha sido encontrada");
                salida=true;
                break;
            }
        }
        if(salida==false){ // Si no se encontro
            System.out.println("No se ha encontrrado la ciudad");
        }
    }
}
