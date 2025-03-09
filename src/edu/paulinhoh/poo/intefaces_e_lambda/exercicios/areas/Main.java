package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.areas;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        GeometricForm form = null;

        while (true) {
            System.out.println("\nEscolha uma forma geométrica para calcular a Área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> form = createSquare();
                case 2 -> form = createRectangle();
                case 3 -> form = createCircle();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }

            if (form != null) {
                System.out.println("\nÁrea: " + form.getArea());
            }
        }
    }

    private static GeometricForm createSquare() {
        System.out.println("Digite o lado do quadrado: ");
        return new Square(scanner.nextDouble());
    }

    private static GeometricForm createRectangle() {
        System.out.println("Digite a base: ");
        var base = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        var height = scanner.nextDouble();

        return new Rectangle(base, height);
    }

    private static GeometricForm createCircle() {
        System.out.println("Digite o raio: ");
        return new Circle(scanner.nextDouble());
    }
}