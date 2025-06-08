import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String cadenaor=""; // Cadena ingresada
        int contvocales=0, contconsonantes=0; // Contadores de vocales y consonantes
        Scanner scanner=new Scanner(System.in); // Lee datos del usuario
        System.out.println("Ingrese cadena de caracteres");
        cadenaor=scanner.nextLine(); // Lee linea completa
        cadenaor=cadenaor.toLowerCase(); // Pasa todo a minusculas
        for(int i=0; i<cadenaor.length(); i++) { // Recorre la cadena
            if(cadenaor.charAt(i)=='a'||cadenaor.charAt(i)=='e'||cadenaor.charAt(i)=='i'||cadenaor.charAt(i)=='o'||cadenaor.charAt(i)=='u') { // Si es vocal
                contvocales++; // Suma vocales
            } else if (cadenaor.charAt(i)==' ') { // Si es espacio, saltea
                continue;
            } else{
                contconsonantes++; // Cuenta consonantes
            }
        }
        System.out.println("La cantidad de vocales es:"+contvocales); // Muestra vocales
        System.out.println("La cantidad de consonantes es:"+contconsonantes); // Muestra consonantes
    }
}
