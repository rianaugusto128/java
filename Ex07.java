/******************************************************************************
 Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante..

*******************************************************************************/
import java.util.Scanner;
public class Ex07
{
	public static void main(String[] args) {
	    double emprestimo, parcelas, salario, pagar, vparcelas;
	  Scanner ler = new Scanner (System.in);
	  
		System.out.println("Qual o seu salário?");
		salario = ler.nextDouble();
		System.out.println("Qual o valor do emprestimo?");
		emprestimo = ler.nextDouble();
		System.out.println("Quantas parcelas deseja pagar?");
		parcelas = ler.nextDouble();
		
		vparcelas = emprestimo / parcelas;
		pagar = salario * 0.30;
		
		
		if (pagar >= vparcelas){
		    System.out.println("Emprestimo aprovado");
		} else {
		    System.out.println("Emprestimo reprovado");
		}
		    
		     
		
		
		
		    
		
		
		
		
	}
}