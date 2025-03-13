package edu.paulinhoh.poo.colections.map.Pesquisa.exemplo;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorQuantidadeValorTotalNoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getQuantidade() * p.getPreco() > maiorQuantidadeValorTotalNoEstoque) {
                    produtoMaiorQuantidadeValorTotalNoEstoque = p;
                }
            }
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        var estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L,"produto 1", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L,"produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L,"produto C", 2, 15.0);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.calculaValorTotalEstoque()+"\n");
        System.out.println(estoqueProdutos.obterProdutoMaisBarato()+"\n");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro()+"\n");
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque()+"\n");
    }

}
