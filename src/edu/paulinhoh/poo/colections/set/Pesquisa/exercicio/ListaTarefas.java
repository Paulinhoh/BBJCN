package edu.paulinhoh.poo.colections.set.Pesquisa.exercicio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefas> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!tarefasSet.isEmpty()){
        for (Tarefas t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasSet.remove(t);
                break;
            }
        }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefas> obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for (Tarefas t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes() {
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for (Tarefas t : tarefasSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefas t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefas t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefasSet.removeAll(tarefasSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Escovar os dentes");
        listaTarefas.adicionarTarefa("Café da manha");
        listaTarefas.adicionarTarefa("Academia");
        listaTarefas.adicionarTarefa("Trabalhar");
        listaTarefas.adicionarTarefa("Almoçar");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Jantar");
        listaTarefas.adicionarTarefa("Dormir");

        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.marcarTarefaConcluida("Escovar os dentes");
        listaTarefas.marcarTarefaConcluida("Café da manha");
        listaTarefas.marcarTarefaConcluida("Academia");

        System.out.println(listaTarefas.obterTarefasConcluidas());
        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
