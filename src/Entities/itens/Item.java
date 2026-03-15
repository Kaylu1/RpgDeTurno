package Entities.itens;

import Entities.personagens.Personagem;

public abstract class Item {

    private final String nome;
    private final String descricao;

    public Item(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public abstract void usar(Personagem alvo);

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return nome + " - " + descricao;
    }
}