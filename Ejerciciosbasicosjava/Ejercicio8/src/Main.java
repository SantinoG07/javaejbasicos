import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int intentos, numero, ingreso; // Variables de control y entrada
        boolean flag=true; // Controla ciclo de adivinanza
        Scanner scanner=new Scanner(System.in); // Lee datos del usuario
        int aleatorio= (int)(Math.random()*100)+1; // Genera numero aleatorio entre 1 y 100
        intentos=0; // Inicializa contador de intentos
        System.out.println("Ingrese un numero del 1 al 100(inclusive)");
        do {
            ingreso= scanner.nextInt(); // Lee numero ingresado
            if(ingreso==aleatorio){ // Si acierta
                flag=false; // Sale del ciclo
                System.out.println("El numero es el correcto");
            } else if (ingreso<aleatorio) { // Si ingreso es menor
                System.out.println("El numero ingresado es menor");
            } else if (ingreso>aleatorio) { // Si ingreso es mayor
                System.out.println("El numero ingresado es mayor");
            }
            intentos++; // Incrementa intentos
        }while(flag==true);
        System.out.println("El numero de intentos fue:"+intentos); // Muestra intentos totales
    }
}
