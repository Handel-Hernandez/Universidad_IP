import java.util.Scanner;
class Definir_IMC{
  public static void main(String[] args){
    float peso, talla, imc;
    System.out.print("Introduce tu peso: ");
    Scanner input = new Scanner(System.in);
    peso = input.nextFloat();
    System.out.print("Introduce tu talla en metros: ");
    talla = input.nextFloat();
    imc = peso/(float)Math.pow(2, talla);
    if (imc <= 18.5){
      System.out.println("Estas muy delgado");
    } else if (imc > 18.5 && imc <= 24.9){
        System.out.println("Estas delgado");
    } else if (imc > 25 && imc <=29.9){
        System.out.println("Estas sobrepeso");
    } else {
        System.out.println("Estas obeso");
    }
  }
}
