/******************************************************************************

Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.

*******************************************************************************/

import java.util.Scanner;
public class Ex06a{

    public static void main (String [] args){
        double n1, resultado;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("escolha um número: ");
        n1 = ler.nextDouble();
        
        resultado = n1 % 2;
 
     
        if(resultado == 1)
          System.out.println("impar");
          
        else 
          System.out.println("par");
    }
}
	 
	   
	  
	   
	   