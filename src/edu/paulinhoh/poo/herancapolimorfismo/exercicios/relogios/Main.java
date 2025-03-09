package edu.paulinhoh.poo.herancapolimorfismo.exercicios.relogios;

import edu.paulinhoh.poo.herancapolimorfismo.exercicios.relogios.domains.BRClock;
import edu.paulinhoh.poo.herancapolimorfismo.exercicios.relogios.domains.Clock;
import edu.paulinhoh.poo.herancapolimorfismo.exercicios.relogios.domains.USClock;

public class Main {
    public static void main(String[] args) {

        Clock brclock = new BRClock();
        brclock.setSeconds(0);
        brclock.setMinutes(0);
        brclock.setHour(13);

        System.out.println(brclock.getTime());

        System.out.println(new USClock().convert(brclock).getTime());
    }
}