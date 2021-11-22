package br.com.jogo;

public abstract class Personagem {
    Arma_IF arma;

    public abstract void desenhar();


    public void setArma(Arma_IF a){
        arma = a;
    }

    public void arma() {
        arma.usarArma();
    }

    public void falar(){
        System.out.println("\n");
    }
}
