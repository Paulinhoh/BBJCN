package edu.paulinhoh.javabasico.repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "LAURA", "JULIA"};

        // for normal
        for (int indice=0; indice < alunos.length; indice++) {
            System.out.println("O aluno no index x="+ indice +" é "+ alunos[indice]);
        }

        // for each
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: "+ aluno);
        }
    }
}
