package edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.impressora;

public class Deskjet implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Deskjet...");
    }

}