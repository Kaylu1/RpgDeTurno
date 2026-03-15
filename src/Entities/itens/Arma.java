package Entities.itens;

import Entities.personagens.Personagem;

public class Arma extends Item {

    private final int bonusDano;

    public Arma(String nome, int bonusDano) {
        super(nome, "+" + bonusDano + " de dano");
        this.bonusDano = bonusDano;
    }

    @Override
    public void usar(Personagem alvo) {
        System.out.println(alvo.getNome() + " equipou " + getNome() + "!");
        alvo.setDano(alvo.getDano() + bonusDano);
        System.out.println("Dano aumentado para: " + alvo.getDano());
    }
}