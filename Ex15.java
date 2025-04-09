import java.util.Scanner;
public class Ex15{
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        int n, resultado;
        
        System.out.print("Entre com um número: ");
        n = ler.nextInt();
        
        for (int i = 1; i <= 15; i++){
            resultado = i + n;

           System.out.println(n +" + " + i + " = " + resultado); 
        }
    }
}