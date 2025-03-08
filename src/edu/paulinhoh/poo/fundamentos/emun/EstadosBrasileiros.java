package edu.paulinhoh.poo.fundamentos.emun;

public enum EstadosBrasileiros {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    BAHIA ("BA", "Bahia"),
    PARANA ("PR", "Parana");

    private final String nome;
    private final String sigla;

    private EstadosBrasileiros(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}