/******************************************************************************
Construa um algoritmo para calcular o
valor a ser pago pelo período de estacionamento do automóvel (PAG). O usuário
entra com os seguintes dados: hora (HE) e minuto (ME) de entrada, hora (HS) e
minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou
seja, se passar um minuto ele cobra a hora inteira. O valor cobrado pelo
estacionamento é: •R$ 4,00 para 1 hora de estacionamento •R$ 6,00 para 2 horas
de estacionamento •R$ 1,00 por hora adicional (acima de 2 horas)

*******************************************************************************/

import java.util.Scanner;
public class Ex09
{
	public static void main(String[] args) {
	    double pag, he, me, hs, ms, totalhr, totalmin, extra;
	   Scanner ler = new Scanner (System.in);
	   
	   System.out.println("entre com a Hora de entrada!");
	   he = ler.nextDouble();
	   System.out.println("Entre com o minuto de entrada!");
	   me = ler.nextDouble();
	   System.out.println("Entre com a hora de saida: ");
	   hs = ler.nextDouble();
	   System.out.println("Entre com os minutos de saida: ");
	   ms = ler.nextDouble();
	   
	   totalmin = me - ms;
	   totalhr = hs - he;
	   
	   if (totalhr == 1){
	       System.out.println("Você pagará cerca de R$4,00");
	   }
	   else if (totalhr == 2){
	       System.out.println("Você pagará R$6,00");   
	   }
	   else if(totalhr >= 3 ){
	       System.out.println("Você pagara R$ 1,00 a mais por hora");
	   }
	   else {
	       System.out.println("Não identificado");
	   }
	}   
}