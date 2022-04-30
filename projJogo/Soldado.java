package br.com.jogo;

public class Soldado extends Personagem implements Fala{
    @Override
    public void desenhar() {}

    public void falar(){
        System.out.println("Sou o Soldado");
    }
}
