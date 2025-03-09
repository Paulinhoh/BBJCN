package edu.paulinhoh.poo.intefaces_e_lambda.exercicios.mensagens_marketing;

public record RedesSociais(String msg) implements ModeloMensagem {

    @Override
    public void enviarMensagem() {
        System.out.println("\nEnviando mensagem por redes sociais: " + msg);
    }

}