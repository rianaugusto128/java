import java.util.Scanner;
public class SistemaBancario {
    public static void main(String [] args) {
        Scanner ler = new Scanner (System.in);

        String[] nomes = new String[5];
        double[] saldos = new double[5];
        int numeroClientes = 0;

        while(true) {
            System.out.println("=== Menu ===");
            System.out.println("1) Criar conta");
            System.out.println("2) Depositar");
            System.out.println("3) Sacar");
            System.out.println("4) Consultar saldo");
            System.out.println("5) Sair");
            int opcao = ler.nextInt();
            ler.nextLine();

            switch(opcao) {
                case 1: 
                   if(numeroClientes < 5){
                    System.out.println("Digite o nome do cliente: ");
                    String nome = ler.nextline();
                    nomes[numeroClientes] = nome;
                    saldo [numeroClientes] = 0.0;
                    numeroClientes++;
                    System.out.println("Conta criada com sucesso!");
                   }
                   else {
                    System.out.println("Limite de contas atingido.");
                   }
                   break;
                case 2:
                    System.out.println("Digite o nome do cliente: ");
                    String nomeDeposito = ler.nextLine();
                    boolean depositoEncontrado = false;
                    for (int i = 0; i < numeroClientes; i++) {
                        if (nomes[i].equals(nomeDeposito)){
                            System.out.println("Digite o valor do deposito: ");
                            double valorDeposito  =ler.nextDouble ();
                            saldos[i] += valorDeposito;
                            System.out.println("Depósito realizado com sucesso!")
                            depositoEncontrado = true;
                            break;
                        }
                    } 
                    if (!depositoEncontrado) {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;
                case 3: 
                    System.out.println("Digite o nome do cliente: ");
                    String nomeSaque = ler.nextLine();
                    boolean saqueEncontrado = false;
                    for (int i = 0; i < numeroClientes; i++) {
                        if(nomes[i].equals(nomeSaque)) {
                            System.out.println("Digite o valor a ser sacado: ");
                            double valorSaque = ler.nextDouble();
                            if (saldos[i] >= valorSaque) {
                                saldos[i] -= valorSaque;
                                System.out.println("Saque realizado com sucesso!");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            saqueEncontrado = true;
                            break;
                        }
                    }    
                    if(!saqueEncontrado){
                        System.out.println("Cliente não encontrado!");
                    } 
                    break;
                case 4:
                    System.out.println("Digite o nome do cliente: ");
                    String nomeConsulta = ler.nextLine();
                    boolean consultaEncontrada = false;
                    for (int i = 0; i < numeroClientes; i++){
                        if(nomes[i].equals(nomeConsulta)) {
                          System.out.println("Saldo de" + nomes[i] +": R$ " + saldos[i]);
                          consultaEncontrada = true; 
                          break;  
                        }
                    }
                    if (!consultaEncontrada) {
                        System.out.println("Cliente não encontrado");
                    }
                    break;
                case 5:   
                    System.out.println("Saindo...");
                    ler.close();
                    return;
                default: 
                    System.out.println("Opção inválida!");         
            } 
        }
    }
}    