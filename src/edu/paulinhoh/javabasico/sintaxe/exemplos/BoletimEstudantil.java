package edu.paulinhoh.javabasico.sintaxe.exemplos;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6){
            System.out.println("REPROVADO");
        } else if (mediaFinal == 6) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("APROVADO");
        }
    }
}
