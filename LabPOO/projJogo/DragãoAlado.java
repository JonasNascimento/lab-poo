package br.com.jogo;

public class DragãoAlado extends Personagem implements Fala{
    @Override
    public void desenhar() {}

    public void falar(){
        System.out.println("AAAAAAAAAARRRGH");
    }
}
