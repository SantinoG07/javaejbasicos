import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op, saldo=10000, retira, ingresa;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al cajero de Santino Gennuso");
        do {
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1) Ingresar dinero");
            System.out.println("2) Retirar dinero");
            System.out.println("3) Consultar dinero");
            System.out.println("4) Salir");
            op = scanner.nextInt();

            switch (op){
                case 1:
                    System.out.println("Escriba el monto de dinero a ingresar");
                    ingresa= scanner.nextInt();
                    saldo=saldo+ingresa;
                    System.out.println("Operacion realizada con exito!");
                    break;
                case 2:
                    System.out.println("Escriba el monto de dinero a retirar");
                    retira= scanner.nextInt();
                    if(retira>saldo){
                        System.out.println("Fondos insuficientes");
                    }else{
                        saldo=saldo-retira;
                        System.out.println("Operacion realizada con exito!");
                    }
                    break;
                case 3:
                    System.out.println("El dinero de la cuenta es: "+saldo);
                    break;
                case 4:
                    System.out.println("Saliendo del programa... ");
                    break;
            }


        }while(op!=4);
        
    }
}
