package Entities.Inimigos;

import Interfaces.Combatente;

public class Orc extends Inimigos {

    public Orc() {
        super("Orc", 80, 80, 50, 20);
    }

    @Override
    public void atacar(Combatente alvo) {
        System.out.println("Orc deu um golpe devastador!");
        alvo.receberDano(getDano());
    }

    @Override
    public void habilidadeEspecial(Combatente alvo) {
        System.out.println("Orc usou toda sua furia em um ataque com sua clava!");
        alvo.receberDano(getDano() * 2);
    }
}