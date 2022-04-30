package br.edu.ifpb;

import java.util.ArrayList;

public class CatalogoLivros
{
    private ArrayList<Livro> Livros;
    private int qntLivros;

    ////construtores

    public CatalogoLivros(){
        this.Livros= new ArrayList<Livro>();
        this.qntLivros = 0;
    }

    ///////////

    public boolean addLivro(String nome,String Autor,String genero){
        if(nome==" "||Autor==" "||genero == " "){
            return false;
        }
        Livro livro = new Livro(nome,Autor);

        livro.setNome(nome);
        livro.setAutor(Autor);

        Livros.add(livro);
        this.qntLivros+=1;
        return true;
    }

    public boolean removeLivro(){

    }

}
