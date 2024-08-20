import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float saldo = 1512;

        System.out.printf("Por favor, digite seu número de conta: ");
        String numeroConta = scanner.nextLine();

        System.out.printf("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.printf("Por favor, digite seu número de agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.printf("Por favor, digite o valor do saque: ");
        float saque = scanner.nextFloat();

        saldo -= saque;

        System.out.printf("%nDados da conta:%n");
        System.out.printf("Número da conta: %s%n", numeroConta);
        System.out.printf("Nome do cliente: %s%n", nomeCliente);
        System.out.printf("Número da agência: %s%n", numeroAgencia);
        System.out.printf("Saldo: %.2f%n", saldo);

        scanner.close();
    }
}
