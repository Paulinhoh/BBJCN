package edu.paulinhoh.javabasico;

public class Operadores {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // operadores
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double conta = (10*7) + (20/4);

        // operador unario
        int numero = 5;
        numero = -numero;
        System.out.println(numero); // -5
        numero = numero * -1;
        System.out.println(numero); // 5

        numero++; // incremento (+=)
        numero--; // decremento (-=)

        // negação
        boolean variavel = false;
        System.out.println(!variavel); // true

        // ternario
        int a = 5;
        int b = 6;
        String resultado = (a==b) ?"verdadeiro" :"falso";
        System.out.println(resultado); // falso

        // relacionais
        /*
         *  == igual
         *  != diferente
         *  > maior
         *  >= maior ou igual
         *  < menor
         *  <= menor ou igual
         */

         String nomeUm = "Paulinho";
         String nomeDois = new String("Paulinho");
         System.out.println(nomeUm==nomeDois); // false
         System.out.println(nomeUm.equals(nomeDois)); // true

        // lógicos
        /*
         *  && E
         *  || ou
         *  !  not
         */

         boolean condicao1 = true;
         boolean condicao2 = false;
         
         if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
         } else if (condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeira");
         } else {
            System.out.println("nenhuma das condições são verdadeiras");
         }

    }
}
