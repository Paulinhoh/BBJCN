package edu.paulinhoh.poo.pilares.exemplos.apps;

public class TelegramMessenger extends ServicoMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        // valida conexão com a internet
        validarConectadoInternet();

        System.out.println("Enviando mensagem pelo Telegram...");

        // salvar historico da mensagem
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram...");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens...");
    }
}
