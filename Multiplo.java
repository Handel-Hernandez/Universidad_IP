import java.util.Scanner;
public class Multiplo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int numero
        
        System.out.println("Escriba un número");
        numero = scan.nextInt();

        int mult = numero;
        
        while (mult % 2 != 0) {
            mult += numero;
            
        }
        System.out.println("El múltiplo mas pequeño de "+numero+" que es múltiplo de 2 es "+mult);
    }
}
