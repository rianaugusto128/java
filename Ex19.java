import java.util.Scanner;

public class Ex19 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE; // A maior idade possível para garantir que qualquer idade seja menor
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = ler.nextLine();
            
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = ler.nextInt();
            ler.nextLine();  
          
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }
        
      
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
        
        ler.close(); 
    }
}