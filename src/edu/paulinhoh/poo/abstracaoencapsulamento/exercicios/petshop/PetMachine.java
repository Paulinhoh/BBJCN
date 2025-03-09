package edu.paulinhoh.poo.abstracaoencapsulamento.exercicios.petshop;

public class PetMachine {

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public PetMachine() {
        this.clean = true;
        this.water = 30;
        this.shampoo = 10;
    }

    public void takeAShowert() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        this.pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " foi banhado.");
    }

    public void addWater() {
        if (this.water >= 30) {
            System.out.println("Capacidade de água cheia.");
            return;
        }

        System.out.println("Abastecendo a máquina com agua...");
        this.water += 2;
    }

    public void addShampoo() {
        if (this.shampoo >= 10) {
            System.out.println("Capacidade de shampoo cheia.");
            return;
        }

        System.out.println("Abastecendo a máquina com shampoo...");
        this.shampoo += 2;
    }

    public int getWater() {
        return this.water;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina precisa ser limpa.");
            return;
        }

        if (hasPet()) {
            System.out.println("Já existe um pet na máquina.");
            return;
        }

        this.pet = pet;
        System.out.println("Pet " + this.pet.getName() + " adicionado com sucesso!");
    }

    public void removePet() {
        if (!hasPet()) {
            System.out.println("Não tem nenhum pet na máquina.");
            return;
        }

        if (!this.pet.isClean()) {
            System.out.println("O pet ainda não foi limpo.");
            return;
        }

        System.out.println("O pet " + this.pet.getName() + " foi retirado.");
        this.pet = null;
        this.clean = false;
    }

    public void washMachine() {
        if (this.clean) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }

}
