package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.areas;

public record Circle(double radius) implements GeometricForm {

    private static final double PI = 3.14;

    @Override
    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

}