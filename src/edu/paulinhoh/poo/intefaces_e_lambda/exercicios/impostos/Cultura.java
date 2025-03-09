package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.impostos;

public record Cultura() implements Impostos {

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.04;
    }

}