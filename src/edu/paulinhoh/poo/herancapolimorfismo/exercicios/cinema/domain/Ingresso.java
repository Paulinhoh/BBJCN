package edu.paulinhoh.poo.herancapolimorfismo.exercicios.cinema.domain;

public class Ingresso extends IngressoFamilia {

    private double valorIngresso;
    private String nomeFilme;
    private boolean IdiomaFilmeDublado;

    public Ingresso() {
        this.valorIngresso = 40;
        this.nomeFilme = "Mickey 17";
        this.IdiomaFilmeDublado = false;
    }

    // Getters e Setters
    public double getValorIngresso() {
        return valorIngresso;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isIdiomaFilmeDublado() {
        return IdiomaFilmeDublado;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setValorIngresso(int opcao, int quantidadePessoas) {
        if (opcao == 1) {
            this.valorIngresso = 40;
        } else if (opcao == 2) {
            this.valorIngresso = 20;
        } else if (opcao == 3) {
            this.valorIngresso = setValorIngressoFamilia(quantidadePessoas);
        }
    }

    public void setIdiomaFilmeDublado(boolean idiomaFilmeDublado) {
        IdiomaFilmeDublado = idiomaFilmeDublado;
    }

    // Métodos

}