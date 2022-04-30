package br.edu.ifpb;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Objects;

public class Cidade implements Comparable<Cidade> {
    private String nome;
    private String sigla;
    private String codigo;


    Cidade(String nome,String sigla,String codigo){
        this.nome = nome;
        this.sigla = sigla;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public java.lang.String toString() {
        return "Cidade{" +
                "nome=" + nome +
                ", sigla=" + sigla +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return Objects.equals(nome, cidade.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo( Cidade o )
    {
        return String.compare(this.getNome(), o.getNome() );
    }
}
