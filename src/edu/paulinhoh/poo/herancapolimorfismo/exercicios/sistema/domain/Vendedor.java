package edu.paulinhoh.poo.herancapolimorfismo.exercicios.sistema.domain;

public class Vendedor extends Gerente {

    private int quantidadeVendas;

    public Vendedor(String nome, String email, int senha, int quantidadeVendas) {
        super(nome, email, senha);
        super.setAdministrador(false);
        this.quantidadeVendas = quantidadeVendas;
    }

    public int getQuantidadeVendas() {
        return this.quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public void adicionarVenda() {
        this.quantidadeVendas++;
        System.out.println("Venda adicionada com sucesso!");
    }

}