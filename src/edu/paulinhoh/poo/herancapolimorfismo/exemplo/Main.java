package edu.paulinhoh.poo.herancapolimorfismo.exemplo;

import edu.paulinhoh.poo.herancapolimorfismo.exemplo.domain.Employee;
import edu.paulinhoh.poo.herancapolimorfismo.exemplo.domain.Manager;
import edu.paulinhoh.poo.herancapolimorfismo.exemplo.domain.Salesman;

public class Main {
    public static void main(String[] args) {

        Employee manager = new Manager();
        Employee salesman = new Salesman();

        printEmployee(manager);
        printEmployee(salesman);

    }

    public static void printEmployee(Employee employee) {
        if (employee instanceof Manager manager) {
            employee.setName("João");
            manager.setLogin("joao");
            manager.setPassword("123456");

            System.out.println("\n" + employee.getName());
            System.out.println(manager.getLogin());
            System.out.println(manager.getPassword());
        }

        switch (employee) {
            case Salesman salesman -> {
                salesman.setPercentParSold(10);
                salesman.setSalary(2000);
                salesman.setTotalSold(10000);
                System.out.println(salesman.getFullSlary());
            }
            default -> {
                System.out.println("Não é um vendedor");
            }
        }
    }
}