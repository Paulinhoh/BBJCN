package edu.paulinhoh.poo.abstracaoencapsulamento.exercicios.banco;

public class ContaBanco {

    private double saldo;
    private double chequeEspecial;
    private boolean usandoChequeEspecial;
    private double limite;

    public ContaBanco(double saldo) {
        this.saldo = saldo;
        this.chequeEspecial = (saldo <= 500) ? 50 : saldo * 0.5;
        this.usandoChequeEspecial = false;
        this.limite = this.chequeEspecial;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    public void consultarChequeEspecial() {
        verificarChequeEspecial();
        System.out.println("Valor restante do cheque especial: " + this.chequeEspecial);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(" Dinheiro depositado com sucesso");
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println(" Dinheiro sacado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void pagarFatura(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Fatura paga com sucesso");
        } else if (valor > this.saldo && valor <= this.saldo + this.chequeEspecial) {
            var sobra = valor - this.saldo;
            this.saldo -= saldo;
            this.chequeEspecial -= sobra;

            this.usandoChequeEspecial = true;

            System.out.println("Fatura paga com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    private void verificarChequeEspecial() {
        if (this.usandoChequeEspecial) {
            System.out.println("Usando cheque especial");
            cobrarJuros();
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }

    private void cobrarJuros() {
        if (this.chequeEspecial != 0)
            return;

        System.out.println("Limite do cheque especial zerado");
        System.out.println("Taxa: R$" + this.limite * 0.2);
    }

}
