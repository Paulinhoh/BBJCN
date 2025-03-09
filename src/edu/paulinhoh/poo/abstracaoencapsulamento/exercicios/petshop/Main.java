package edu.paulinhoh.poo.abstracaoencapsulamento.exercicios.petshop;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        var option = -1;
        do {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com água");
            System.out.println("3 - Abastecer a maquina com shampoo");
            System.out.println("4 - Verificar a quantidade de água");
            System.out.println("5 - Verificar a quantidade de shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar a maquina");
            System.out.println("0 - Sair");

            System.out.print("-> ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShowert();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }

        } while (true);

    }

    private static void setWater() {
        System.out.println("Tentando abastecer a maquina com água...");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando abastecer a maquina com shampoo...");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A quantidade de água é: " + amount + " litro(s)");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A quantidade de shampoo é: " + amount + " litro(s)");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    private static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet: ");
            name = scanner.nextLine();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
    }

}
