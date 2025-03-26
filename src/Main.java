import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados do usuário
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Criando instâncias
        Usuario usuario = new Usuario(nomeCliente);
        ContaBancaria conta = new ContaBancaria(numeroConta, numeroAgencia, saldoInicial, usuario);

        // Exibir mensagem de confirmação
        conta.exibirMensagem();

        scanner.close();
    }
}
