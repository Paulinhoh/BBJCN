package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.impostos;

public record Saude() implements Impostos {

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.015;
    }

}