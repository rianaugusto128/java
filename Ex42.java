/******************************************************************************

Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.

*******************************************************************************/
import java.util.Scanner;
public class ex42
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
		
		System.out.println("Tipos de camisetas: \n 1) tamanho pequeno \n 2) Tamanho médio \n 3) Tamanho grande \n Por favor selecione o tipo de camiseta:");
		int tipoCamisetas = ler.nextInt();
		
		switch (tipoCamisetas){
		    case 1:
		
		     System.out.println("Tamanho pequeno selecionado, por favor, insira a quantidade de camisetas que deseja: ");
		    
		     int qntdPequena = ler.nextInt();
		     
		     double valorP = qntdPequena * 10;
		     
		     System.out.println("Quantidade de camisetas: "+ qntdPequena +"Valor total: "+ valorP);
		
		     break;
		
		    case 2: 
		     System.out.println("Tamanho médio selecionado, por favor, insira a quantidade de camisetas que deseja: ");
		     
		     int qntdMédia = ler.nextInt();
		     
		     double valorM = qntdMédia * 12;
		     
		     System.out.println("Quantidade de camisetas: "+ qntdMédia +"Valor total: "+ valorM);
		
		     break;
		
		    case 3: 
		     
		     System.out.println("Tamanho grande selecionado, por favor, insira a quantidade de camisetas que deseja: ");
		     
		     int qntdGrande = ler.nextInt();
		     
		     double valorG = qntdGrande * 15;
		     
		     System.out.println("Quantidade de camisetas: "+ qntdGrande +"Valor total: "+ valorG);
		     
		     break;
		        
		}
	}
}