import java.util.Scanner;
class TiendaFlores{
    public static void main(String[] args) {
        float dinero;
        Scanner entrada = new Scanner(System.in);       
        System.out.println("Menu:\nRamo 1: flores de tipo A y tipo B -> $70");
        System.out.println("Ramo 2: flores de tipo C y tipo D -> $120");
        System.out.print("Cuanto dinero tiene? ");
        dinero = entrada.nextFloat();
        if (dinero < 70){
            System.out.println("No le alcanza el dinero");
        } else if (dinero >= 70 && dinero < 120){
            System.out.println("Puedes comprar: 1 arreglo de tipo 1 y sobran "+(dinero%70)+"pesos");
        } else {
            System.out.println("Puedes comprar:\n"+(int)(dinero/70)+" ramo de tipo 1 y sobran "+(dinero%70)+" pesos");
            System.out.println((int)(dinero/120)+" ramo de tipo 2 y sobran "+(dinero%120)+" pesos");
        }
    }
}