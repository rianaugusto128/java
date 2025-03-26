/******************************************************************************

Tendo como entrada o total vendido por um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua comissão e seu salário bruto
neste mês, sabendo que o seu salário base é R$1.200,00 e sua comissão é de 10% sobre o total vendido. 
O funcionário só ganhará comissão se o valor total vendido for maior que R$2.000,00.

*******************************************************************************/

import java.util.Scanner;
public class Ex07{
    public static void main (String [] args){
        double vtotal, salario, comissao, totalprodutos, vproduto;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantos produtos foram vendidos?");
        totalprodutos = ler.nextDouble();
        System.out.println("Quantos reais cada produto foi vendido? ");
        vproduto = ler.nextDouble();
        System.out.println("Qual o seu salário?");
        salario = ler.nextDouble();
        
        vtotal = totalprodutos * vproduto ;
        comissao = (salario * 10) / 100;
     
        if(vtotal >= 2000)
          System.out.println("Você recebeu cerca de " + comissao + " na venda de " + vtotal +"R$ de produtos"  );
          
        else 
          System.out.println("Você fez a venda de "+ vtotal + "R$ de produtos");
    }
}
	 
	   
	  
	   
	   