/******************************************************************************

  29. Escreva um programa que pergunte ao usuário quantos alunos ele
tem em sua academia. Em seguida, através de um laço while, o usuário
digita o peso de todos os alunos, um por vez, e por fim, o programa deve
mostrar a média de peso dos clientes.

*******************************************************************************/
import java.util.Scanner;
public class Ex29 {
    
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        int quant;
        double peso, media, soma = 0;
        
        System.out.println("Digite a quantidade de alunos: ");
        quant = ler.nextInt();
        
        
        while(numero < quant){
            
            System.out.println("Entre com o Peso de cada aluno: ");
            peso = ler.nextDouble();
            
            soma += peso;
            
            numero++;
        }
        
        if(quant > 0 ){
            
            media = soma / quant;
            
            System.out.println("A média dos pesos é de: "+ media);
        }
        else{
            System.out.println("Nenhum aluno cadastrado!");
        }
   }
}