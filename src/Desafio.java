import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Leonardo Ferreira";
        String tipoConta = "Corrente";
        Double saldo = 1290.00;
        int opcao = 0;

        System.out.println("*****************************************");
        System.out.println("\n Nome do cliente: " + nome);
        System.out.println("\n Tipo de conta: " + tipoConta);
        System.out.println("\n Saldo do cliente: " + saldo);
        System.out.println("\n*****************************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a trasnferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }

        }
    }
}
