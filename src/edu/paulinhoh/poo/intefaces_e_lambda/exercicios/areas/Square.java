package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.areas;

public record Square(double side) implements GeometricForm {

    @Override
    public double getArea() {
        return this.side * this.side;
    }

}