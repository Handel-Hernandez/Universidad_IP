import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a;
        float b;
        float c;
        System.out.println("Lado a: ");

        a =entrada.nextFloat();
        System.out.println("Lado b: ");
        b =entrada.nextFloat();
        System.out.println("Lado c: ");
        c =entrada.nextFloat();

        if(a+b>c && b+c>a && a+c>b ){

            double area = Math.sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c));
            area /=4;
            System.out.println("Area del triangulo: "+area);
            

        }else{
            System.out.println("No se puede definir un triangulo");
        }


       

    }
    

    
    
}
