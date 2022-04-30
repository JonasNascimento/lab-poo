package br.com.jogo;

public class LutSUMO extends Personagem implements Fala{
    @Override
    public void desenhar() {}

    public void falar(){
        System.out.println("Sou o Lutador UURRGH");
    }
}
