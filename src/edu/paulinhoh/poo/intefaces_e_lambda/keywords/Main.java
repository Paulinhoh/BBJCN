package edu.paulinhoh.poo.intefaces_e_lambda.keywords;

import edu.paulinhoh.poo.intefaces_e_lambda.keywords.pacote.Client;

public class Main {
    public static void main(String[] args) {

        var user = new Client();
        System.out.println(user.getName());
    }
}

/*
 * 
 * - Defaul: sómente quem esta no mesmo pacote pode acessar.
 * - Protected: quem esta no mesmo pacote e quem esta em outro pacote, mas que
 * herda da classe.
 * - Public: quem esta em qualquer lugar.
 * - Private: quem esta na mesma classe.
 */