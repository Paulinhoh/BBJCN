package edu.paulinhoh.poo.abstracaoencapsulamento.exercicios.carro;

public class Carro {

    private boolean carroLigado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.carroLigado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligarCarro() {
        if (this.carroLigado) {
            System.out.println("O carro já está ligado!");
            return;
        }

        System.out.println("Carro ligado!");
        this.carroLigado = true;
    }

    public void desligarCarro() {
        if (!this.carroLigado) {
            System.out.println("O carro já está desligado!");
            return;
        }

        if (this.velocidade > 0 && this.marcha > 0) {
            System.out.println("O carro está em movimento, desacelere para desligar!");
            return;
        }

        System.out.println("Carro desligado!");
        this.carroLigado = false;
    }

    public void acelerar() {
        if (!this.carroLigado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (this.velocidade == 120) {
            System.out.println("Velocidade maxima atingida!");
            return;
        }

        this.velocidade++;
        mudarMarcha();
        System.out.println("Velocidade atual: " + this.velocidade);
    }

    public void freiar() {
        if (!this.carroLigado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (this.velocidade == 0) {
            System.out.println("O carro já está parado!");
            return;
        }

        this.velocidade--;
        mudarMarcha();
        System.out.println("Velocidade atual: " + this.velocidade);
    }

    public void mudarMarcha() {
        if (this.velocidade == 0) {
            this.marcha = 0;
        } else if (this.velocidade > 0 && this.velocidade <= 20) {
            this.marcha = 1;
        } else if (this.velocidade > 20 && this.velocidade <= 40) {
            this.marcha = 2;
        } else if (this.velocidade > 40 && this.velocidade <= 60) {
            this.marcha = 3;
        } else if (this.velocidade > 60 && this.velocidade <= 80) {
            this.marcha = 4;
        } else if (this.velocidade > 80 && this.velocidade <= 100) {
            this.marcha = 5;
        } else if (this.velocidade > 100 && this.velocidade <= 120) {
            this.marcha = 6;
        }
    }

    public void verificarMarcha() {
        System.out.println("A marcha atual é: " + this.marcha);
    }

    public void virarEsquerda() {
        if (!this.carroLigado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (this.velocidade == 0) {
            System.out.println("O carro está parado!");
        } else if (this.velocidade > 40) {
            System.out.println("O carro está muito rapido!");
        } else {
            System.out.println("Virando para a esquerda...");
        }
    }

    public void virarDireita() {
        if (!this.carroLigado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (this.velocidade == 0) {
            System.out.println("O carro está parado!");
        } else if (this.velocidade > 40) {
            System.out.println("O carro está muito rapido!");
        } else {
            System.out.println("Virando para a direita...");
        }
    }

}