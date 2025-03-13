package edu.paulinhoh.poo.colections.set.Ordenacao.exercicio;

import edu.paulinhoh.poo.colections.set.Ordenacao.exemplo.Produto;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    private String nome;
    private long matricula;
    private double nota;

    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }
}

class ComparatorPorNota implements Comparator {

    @Override
    public int compare(Object a1, Object a2) {
        if (a1 instanceof Aluno && a2 instanceof Aluno) {
            return Double.compare(((Aluno) a1).getNota(), ((Aluno) a2).getNota());
        }
        throw new ClassCastException("Incompatible object types for comparison");
    }
}
