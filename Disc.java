import java.util.Scanner;
public class Disc{
  public static void main(String[] args){
    //if disc > 0, tiene 2 soluciones; disc == 0 tiene una solucion; disc menor a 0 no tiene solucion
    double a, b, c, disc;
    Scanner input = new Scanner(System.in);
    System.out.print("Inroduce el valor de a: ");
    a = input.nextDouble();
    System.out.print("Inroduce el valor de b: ");
    b = input.nextDouble();
    System.out.print("Inroduce el valor de c: ");
    c = input.nextDouble();
    disc = Math.pow(b, 2)-4*a*c;
    if (disc > 0){
      System.out.println("Tiene mas de una solucion en el conjunto de numeros reales");
    }else if (disc == 0){
      System.out.println("Tiene una solucion en el conjunto de numeros reales");
    }else {
      System.out.println("No tiene solucion en el conjunto de los numeros reales");
    }
  }
}
