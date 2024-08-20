import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Leitura do primeiro parâmetro
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Leitura do segundo parâmetro

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Imprimir a mensagem da exceção personalizada
        } finally {
            terminal.close(); // Fechar o scanner
        }
    }

    static void contar(int parametroUm, int parametroDois) throws Exception {
        if (parametroUm >= parametroDois) {
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
