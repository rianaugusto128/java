/******************************************************************************
Construa um algoritmo que determine
quanto será gasto para encher o tanque de um carro (VG), sabendo-se que o preço
da gasolina é de R$ 1,80 e o preço do álcool é de R$ 1,00. O usuário fornecerá
os seguintes dados: Tipo de carro (TC) (G – gasolina ou A – álcool) e
Capacidade do tanque (CT), em litros

*******************************************************************************/

import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
	String cb;
	double total, ct;
	   Scanner ler = new Scanner(System.in);
	   
	 
	   System.out.println("Qual o tipo de combustivel? ");
	   System.out.println("G) Gasolina");
	   System.out.println("A) Alcool");
	   cb = ler.nextLine();
	   
	   switch(cb){
	       case "g":
	           System.out.println("Gasolina selecionada!");
	           System.out.println("Custando R$ 1,98 per Litro");
	           System.out.println("Qual a capacidade do tanque?");
	           ct = ler.nextDouble();
	 
	           total = ct * 1.98;
	           
	           System.out.println("Caso queira encher o tanque ficará R$"+ total);
	                   break;
	       
	       case "G":
	           System.out.println("Gasolina selecionada!");
	           System.out.println("Custando R$ 1,98 per Litro");
	           System.out.println("Qual a capacidade do tanque?");
	           ct = ler.nextDouble();
	 
	           total = ct * 1.98;
	           
	           System.out.println("Caso queira encher o tanque ficará R$"+ total);
	                   break;
	                   
	       case "a":
	           System.out.println("Alcool selecionado!");
	           System.out.println("Custando R$ 1,00 per Litro");
	           System.out.println("Qual a capacidade do tanque?");
	           ct = ler.nextDouble();
	 
	           total = ct * 1.98;
	           
	           System.out.println("Caso queira encher o tanque ficará R$"+ total);
	                   break;
	       case "A":
	           System.out.println("Alcool selecionado!");
	           System.out.println("Custando R$ 1,00 per Litro");
	           System.out.println("Qual a capacidade do tanque?");
	           ct = ler.nextDouble();
	 
	           total = ct * 1.98;
	           
	           System.out.println("Caso queira encher o tanque ficará R$"+ total);
	                   break;            
	           
	   }
	}
}