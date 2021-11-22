package br.com.jogo;

public class General extends Personagem implements Fala{
    @Override
    public void desenhar() {}

    public void falar(){
        System.out.println("Sou o General");
    }
}