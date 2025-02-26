package edu.paulinhoh.javabasico.exemplos;

public class SmartTv {
    // variaveis de classe (disponiveis em todos os metodos da classe)
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume < 50) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void aumentarCanal() {
        canal++;
    }
    
    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) { //novoCanal variavel local do metodo
        canal = novoCanal;
    }
}
