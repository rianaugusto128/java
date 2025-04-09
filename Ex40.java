/*

Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.

*/

import java.util.Scanner;
public class Ex40 {
    public static void main (String [] agrs){
        Scanner ler = new Scanner(System.in);
        
        double total, preco, litros;
        int valor, escolha;
        
        do {
            System.out.println("=== Combustivél ===");
            System.out.println("1) Gasolina ");
            System.out.println("2) Alcool ");
            System.out.println("3) Diesel ");
            System.out.println("4) Voltar ");
            escolha = ler.nextInt();
            
            switch (escolha){
                case 1: //Gasolina
                    System.out.println("Gasolina selecionada! ");
                    System.out.println("=== Escolha ===");
                    System.out.println("1) Abastecer por valor");
                    System.out.println("2) Abastecer por Litro");
                     int forma = ler.nextInt();
                    
                    if(forma == 1){
                       System.out.println("Abastecer por valor selecionado"); 
                       System.out.println("Valor da gasolina em R$ 5.74 ");
                       System.out.println("Qual o valor desejado ");
                       valor = ler.nextInt();
                       
                       total = valor / 5.74;
                       
                       System.out.println("Deu um total de "+total+" Litros");
                       
                    }
                    else if(forma == 2){
                         System.out.println("Abastecer por Litro selecionado"); 
                       System.out.println("Valor da gasolina em R$ 5.74 ");
                       System.out.println("Quantos litros deseja: ");
                       valor = ler.nextInt();
                       
                       total = valor * 5.74;
                       
                       System.out.println("Deu um total de R$"+total);
                       
                    }
                    else{
                        System.out.println("Opção inválida");
                    }
                break;
                    
                case 2: //Alcool
                    System.out.println("Gasolina selecionada! ");
                    System.out.println("=== Escolha ===");
                    System.out.println("1) Abastecer por valor");
                    System.out.println("2) Abastecer por Litro");
                     forma = ler.nextInt();
                    
                    if(forma == 1){
                       System.out.println("Abastecer por valor selecionado"); 
                       System.out.println("Valor da gasolina em R$ 3.78 ");
                       System.out.println("Qual o valor desejado ");
                       valor = ler.nextInt();
                       
                       total = valor / 3.78;
                       
                       System.out.println("Deu um total de "+total+" Litros");
                       
                    }
                    else if(forma == 2){
                         System.out.println("Abastecer por Litro selecionado"); 
                       System.out.println("Valor da gasolina em R$ 3.78 ");
                       System.out.println("Quantos litros deseja: ");
                       valor = ler.nextInt();
                       
                       total = valor * 3.78;
                       
                       System.out.println("Deu um total de R$"+total);
                       
                    }
                    else{
                        System.out.println("Opção inválida");
                    }
                break;
                
                case 3: // Diesel
                    System.out.println("Gasolina selecionada! ");
                    System.out.println("=== Escolha ===");
                    System.out.println("1) Abastecer por valor");
                    System.out.println("2) Abastecer por Litro");
                     forma = ler.nextInt();
                    
                    if(forma == 1){
                       System.out.println("Abastecer por valor selecionado"); 
                       System.out.println("Valor da gasolina em R$ 3.55 ");
                       System.out.println("Qual o valor desejado ");
                       valor = ler.nextInt();
                       
                       total = valor / 3.55;
                       
                       System.out.println("Deu um total de "+total+" Litros");
                       
                    }
                    else if(forma == 2){
                         System.out.println("Abastecer por Litro selecionado"); 
                       System.out.println("Valor da gasolina em R$ 3.55 ");
                       System.out.println("Quantos litros deseja: ");
                       valor = ler.nextInt();
                       
                       total = valor * 3.55;
                       
                       System.out.println("Deu um total de R$"+total);
                       
                    }
                    else{
                        System.out.println("Opção inválida");
                    }
                    
                break;
                
                case 4: 
                    System.out.println("Voltando...");
                    return;
                
                default:
                  System.out.println("Opção inválida");
                 break;
            }
            
        }while (false);
    }
}
    