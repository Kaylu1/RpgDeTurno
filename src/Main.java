import Entities.Inimigos.Goblin;
import Entities.Inimigos.Orc;
import Entities.itens.Arma;
import Entities.itens.Pocao;
import Entities.personagens.Personagem;
import Utilities.MissaoCombate;
import Utilities.PersonagemFactory;
import Utilities.SistemaDeCombate;

public class Main {

    static void main(String[] args) {

        System.out.println("================================");
        System.out.println("       ⚔️  RPG DO DIGÃO ⚔️      ");
        System.out.println("================================\n");


        PersonagemFactory factory = new PersonagemFactory();
        Personagem jogador = factory.criarPersonagem();


        jogador.getInventario().adicionarItem(new Pocao("Poção de Vida", 50));
        jogador.getInventario().adicionarItem(new Arma("Espada Reforçada", 10));

        jogador.mostrarStatus();

        MissaoCombate missao = new MissaoCombate(
                "Caçador de Entities.personagens.Inimigos.Inimigos",
                "Derrote os inimigos da floresta!",
                2,
                20
        );
        missao.iniciar();

        SistemaDeCombate combate = new SistemaDeCombate();

        System.out.println("\n--- Primeiro Inimigo ---");
        combate.iniciarCombate(jogador, new Goblin(), missao);

        if (jogador.estaVivo()) {
            System.out.println("\n--- Segundo Inimigo ---");
            combate.iniciarCombate(jogador, new Orc(), missao);
        }

        if (jogador.estaVivo()) {
            System.out.println("\n🏆 Parabéns " + jogador.getNome() + "! Você venceu!");
            jogador.mostrarStatus();
        }
    }
}