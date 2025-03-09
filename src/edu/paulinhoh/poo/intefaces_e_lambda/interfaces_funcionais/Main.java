package edu.paulinhoh.poo.intefaces_e_lambda.interfaces_funcionais;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Marina", 20), new User("Paulinho", 23), new User("Gabriel", 13),
                new User("Ana Clara", 6));

        printStringValue(user -> user.name(), users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }

}
