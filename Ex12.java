/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Ex12
{
	public static void main(String[] args) {
	 int idade, idade2;
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Qual a sua idade? ");
	 idade = ler.nextInt();
	 
	 if(idade >= 18){
	    idade2 = idade - 18;
	   System.out.println(+ idade2 + " anos se passaram, Já tá na hora de se alistar"); 
	 }
	    
	 else{
	     idade2 = idade - 18;
	   System.out.println("Você é menor de idade, faltam"+ idade2 +" ano(s) para realizar o alistamento");
	 }
	 
	 
	 
	 
	}
}