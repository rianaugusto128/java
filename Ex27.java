/******************************************************************************

  27. Faça um programa, utilizando while, que permita o usuário escrever o nome de cinco pessoas e os mostre na tela.

*******************************************************************************/
import java.util.Scanner;
public class Ex27 {
    
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        String nome[] = new String[5]; // utiliza para guardar as informçaões(nomes)
        int i = 0;
        
        while(i < 5){
            System.out.println("Digite o nome da pessoa"+ (i + 1) + " :");
            nome[i] = ler.nextLine();
            i++;
        }
        
        System.out.println("Nomes digitados: ");
        
        i = 0;
        while(i < 5 ){
            System.out.println(nome[i]);
            i++;
        }
        
    }
}