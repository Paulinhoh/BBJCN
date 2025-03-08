package edu.paulinhoh.poo.pilares.exemplos.apps;

public class MSNMessenger extends ServicoMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        // valida conexão com a internet
        validarConectadoInternet();

        System.out.println("Enviando mensagem pelo MSN Messenger...");

        // salvar historico da mensagem
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger...");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens...");
    }

}
