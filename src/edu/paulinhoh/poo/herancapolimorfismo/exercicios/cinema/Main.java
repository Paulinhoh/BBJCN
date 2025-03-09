package edu.paulinhoh.poo.herancapolimorfismo.exercicios.cinema;

import java.util.Scanner;
import edu.paulinhoh.poo.herancapolimorfismo.exercicios.cinema.domain.Ingresso;

public class Main {
    public static void main(String[] args) {

        var cinema = new Ingresso();
        var scanner = new Scanner(System.in);

        System.out.println("\n=-==-=-=-== Bem-vindo ao Cinemark -=-=-=-=-=-=");
        System.out.println("Qual filme você deseja assistir?");
        System.out.println("[1] Mickey 17");
        System.out.println("[2] Quarteto Fantástico");
        System.out.println("[3] Super-Man");
        System.out.println("[4] sair");

        System.out.print("-> ");
        var opcaoFilme = scanner.nextInt();

        switch (opcaoFilme) {
            case 1 -> cinema.setNomeFilme("Mickey 17");
            case 2 -> cinema.setNomeFilme("Quarteto Fantástico");
            case 3 -> cinema.setNomeFilme("Super-Man");
            case 4 -> System.exit(0);
            default -> System.out.println("Opção inválida");
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=");
        System.out.println("Qual idioma do filme?");
        System.out.println("[1] Dublado");
        System.out.println("[2] Legendado");

        System.out.print("-> ");
        var opcaoIdioma = scanner.nextInt();

        switch (opcaoIdioma) {
            case 1 -> cinema.setIdiomaFilmeDublado(true);
            case 2 -> cinema.setIdiomaFilmeDublado(false);
            default -> System.out.println("Opção inválida");
        }

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=");
        System.out.println("Qual ingresso?");
        System.out.println("[1] Ingresso normal");
        System.out.println("[2] Ingresso meia entrada");
        System.out.println("[3] Ingresso família");

        System.out.print("-> ");
        var opcaoIngresso = scanner.nextInt();

        switch (opcaoIngresso) {
            case 1 -> cinema.setValorIngresso(1, 1);
            case 2 -> cinema.setValorIngresso(2, 1);
            case 3 -> {
                System.out.println("Quantas pessoas?");
                System.out.print("-> ");
                var quantidadePessoas = scanner.nextInt();
                cinema.setValorIngresso(3, quantidadePessoas);
            }
            default -> System.out.println("Opção inválida");
        }

        scanner.close();
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=\n");

        System.out.println("O nome do filme é: " + cinema.getNomeFilme());
        System.out.println("O valor do ingresso é: R$" + cinema.getValorIngresso());
        System.out.println("O idioma do filme é: " + (cinema.isIdiomaFilmeDublado() ? "Dublado" : "Legendado"));

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=");
    }
}