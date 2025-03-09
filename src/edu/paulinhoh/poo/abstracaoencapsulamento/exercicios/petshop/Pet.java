package edu.paulinhoh.poo.abstracaoencapsulamento.exercicios.petshop;

public class Pet {

    private final String name;
    private boolean clean;

    Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean isClean() {
        return this.clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

}
