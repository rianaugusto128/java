import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        double[] valores = new double[10];
        double total = 0;
        int i = 0;

        // Entrada dos produtos
        System.out.println("=== Cadastro de Produtos ===");
        while (i < 10) {
            System.out.print("Digite o nome do " + (i + 1) + "º produto: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite o valor do " + (i + 1) + "º produto: R$ ");
            valores[i] = scanner.nextDouble();
            scanner.nextLine(); 

            total += valores[i];
            i++;
        }

        // Exibir os produtos e valor total
        System.out.println("\n=== Lista de Produtos ===");
        i = 0;
        while (i < 10) {
            System.out.println((i + 1) + " - " + nomes[i] + " - R$ " + valores[i]);
            i++;
        }
        System.out.printf("Total da compra: R$ %.2f%n", total);

        // Menu de pagamento 
        int opcao;
        double valorFinal = total;
        do {
            System.out.println("\n=== Formas de Pagamento ===");
            System.out.println("1 - À Vista (Dinheiro ou Pix) - 8% de desconto");
            System.out.println("2 - À Vista no Cartão de Crédito - 3% de desconto");
            System.out.println("3 - Parcelado em 2x no Cartão - Sem juros");
            System.out.println("4 - Parcelado em 3x até 10x no Cartão - 10% de juros");
            System.out.print("Escolha a forma de pagamento (1-4): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    valorFinal = total * 0.92;
                    System.out.println("Pagamento à vista (dinheiro/pix) com 8% de desconto.");
                    break;
                case 2:
                    valorFinal = total * 0.97;
                    System.out.println("Pagamento à vista no cartão com 3% de desconto.");
                    break;
                case 3:
                    System.out.println("Pagamento em 2x no cartão. Sem juros.");
                    System.out.printf("2 parcelas de R$ %.2f%n", total / 2);
                    break;
                case 4:
                    System.out.print("Digite o número de parcelas (3 a 10): ");
                    int parcelas = scanner.nextInt();
                    if (parcelas < 3 || parcelas > 10) {
                        System.out.println("Número de parcelas inválido.");
                    } else {
                        valorFinal = total * 1.10;
                        double valorParcela = valorFinal / parcelas;
                        System.out.println("Pagamento parcelado em " + parcelas + "x com 10% de juros.");
                        System.out.printf("%d parcelas de R$ %.2f%n", parcelas, valorParcela);
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao < 1 || opcao > 4);

        // Mostrar valor final
        if (opcao == 1 || opcao == 2 || opcao == 4) {
            System.out.printf("Valor final a ser pago: R$ %.2f%n", valorFinal);
        }
    }
}