package br.edu.ifpb;

public class Livro {
    private String nome;
    private String autor;
    private int qntPaginas;
    private int qntCapitulos;
    private String genero;

    //Construtores
    public Livro(String nome,String autor){
        this.nome = nome;
        this.autor = autor;
    }

    public Livro(){
        this.nome = "Sem Nome";
        this.autor = "Sem Autor";
    }
    /////////////

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public boolean setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
