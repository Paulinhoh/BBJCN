package edu.paulinhoh.javabasico.condicional;

public class ResutadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 7) {
            System.out.println("APROVADO");
        }else if(nota>=5 && nota<7) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }

        // Ternario
        // String resultado = (nota>=7) ?"Aprovado" :(nota>=5 && nota<7) ?"Recuperação" :"Reprovado"
    }
}
