package edu.paulinhoh.poo.intefaces_e_lambda.keywords.pacote;

public class Client {

    private String name;
    private int age;

    private Address address = new Address();

    // Getter and Setter
    public int getAge() {
        return age;
    }

    public String getName() {
        System.out.println(address.getDescription());
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Nested
    public class Nested {

        public void test() {
            System.out.println(address.getDescription());
        }
    }

}