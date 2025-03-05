package edu.paulinhoh.poo.fundamentos.construtor;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // Método construtor
    // O nome deverá ser igual ao nome da classe
    public Pessoa (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // ...
}
