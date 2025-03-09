package edu.paulinhoh.poo.abstracaoencapsulamento.exercicios.carro;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var carro = new Carro();

        do {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - freiar");
            System.out.println("5 - Verificar marcha");
            System.out.println("6 - Virar para a esquerda");
            System.out.println("7 - Virar para a direita");
            System.out.println("8 - Sair");

            System.out.print("-> ");
            var opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carro.ligarCarro();
                case 2 -> carro.desligarCarro();
                case 3 -> carro.acelerar();
                case 4 -> carro.freiar();
                case 5 -> carro.verificarMarcha();
                case 6 -> carro.virarEsquerda();
                case 7 -> carro.virarDireita();
                case 0 -> System.exit(0);
                default -> System.out.println("\nOpção inválida!");
            }

        } while (true);
    }
}