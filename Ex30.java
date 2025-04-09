/******************************************************************************

  30. Escreva um programa que pergunta um número ao usuário, e
mostre sua tabuada completa desse número (de 1 até 10).
*******************************************************************************/
import java.util.Scanner;
public class Ex30 {
    
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        int numero = 1;
        int tabuada, resultado;
        
        System.out.println("Coloque um número de 0 a 10: ");
        tabuada = ler.nextInt();
        
        while(numero <= 10){
            resultado = tabuada * numero;
            System.out.println(tabuada + " X " + numero +" = " + resultado);
            
            numero++;
        }

   }
}