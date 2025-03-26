/******************************************************************************

  Construa um algoritmo que, tendo como
dados de entrada a altura (H) e o sexo (S) de uma pessoa calcule e apresente
seu peso ideal utilizando as seguintes fórmulas: Para homens: Peso ideal (P) =
(72,7 * H) – 58 Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7

*******************************************************************************/

import java.util.Scanner;
public class Ex08 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        int hm;
        double peso1, peso2, altura;
        
        System.out.println("Qual o seu gênero: ");
        System.out.println("1)Masculino ");
        System.out.println("2)Feminino ");
        hm = ler.nextInt();
        
        switch(hm) {
            case 1:
               
               System.out.println("qual a sua altura? ");
               altura = ler.nextDouble();
               
               //processamento
               peso1 = (72.7 * altura) - 58;
               
               System.out.println("Seu peso ideal será: " + peso1);
               
               break;
            
            case 2: 
                
                System.out.println("qual a sua altura? ");
               altura = ler.nextDouble();
               
               //processamento
               peso2 = (62.1 * altura) - 44.7;
               
               System.out.println("Seu peso ideal será: " + peso2);
               
                break;
                
            default:
            
                System.out.println("Gênero não encontrado!");
        }
    }
}