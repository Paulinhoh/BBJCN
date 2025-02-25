package edu.paulinhoh.javabasico;
public class MinhaClasse {
    
    @SuppressWarnings("unused") // esta suprimindo o erre de variavel não utilizada do metodo main
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        // variaveis
        String meuNome = "Paulinho";
        int anoFabricacao = 2022;
        boolean verdade = true;
        
        final String BR = "Brasil"; // constante

        String primeiroNome = "Paulo";
        String segundoNome = "Henrique";

        // metodos
        String nomeCompleto = numeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String numeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
