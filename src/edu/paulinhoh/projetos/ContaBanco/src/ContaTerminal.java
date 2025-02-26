import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*
         * TODO:
         * [x] conhecer e importar a classe scanner
         * [x] exibir as mensagens para o usuario
         * [x] obter através do scanner os valores digitados no terminal
         * [x] exibir a mensagem de conta criada
         */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o numero da Conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite seu saudo: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, conta, saldo);
    }
}
