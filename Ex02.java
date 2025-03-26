/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args) {
	 int idade;
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Qual a sua idade? ");
	 idade = ler.nextInt();
	 
	 if(idade >= 18)
	   System.out.println("Você é maior de idade");
	 else
	   System.out.println("Você é menor de idade!");
	 
	 
	 
	}
}