package edu.paulinhoh.poo.fundamentos.emun;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
            System.out.println(e.getSigla() +" - "+ e.getNome());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.BAHIA;
        System.out.println(eb.getNomeMaiusculo());
    }
}
