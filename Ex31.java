/******************************************************************************

 31. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. 
 Depois modifique o programa para que ele mostre os números um ao lado do outro.
*******************************************************************************/
import java.util.Scanner;
public class Ex31 {
    
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        int numero = 1;
        
        while(numero <= 20){
            System.out.println(numero); // apenas fazer a alteração de System.out.println para System.out.print("Message"); 
            numero++;
        }
   }
}