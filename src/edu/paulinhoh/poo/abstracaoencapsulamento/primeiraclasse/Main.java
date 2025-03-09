package edu.paulinhoh.poo.abstracaoencapsulamento.primeiraclasse;

public class Main {
    public static void main(String[] args) {

        var male = new Person("Paulo Henrique", 23);
        male.IncAge();

        var female = new Person("Marina", 20);

        System.out.println(male.getName() + " tem " + male.getAge() + " anos");
        System.out.println(female.getName() + " tem " + female.getAge() + " anos");

    }

}
