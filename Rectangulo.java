import java.util.Scanner;
public class Rectangulo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserte x");
       int x = scan.nextInt();
        System.out.println("Inserte y");
       int y = scan.nextInt();

        for(int a = 1;a <= x ;a++){

            for(int b =1;b<=y;b++){

                if(a==1 || a==x || b==1 || b==y){
                    System.out.print("*");

                    
                }else{
                    System.out.print(" ");
                }

            }
                System.out.println();
        }      

        
    }
    
}
