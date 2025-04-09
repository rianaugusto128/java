import java.util.Scanner;
public class Ex16{
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        String nome;
        
        System.out.print("Coloque seu nome: ");
        nome = ler.nextLine();
        
        for (int i = 1; i <= 10; i++){
           System.out.println("Seu nome é "+nome); 
        }
    }
}