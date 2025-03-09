package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.mensagens_marketing;

public record Email(String msg) implements ModeloMensagem {

    @Override
    public void enviarMensagem() {
        System.out.println("\nEnviando mensagem por e-mail: " + msg);
    }

}