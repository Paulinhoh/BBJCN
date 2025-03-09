package edu.paulinhoh.poo.herancapolimorfismo.exercicios.cinema.domain;

public class IngressoFamilia {

    @SuppressWarnings("unused")
    private double valorIngresso = 40;

    public double setValorIngressoFamilia(int quantidadePessoas) {
        return this.valorIngresso = (quantidadePessoas > 3) ? (40 * quantidadePessoas) - (40 * 0.05)
                : 40 * quantidadePessoas;
    }

}