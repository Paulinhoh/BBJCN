package edu.paulinhoh.poo.colections.set.Ordenacao.exercicio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        for (Aluno aluno: alunoSet) {
            if (aluno.getMatricula() == matricula) {
                alunoSet.remove(aluno);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        var gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Paulinho", 202100115524L, 7.5d);
        gerenciadorAlunos.adicionarAluno("Gabriel", 202200115524L, 4.5d);
        gerenciadorAlunos.adicionarAluno("Ana Clara", 202300115524L, 9d);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome()+"\n");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota()+"\n");

        gerenciadorAlunos.removerAluno(202300115524L);
        gerenciadorAlunos.exibirAlunos();
    }


}
