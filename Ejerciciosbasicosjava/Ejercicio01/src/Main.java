public class Main {
    public static void main(String[] args) {
        for(int i=1; i<101; i++){ // Recorre del 1 al 100
            if(i%2==0){ // Si el numero es par
                System.out.println(i+", par");
            }else if(i%2==1){ // Si el numero es impar
                System.out.println(i+", impar");
            }
        }
    }
}
