import java.util.Scanner;

public class Ex18 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int somaIdades = 0; 
        int maiorIdade = 0; 
        int idade;
        
       
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = ler.nextInt(); 
            
            somaIdades += idade; 
            if (idade >= 18) { 
                maiorIdade++;
            }
        }
        
        
        double mediaIdades = (double) somaIdades / 20;
        
        
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Número de pessoas maiores de idade: " + maiorIdade);
        
        ler.close(); 
    }
}