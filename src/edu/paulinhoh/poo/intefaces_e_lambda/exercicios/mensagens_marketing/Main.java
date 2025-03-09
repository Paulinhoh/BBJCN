package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.mensagens_marketing;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nOlá, bem vindo ao sistema de mensagens marketing!");
        System.out.println("Digite a mensagem: ");
        var msg = scanner.nextLine();

        System.out.println("\nEscolha uma opção: ");
        System.out.println("1 - WhatsApp");
        System.out.println("2 - E-mail");
        System.out.println("3 - Redes Sociais");
        System.out.println("4 - SMS");

        var opcao = scanner.nextInt();
        switch (opcao) {
            case 1 -> new WhatsApp(msg).enviarMensagem();
            case 2 -> new Email(msg).enviarMensagem();
            case 3 -> new RedesSociais(msg).enviarMensagem();
            case 4 -> new SMS(msg).enviarMensagem();
            default -> System.out.println("Opção inválida!");
        }

        // System.exit(0);

    }
}