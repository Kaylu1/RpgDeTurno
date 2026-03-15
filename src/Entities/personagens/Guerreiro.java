package Entities.personagens;

import Interfaces.Combatente;

public class Guerreiro extends Personagem {


    public Guerreiro(String nome) {
        super(nome, 120, 120, 50, 25);
    }

    @Override
    public void atacar(Combatente alvo) {
        System.out.println(getNome() + "desferiu um ataque com sua espada ! ");
        alvo.receberDano(getDano());
    }

    @Override
    public void habilidadeEspecial(Combatente alvo) {
        System.out.println(getNome() + " usa Golpe Duplo!");
        alvo.receberDano(getDano());
        alvo.receberDano(getDano());
    }

    public void mostrarStatus() {
        super.mostrarStatus();
        System.out.println("=================================");
        System.out.println("Classe guerreiro");
        System.out.println("=================================");
    }
}
