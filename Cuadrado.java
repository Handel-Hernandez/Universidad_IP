import java.util.Scanner;
public class Cuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Inserte el tamaño que va a tener el cuadrado: ");
        int x = scan.nextInt();

        for(int a = 1;a <= x ;a++){

            for(int b =1;b<=x;b++){
                if(a==1 || a==x || b==1 || b==x){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
                System.out.println();
        }    
    }
} 