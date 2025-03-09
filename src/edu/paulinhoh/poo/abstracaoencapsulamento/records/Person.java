package edu.paulinhoh.poo.abstracaoencapsulamento.records;

public record Person(String name, int age) {

    public Person(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + "\nAge: " + age;
    }

}
