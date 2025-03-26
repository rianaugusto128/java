/******************************************************************************

        A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.

*******************************************************************************/

import java.util.Scanner;
public class Ex04{
    public static void main (String [] args){
        double tempo, salario, bonus , bonus2, total1, total2;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual o seu salário: ");
        salario = ler.nextDouble();
        System.out.println("Quanto tempo de serviço você tem: ");
        tempo = ler.nextDouble();
        
        bonus = (salario * 20) / 100;
        bonus2 = (salario * 10) / 100;
        total1 = salario + bonus;
        total2 = salario + bonus2;
       
        if(tempo >= 5)
          System.out.println("Você recebeu cerca de "+ bonus +"R$ totalizando " + total1 );
          
        else 
          System.out.println("Você recebeu cerca de " + bonus2 + "R$ totalizando " + total2);
    }
}
	 
	   
	  
	   
	   