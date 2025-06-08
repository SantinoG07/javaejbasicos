import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); // Para leer datos del usuario
        boolean salida=false, esprimo=true; // Control de salida y primo

        do {
            int numing=0; // Numero ingresado
            esprimo=true; // Asume que es primo
            System.out.println("Ingrese un numero mayor a 100 y que ademas sea primo, para finalizar el programa");
            numing=scanner.nextInt(); // Lee numero ingresado
            for(int i=2; i<numing;i++){ // Verifica si es primo
                if(numing%i==0) {
                    esprimo=false; // No es primo
                    break; // Sale del ciclo
                }
            }
            if(esprimo && numing>100){ // Si es primo y mayor a 100
                salida=true; // Finaliza el ciclo
            }
        }while(!salida);
    }
}
