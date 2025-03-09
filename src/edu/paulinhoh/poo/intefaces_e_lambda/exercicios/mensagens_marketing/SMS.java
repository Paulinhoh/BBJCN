package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.mensagens_marketing;

public record SMS(String msg) implements ModeloMensagem {

    @Override
    public void enviarMensagem() {
        System.out.println("\nEnviando mensagem por SMS: " + msg);
    }

}