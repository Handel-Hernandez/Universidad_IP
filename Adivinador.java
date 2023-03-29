import java.util.Scanner;
public class Adivinador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Elige un número del 1 al 100.");

        int menor = 1;
        int mayor = 100;
        int cantIntentos = 0;

        while(cantIntentos <8){
            int mitad =(menor + mayor)/2;
            cantIntentos++;
            System.out.println("¿"+mitad+" es el número que pensaste ?, (s/n)");
            char respuesta = scan.next().charAt(0);
            if (respuesta == 's') {
                System.out.println("Adivine el #");
                return;

                
            } else if(menor==mayor){
                System.out.println("No pude adivinar tu número");
                return;
                
                
            }else if (respuesta == 'n' && cantIntentos == 7) {
                System.out.println("No pude adivinar tu número");
                return;

            }else if(respuesta== 'n' ){
                System.out.println("¿El número pensado es mayor que  "+mitad+" ? (s/n)");
                     respuesta = scan.next().charAt(0);
                     if (respuesta == 's'){
                        menor = mitad+1;
                     }else{
                        mayor= mitad-1;
                     }


            } else{
                System.out.println("Ingrese una respuesta válida (s/n)");
                cantIntentos--;
            }
        }

    }
} 