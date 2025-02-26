package edu.paulinhoh.javabasico.excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
