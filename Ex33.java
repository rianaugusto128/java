/******************************************************************************

33. Faça um programa que leia 10 números e informe a soma e a média dos números.

*******************************************************************************/
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double numero, soma = 0;

        while (contador < 10) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            numero = scanner.nextDouble();
            soma += numero;
            contador++;
        }

        double media = soma / 10;

        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
