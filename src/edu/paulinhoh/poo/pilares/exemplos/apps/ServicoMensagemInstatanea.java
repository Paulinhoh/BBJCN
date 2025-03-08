package edu.paulinhoh.poo.pilares.exemplos.apps;

public abstract class ServicoMensagemInstatanea {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    // mais um metodo que todos os filhos deveram implementar
    public abstract void salvarHistoricoMensagem();

    // somente os filhos conhecem este método
    protected void validarConectadoInternet() {
        System.out.println("Validando conexão com a internet...");
    }
}
