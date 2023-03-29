import java.util.Scanner;
public class ClasificarTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Introduzca los lados del triángulo: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        

        if(a+b>c && b+c>a && a+c>b ){
            if(a==b && b==c){
                System.out.println("equilátero");

            }else if(a!=b && b!=c){
                System.out.println("escaleno");

            }else{
                System.out.println("isósceles");
            }

        }else{
            System.out.println("No es posible conformar un triángulo");
        }
    }
}        