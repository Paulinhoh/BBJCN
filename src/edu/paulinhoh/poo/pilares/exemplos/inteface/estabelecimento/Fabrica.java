package edu.paulinhoh.poo.pilares.exemplos.inteface.estabelecimento;

import edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.copiadora.Copiadora;
import edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.digitalizadora.Digitalizadora;
import edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.impressora.Impressora;
import edu.paulinhoh.poo.pilares.exemplos.inteface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}