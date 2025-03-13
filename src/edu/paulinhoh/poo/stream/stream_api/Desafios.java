package edu.paulinhoh.poo.stream.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafios {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

        // Desafio 1: Mostre a lista na ordem numerica
        List<Integer> ordemNumerica = numeros.stream().sorted().toList();
        System.out.println("Desafio 1: "+ordemNumerica);

        // Desafio 2 - Imprima a soma dos números pares da lista
        int somaNumerosPares = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("\nDesafio 2: " + somaNumerosPares);

        // Desafio 3 - Verifique se todos os números da lista são positivos
        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println("Desafio 3: " + todosPositivos);

        // Desafio 4 - Remova todos os valores ímpares
        List<Integer> valoresPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Desafio 4: "+valoresPares);

        // Desafio 5 - Calcule a média dos números maiores que 5
        double mediaNumerosMaiores5 = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("\nDesafio 5: " + mediaNumerosMaiores5);

        // Desafio 6 - Verificar se a lista contém algum número maior que 10
        boolean valorMaiorQue10 = numeros.stream().anyMatch(n -> n > 10);
        System.out.println("Desafio 6: " + valorMaiorQue10);

        // Desafio 7 - Encontrar o segundo número maior da lista
        int segundoMaior = numeros.stream().distinct().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().orElse(0);
        System.out.println("Desafio 7: " + segundoMaior);

        // Desafio 8 - Somar os dígitos de todos os números da lista
        int somarDigitos = numeros.stream().mapToInt(n -> String.valueOf(n).chars().map(Character::getNumericValue).sum()).sum();
        System.out.println("Desafio 8: " + somarDigitos);

        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)
        boolean verificarSeOsNumerosSeRepetem = numeros.stream().distinct().count() == numeros.size();
        System.out.println("Desafio 9: " + verificarSeOsNumerosSeRepetem);

        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5
        List<Integer> numerosImparesMultiplos3ou5 = numeros.stream().filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)).toList();
        System.out.println("Desafio 10: "+numerosImparesMultiplos3ou5);

        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista
        int somaDosQuadrados = numeros.stream().mapToInt(n -> n * n).sum();
        System.out.println("Desafio 11: " + somaDosQuadrados);

        // Desafio 12 - Encontre o produto de todos os números da lista
        int produto = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Desafio 12: " + produto);

        // Desafio 13 - Filtrar os números que estão dentro de um intervalo
        int inicio = 3;
        int fim = 8;
        List<Integer> numerosNoIntervalo = numeros.stream().filter(n -> n >= inicio && n <= fim).toList();
        System.out.println("Desafio 13: " + numerosNoIntervalo);

        // Desafio 14 - Encontre o maior número primo da lista
        int maiorPrimo = numeros.stream()
                .filter(n -> isPrime(n))
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Desafio 14: " + maiorPrimo);

        // Desafio 15 - Verifique se a lista contém pelo menos um número negativo
        boolean valorMenorQue0 = numeros.stream().anyMatch(n -> n < 0);
        System.out.println("Desafio 15: "+valorMenorQue0);

        // Desafio 16 - Agrupe os números em pares e ímpares
        Map<String, List<Integer>> paresImpares = numeros.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Pares" : "Ímpares"));
        System.out.println("Desafio 16: "+paresImpares);

        // Desafio 17 - Filtrar os números primos da lista
        List<Integer> numerosPrimos = numeros.stream().filter(n -> isPrime(n)).toList();
        System.out.println("Desafio 17: "+numerosPrimos);

        // Desafio 18 - Verifique se todos os números da lista são iguais
        boolean todosIguais = numeros.stream().distinct().count() == 1;
        System.out.println("Desafio 18: "+todosIguais);

        // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5
        int somaDivisiveisPor3e5 = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Desafio 19: "+somaDivisiveisPor3e5);
    }

    // Verifica se o número é primo
    private static boolean isPrime(int n) {
        if (n <= 1){ return false;}
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}