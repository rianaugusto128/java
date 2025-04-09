/******************************************************************************

Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N é o limite inserido pelo usuário.

*******************************************************************************/
import java.util.Scanner;
public class Ex26{
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        int numero = 0; 
        int N;
        
        System.out.println("Escreva um limite: ");
         N = ler.nextInt();
         
        while (numero <= N ){
            System.out.println(numero);
            numero++;
        }
        
    }
}