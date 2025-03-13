package edu.paulinhoh.poo.colections.set.Ordenacao.exemplo;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator {

    @Override
    public int compare(Object p1, Object p2) {
        if (p1 instanceof Produto && p2 instanceof Produto) {
            return Double.compare(((Produto) p1).getPreco(), ((Produto) p2).getPreco());
        }
        throw new ClassCastException("Incompatible object types for comparison");
    }

}
