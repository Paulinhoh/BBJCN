package edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando...");
    }

}