package edu.paulinhoh.poo.colections.map.OperacoesBasicas.exercicio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = dicionarioMap.get(palavra);
        if (definicaoPorPalavra != null) {
            return definicaoPorPalavra;
        } else {
            return "Palavra não encontrada no dicionário.";
        }
    }

    public static void main(String[] args) {
        var dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("palavra 1", "definição 1");
        dicionario.adicionarPalavra("palavra 2", "definição 2");
        dicionario.adicionarPalavra("palavra 3", "definição 3");
        dicionario.adicionarPalavra("palavra 4", "definição 4");

        System.out.println(dicionario.pesquisarPorPalavra("palavra 3"));

        dicionario.removerPalavra("palavra 2");
        dicionario.exibirPalavras();
    }
}
