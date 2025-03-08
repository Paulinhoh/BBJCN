package edu.paulinhoh.poo.pilares.exemplos.messenger;

import edu.paulinhoh.poo.pilares.exemplos.apps.FacebookMessenger;
import edu.paulinhoh.poo.pilares.exemplos.apps.MSNMessenger;
import edu.paulinhoh.poo.pilares.exemplos.apps.ServicoMensagemInstatanea;
import edu.paulinhoh.poo.pilares.exemplos.apps.TelegramMessenger;

public class ComputadosPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstatanea smi = null;

        /*
         * Não se sabe qual App
         * Mas qualquer um devera enviar e receber mensagem
         */

        String appEscolhido = "msn";

        switch (appEscolhido) {
            case "msn" -> smi = new MSNMessenger();
            case "facebook" -> smi = new FacebookMessenger();
            case "telegram" -> smi = new TelegramMessenger();
            default -> {
            }
        }

        if (smi != null) {
            smi.enviarMensagem();
            smi.receberMensagem();
        } else {
            System.out.println("Erro: Nenhum serviço de mensagem foi selecionado.");
        }
    }
}