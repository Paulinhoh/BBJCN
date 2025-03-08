package edu.paulinhoh.poo.pilares.exemplos.apps;

public class FacebookMessenger extends ServicoMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        // valida conexão com a internet
        validarConectadoInternet();

        System.out.println("Enviando mensagem pelo Facebook...");

        // salvar historico da mensagem
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook...");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens...");
    }
}
