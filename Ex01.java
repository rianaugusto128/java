/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Ex01 {
    public static void main (String [] args) {
        double media, nota, nota2;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Entre com a primeira nota: ");
        nota = ler.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        nota2 = ler.nextDouble();
        
        media = (nota + nota2) / 2; 
        
        if(media >= 7)
         System.out.println("Aluno aprovado com uma média de: "+ media);
        
        else if(media <= 6)
         System.out.println("Aluno reprovado com uma méida de: "+ media);
         
        else
          System.out.println("Media indiposnivel");
         
        
    }
}