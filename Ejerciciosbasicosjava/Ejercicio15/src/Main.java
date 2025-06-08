import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op, saldo = 10000, retira, ingresa; // Variables de opcion, saldo, retiro e ingreso
        Scanner scanner = new Scanner(System.in); // Objeto para leer entradas por teclado

        System.out.println("Bienvenido al cajero de Santino Gennuso");

        do {
            // Mostrar menu
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1) Ingresar dinero");
            System.out.println("2) Retirar dinero");
            System.out.println("3) Consultar dinero");
            System.out.println("4) Salir");
            op = scanner.nextInt(); // Leer opcion

            switch (op) {
                case 1: // Ingreso de dinero
                    System.out.println("Escriba el monto de dinero a ingresar");
                    ingresa = scanner.nextInt(); // Leer monto a ingresar
                    saldo = saldo + ingresa; // Sumar al saldo
                    System.out.println("Operacion realizada con exito!"); // Confirmacion
                    break;
                case 2: // Retiro de dinero
                    System.out.println("Escriba el monto de dinero a retirar");
                    retira = scanner.nextInt(); // Leer monto a retirar
                    if (retira > saldo) { // Verificar fondos
                        System.out.println("Fondos insuficientes"); // Aviso de error
                    } else {
                        saldo = saldo - retira; // Restar del saldo
                        System.out.println("Operacion realizada con exito!"); // Confirmacion
                    }
                    break;
                case 3: // Consulta de saldo
                    System.out.println("El dinero de la cuenta es: " + saldo); // Mostrar saldo
                    break;
                case 4: // Salida
                    System.out.println("Saliendo del programa... "); // Mensaje de salida
                    break;
            }

        } while (op != 4); // Repetir hasta que elija salir
    }
}
