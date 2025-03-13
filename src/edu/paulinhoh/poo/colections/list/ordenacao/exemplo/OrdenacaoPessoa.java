package edu.paulinhoh.poo.colections.list.ordenacao.exemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoas = new ArrayList<>();

    public OrdenacaoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Paulo", 20, 1.75);
        ordenacaoPessoa.adicionarPessoa("Maria", 25, 1.60);
        ordenacaoPessoa.adicionarPessoa("João", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("José", 22, 1.70);
        ordenacaoPessoa.adicionarPessoa("Ana", 27, 1.65);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}