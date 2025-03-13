package edu.paulinhoh.poo.colections.map.Pesquisa.exercicio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavras.isEmpty()) {
            contagemPalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavras);
    }

    public Map<String, Integer> encontrarPalavrasMaisFrequentes() {
        Map<String, Integer> palavrasMaisFrequentes = new HashMap<>();
        int maiorContagem = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            if (entry.getValue() == maiorContagem) {
                palavrasMaisFrequentes.put(entry.getKey(), entry.getValue());
            }
        }
        return palavrasMaisFrequentes;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("palavra 1", 1);
        contagemPalavras.adicionarPalavra("palavra 2", 2);
        contagemPalavras.adicionarPalavra("palavra 3", 7);
        contagemPalavras.adicionarPalavra("palavra 4", 4);

        contagemPalavras.exibirContagemPalavras();
        System.out.println("\n"+contagemPalavras.encontrarPalavrasMaisFrequentes());
    }
}
