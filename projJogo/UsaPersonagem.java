package br.com.jogo;

public class UsaPersonagem {
    public static void main(String[] args) {
        Personagem p;

        p=new Soldado();

        p.desenhar();
        p.setArma(new Revolver());
        p.arma();
        p.setArma(new Fuzil());
        p.arma();

        p = new LutSUMO();
        p.desenhar();
        p.setArma(new Desarmado());
        p.arma();

        p = new DragãoAlado();
        p.desenhar();
        p.setArma(new Fogo());
        p.arma();
        p.falar();
    }
}
