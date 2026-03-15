package Entities.personagens;

import Interfaces.Combatente;

import java.util.Random;

public class Arqueiro extends Personagem {

    private final int chanceCritico;
    private final Random random;

    public Arqueiro(String nome) {
        super(nome, 70, 70, 30, 13);
        this.chanceCritico = 30;
        this.random = new Random();
    }

    public void atacar(Combatente alvo) {
        int rolagem = this.random.nextInt(100);
        if (rolagem < this.chanceCritico) {
            System.out.println(" acertou um ataque CRÍTICO!");
            alvo.receberDano(getDano() * 2);
        } else {
            System.out.println(getNome() + " acertou uma flecha! ");
            alvo.receberDano(getDano());
        }
    }

    @Override
    public void habilidadeEspecial(Combatente alvo) {

        System.out.println(getNome() + " usou sua habiliade chuva de flechas ");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Flecha " + i + ": ");
            alvo.receberDano(getDano());
            int rolagem = this.random.nextInt(100);
            if (rolagem < this.chanceCritico) {
                System.out.println(" acertou um ataque CRÍTICO!");
                alvo.receberDano(getDano() * 2);
            }
        }
    }

    public void mostrarStatus() {
        super.mostrarStatus();
        System.out.println("Chance de crítico: " + chanceCritico + "%");
        System.out.println("=================================");
        System.out.println("Classe: Arqueiro");
        System.out.println("=================================");
    }
}
