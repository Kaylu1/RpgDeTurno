package Entities.personagens;
import Interfaces.Combatente;


public class Mago extends Personagem {

    private int mana;
    private final int manaMax;

    public Mago(String nome) {
        super(nome, 70, 70, 40, 15);
        this.manaMax = 100;
        this.mana = 100;
    }

    public void atacar(Combatente alvo) {

        System.out.println(getNome() + " lança uma bola de fogo");
        alvo.receberDano(getDano());
        System.out.println(alvo.getNome() + " Recebeu o ataque");
    }

    public void habilidadeEspecial(Combatente alvo) {

        if (mana >= 40) {
            System.out.println(getNome() + " Usou sua habilidade ancestral ");
            alvo.receberDano(getDano() * 2);
            mana -= 40;
            System.out.println("Após esse golpe sua mana restante é " + mana + "/" + manaMax);
        } else
            System.out.println(getNome() + " Não tem mana suficiente para esse ataque ");

    }

    @Override
    public void mostrarStatus() {
        super.mostrarStatus();
        System.out.println("Mana: " + mana + "/" + manaMax);
        System.out.println("=================================");
        System.out.println("Classe : Mago");
        System.out.println("=================================");
    }


}
