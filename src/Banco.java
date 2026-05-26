import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Amanda";
        String tipoConta = "conta corrente";
        double saldo = 2000;


        System.out.println("***************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta:" + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("***************************");

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("""
                    OPERAÇÕES
                    
                    1- consultar saldo
                    2- receber valor
                    3- transferir valor
                    4- sair
                    
                    Digite a opção desejada
                    """);

            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("o saldo atual é R$ " + saldo);
            }
            else if(opcao == 2){
                System.out.println("Digite o valor que deseja receber");
                double valorRecebido = scanner.nextDouble();
                saldo += valorRecebido;
                System.out.println("Após o recebimento, seu saldo atual é de R$ " + saldo);
            }
            else if(opcao == 3){
                System.out.println("Digite o valor que deseja transferir");
                double valorTransferido = scanner.nextDouble();
                if(valorTransferido > saldo){
                    System.out.println("você não tem saldo o suficiente para concluir essa transferência");
                    System.out.println("seu saldo atual é de R$ " + saldo);
                }
                else {
                    saldo -= valorTransferido;
                    System.out.println("Após a transferência, seu saldo atual é de R$ " + saldo);
                }
            }
            else if(opcao == 4){
                System.out.println("Saindo do app do banco");
            }
            else{
                System.out.println("opção inválida");
            }
        }
    }
}

