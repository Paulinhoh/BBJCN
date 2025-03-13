package edu.paulinhoh.poo.colections.set.operacoesBasicas.exercicio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoDePalavras {

    private Set<String> palavraUnicaSet;

    public ConjuntoDePalavras() {
        this.palavraUnicaSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraUnicaSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavraUnicaSet.isEmpty()) {
            if (palavraUnicaSet.contains(palavra)) {
                palavraUnicaSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto.");
            }
        } else {
            System.out.println("Conjunto de palavras está vazio.");
        }
    }

    public void verificarPalavra(String palavra) {
        if (!palavraUnicaSet.isEmpty()) {
            if (palavraUnicaSet.contains(palavra)) {
                System.out.println("A palavra '" + palavra + "' está presente no conjunto.");
            } else {
                System.out.println("A palavra '" + palavra + "' não está presente no conjunto.");
            }
        } else {
            System.out.println("Conjunto de palavras está vazio.");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavraUnicaSet);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ConjuntoDePalavras that)) return false;
        return Objects.equals(palavraUnicaSet, that.palavraUnicaSet);
    }

    @Override
    public String toString() {
        return "ConjuntoDePalavras{" +
                "palavraUnicaSet=" + palavraUnicaSet +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoDePalavras conjuntoPalavras = new ConjuntoDePalavras();

        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("palavra 1");
        conjuntoPalavras.adicionarPalavra("palavra 2");
        conjuntoPalavras.adicionarPalavra("palavra 3");
        conjuntoPalavras.adicionarPalavra("palavra 4");
        conjuntoPalavras.adicionarPalavra("palavra 3");

        conjuntoPalavras.verificarPalavra("palavra 2");
        conjuntoPalavras.removerPalavra("palavra 4");

        conjuntoPalavras.exibirPalavrasUnicas();
    }
}
