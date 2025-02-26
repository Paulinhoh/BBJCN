package edu.paulinhoh.javabasico;

import edu.paulinhoh.javabasico.exemplos.SmartTv;

public class Metodos {
    public static void main(String[] args) {
        /*
         * Deve ser nomeado como verbo (ex.: somar, findById)
         * Seguir padrão camelCase
        */

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);
    }
}
