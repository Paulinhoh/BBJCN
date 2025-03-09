package edu.paulinhoh.poo.abstracaoencapsulamento.records;

public class Main {
    public static void main(String[] args) {

        var person = new Person("Paulinho", 23);
        var person2 = new Person("Marina");

        System.out.println(person.getInfo());
        System.out.println("\n" + person2.getInfo());
    }
}
