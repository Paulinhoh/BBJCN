package edu.paulinhoh.javabasico.sintaxe;

public class TiposVariaveis {

    @SuppressWarnings("unused")
    public static void main(String[] args) {  
        // tipos primitivos
        byte idade = 123;
        short ano = 2022;
        int cep = 21070333;
        long cpf = 98765432109L;
        float PI = 3.14F;
        double salario = 2500.33;

        // casting
        short numeroCurto = 1;
        int numeroNormal1 = numeroCurto;
        short numeroCurto2 = (short) numeroNormal1;

        // variaveis x constantes
        int numero = 5; // variavel (pode ser alterada)
        numero = 7;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // constante (não pode ser alterada)
        // VALOR_DE_PI = 3.15; (erro)
        System.out.println(VALOR_DE_PI);
    }
}
