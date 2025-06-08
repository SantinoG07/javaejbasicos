import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float hip, cat0, cat1; // Lados del triangulo
        Scanner scanner = new Scanner(System.in); // Lee datos del usuario

        System.out.println("Ingrese el tamaño del lado 1");
        hip = scanner.nextInt(); // Lee primer lado
        System.out.println("Ingrese el tamaño del lado 2");
        cat0 = scanner.nextInt(); // Lee segundo lado
        System.out.println("Ingrese el tamaño del lado 3");
        cat1 = scanner.nextInt(); // Lee tercer lado

        if(cat1==cat0&&cat0==hip){ // Todos lados iguales
            System.out.println("El triangulo es equilatero");
        } else if (cat1!=cat0&&cat0!=hip&&cat1!=hip) { // Todos lados diferentes
            System.out.println("El triangulo es escaleno");
        } else { // Resto de casos
            System.out.println("El triangulo es escaleno"); // ERROR: Deberia ser isosceles
        }
    }
}
