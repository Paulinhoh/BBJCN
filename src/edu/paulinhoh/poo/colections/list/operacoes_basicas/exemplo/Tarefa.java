package edu.paulinhoh.poo.colections.list.operacoes_basicas.exemplo;

public class Tarefa {

    // Atributos
    private String descricao;

    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Metodos
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

}