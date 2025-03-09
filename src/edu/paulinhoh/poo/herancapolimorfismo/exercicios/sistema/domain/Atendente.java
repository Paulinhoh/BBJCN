package edu.paulinhoh.poo.herancapolimorfismo.exercicios.sistema.domain;

public class Atendente extends Gerente {

    private double valorEmCaixa;

    public Atendente(String nome, String email, int senha, double valorEmCaixa) {
        super(nome, email, senha);
        super.setAdministrador(false);
        this.valorEmCaixa = valorEmCaixa;
    }

    public double getValorEmCaixa() {
        return this.valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        this.valorEmCaixa += valor;
        System.out.println("Pagamento recebido com sucesso!");
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado com sucesso!");
    }

}