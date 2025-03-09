package edu.paulinhoh.poo.abstracaoencapsulamento.exercicios.banco;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Valor inicial da conta: ");
        var valorInicial = scanner.nextDouble();
        var conta = new ContaBanco(valorInicial);

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar fatura");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            var opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> conta.depositar(lerValor());
                case 4 -> conta.sacar(lerValor());
                case 5 -> conta.pagarFatura(lerValor());
                case 0 -> System.exit(0);
                default -> System.out.println("\nOpção inválida");
            }

        } while (true);
    }

    private static double lerValor() {
        System.out.print("Valor: ");
        return scanner.nextDouble();
    }

}
