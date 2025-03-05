package edu.paulinhoh.poo.fundamentos.gettersetter.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("O aluno "+ felipe.getNome() +" tem "+ felipe.getIdade() +" anos");
        // O aluno Felipe tem 8 anos
    }
}
