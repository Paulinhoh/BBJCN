package edu.paulinhoh.poo.colections.list.operacoes_basicas.exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }

            carrinho.removeAll(itensParaRemover);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(this.carrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Lapis", 2, 3);
        carrinhoDeCompras.adicionarItem("Caneta", 3.50, 5);
        carrinhoDeCompras.adicionarItem("Cafe", 15.25, 1);
        carrinhoDeCompras.removerItem("Lapis");

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();
    }

}