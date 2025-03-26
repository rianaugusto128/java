/******************************************************************************

. Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.

*******************************************************************************/

import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
	 int n1, n2, n3;
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Entre com o primeiro número:");
	 n1 = ler.nextInt();
	 System.out.println("Entre com o segundo número:");
	 n2 = ler.nextInt();
	 System.out.println("Entre com o terceiro número:");
	 n3 = ler.nextInt();
	 
	 if( n1 > n2)
	   System.out.println(n1 + " é o maior");
	   
	 else if (n2 > n3)
	    System.out.println(n2 + " é o maior");
	    
	 else if (n3 > n2)
	    System.out.println(n3 + " é o maior");
	 
	 else if (n2 > n1)
	    System.out.println(n3 + " é o maior");
	  
	 else if (n3 > n1)
	    System.out.println(n3 + " é o maior");
	    
	 else
	   System.out.println("Numero invalido");
	  
	  
	  
	    
	    
	 
	}
}