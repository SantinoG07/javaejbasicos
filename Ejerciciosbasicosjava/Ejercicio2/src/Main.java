public class Main {
    public static void main(String[] args) {
        boolean esprimo=true; // Variable para verificar si es primo
        for(int i=50; i<101; i++){ // Recorre numeros del 50 al 100
            String divisores=""; // Acumula divisores del número
            esprimo=true; // Asume que es primo al iniciar
            for(int j=2; j<i; j++){ // Recorre posibles divisores
                if (i%j==0) { // Si j divide a i, no es primo
                    divisores+= j+" "; // Agrega divisor a la lista
                    esprimo=false; // Marca que no es primo
                }
            }
            if (esprimo==true) { // Si sigue siendo primo
                System.out.println(i+" es primo");
            }else{ // Si tiene divisores
                System.out.println(i+" "+divisores);
            }
        }
    }
}
