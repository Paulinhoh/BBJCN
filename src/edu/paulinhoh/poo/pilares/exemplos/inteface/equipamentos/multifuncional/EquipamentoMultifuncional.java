package edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.multifuncional;

import edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.copiadora.Copiadora;
import edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.digitalizadora.Digitalizadora;
import edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional...");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional...");
    }

}