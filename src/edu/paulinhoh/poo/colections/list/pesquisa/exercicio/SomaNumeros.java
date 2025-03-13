package edu.paulinhoh.poo.colections.list.pesquisa.exercicio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                soma += numero;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!numeros.isEmpty()) {
            maiorNumero = numeros.get(0);
            for (Integer numero : numeros) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;
        if (!numeros.isEmpty()) {
            menorNumero = numeros.get(0);
            for (Integer numero : numeros) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "SomaNumeros{" + "numeros=" + numeros + '}';
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}