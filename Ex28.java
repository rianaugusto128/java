/******************************************************************************

  28. Faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser.

*******************************************************************************/
import java.util.Scanner;
public class Ex28 {
    
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        int quant;
        double n1, n2, soma;
        
        System.out.println("Quantas vezes deseja fazer uma soma: ");
        quant = ler.nextInt();
        
        while (numero < quant){
            System.out.println("Digite o primeiro número: ");
            n1 = ler.nextDouble();
            System.out.println("Digite o segundo número: ");
            n2 = ler.nextDouble();
            
            soma = n1 + n2;
            
            System.out.println("Total da soma: "+ soma);
            
            numero++;
        }
    }
}