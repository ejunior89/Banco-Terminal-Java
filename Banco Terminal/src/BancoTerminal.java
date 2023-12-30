import java.util.Scanner;

public class BancoTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário fazer um depósito inicial
        System.out.print("Informe o valor do depósito inicial: ");
        double depositoInicial = sc.nextDouble();

        // Inicializa o saldo com o valor do depósito inicial
        double saldo = depositoInicial;

        while (true) {
            System.out.println("\nSaldo atual: " + saldo);
            
            // Solicita ao usuário informar o valor do saque
            System.out.print("Informe o valor do saque (ou digite 0 para encerrar): ");
            double valorSaque = sc.nextDouble();

            // Verifica se o usuário deseja encerrar o programa
            if (valorSaque == 0) {
                System.out.println("Encerrando o programa. Obrigado!");
                break;
            }

            // Verifica se o saldo é suficiente para o saque
            if (saldo >= valorSaque) {
                saldo -= valorSaque;
                System.out.println("Saque de " + valorSaque + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente. Saque não realizado.");
            }
        }

        sc.close(); // Fechar o scanner quando não for mais necessário
    }
}
