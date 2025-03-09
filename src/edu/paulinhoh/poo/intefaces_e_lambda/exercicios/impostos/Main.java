package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.impostos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vestuario vestuario = new Vestuario();
        Saude saude = new Saude();
        Alimentacao alimentacao = new Alimentacao();
        Cultura cultura = new Cultura();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        var valor = scanner.nextDouble();
        scanner.close();

        System.out.println("Imposto sobre R$" + valor + " em alimentação é:" + alimentacao.calcularImposto(valor));
        System.out.println("Imposto sobre R$" + valor + " em saude e bem estar é:" + saude.calcularImposto(valor));
        System.out.println("Imposto sobre R$" + valor + " em vestuario é:" + vestuario.calcularImposto(valor));
        System.out.println("Imposto sobre R$" + valor + " em cultura é:" + cultura.calcularImposto(valor));
    }
}