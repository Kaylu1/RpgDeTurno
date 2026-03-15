package Entities.Inimigos;

import Interfaces.Combatente;

public class Goblin extends Inimigos {

    public Goblin() {
        super("Goblin", 50, 50, 35, 2);
    }

    @Override
    public void atacar(Combatente alvo) {
        System.out.println("Goblin deu um ataque rapido");
        alvo.receberDano(getDano());
    }

    @Override
    public void habilidadeEspecial(Combatente alvo) {
        System.out.println("Goblin te deu um golpe com a adaga");
        alvo.receberDano(getDano() * 2);
    }
}
