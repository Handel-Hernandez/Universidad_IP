import java.util.Scanner;
public class VerificarNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Inserte un número");
        String numero = scan.nextLine();

        boolean contador= false;

        for(int i = 0;i< numero.length();i++){
            char a = numero.charAt(i);
            if(a == '1' || a=='3' || a=='5'){
                contador = true; 
                break; 
            }           
        }
        if(contador == true){
            System.out.println("Se cumple la condicion");
        }else{
            System.out.println("No se cumple la condicion");
        }



    }
} 