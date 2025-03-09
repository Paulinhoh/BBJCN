package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.areas;

public record Rectangle(double base, double height) implements GeometricForm {

    @Override
    public double getArea() {
        return this.height * this.base;
    }

}