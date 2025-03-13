package edu.paulinhoh.poo.colections.map.OperacoesBasicas.exemplos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 7599883);
        agendaContatos.adicionarContato("Gabriel", 887542);
        agendaContatos.adicionarContato("Camila Java", 365614);
        agendaContatos.adicionarContato("Maria", 987654);
        agendaContatos.adicionarContato("Camila", 4444444);

        System.out.println();


        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println();
        agendaContatos.exibirContatos();
    }
}
