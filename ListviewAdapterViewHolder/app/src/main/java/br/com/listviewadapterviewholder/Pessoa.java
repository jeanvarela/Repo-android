package br.com.listviewadapterviewholder;

/**
 * Created by JEAN on 11/05/2017.
 */

public class Pessoa {

    private String nome;
    private String idade;

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}