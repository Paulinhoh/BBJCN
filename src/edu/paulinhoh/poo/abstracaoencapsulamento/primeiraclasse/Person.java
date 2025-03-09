package edu.paulinhoh.poo.abstracaoencapsulamento.primeiraclasse;

import java.time.OffsetDateTime;

public class Person {

    private final String name;
    private int age;
    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void IncAge() {
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear())
            return;

        this.age++;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }

}
