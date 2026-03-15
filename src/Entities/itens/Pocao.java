package Entities.itens;

import Entities.personagens.Personagem;

public class Pocao extends Item {

    private final int cura;

    public Pocao(String nome, int cura) {
        super(nome, "Restaura " + cura + " pontos de vida");
        this.cura = cura;
    }

    @Override
    public void usar(Personagem alvo) {
        System.out.println(alvo.getNome() + " usou " + getNome() + "!");
        alvo.setVida(alvo.getVida() + cura);
        System.out.println("+" + cura + " de vida! (Vida: " + alvo.getVida() + "/" + alvo.getVidaMax() + ")");
    }
}