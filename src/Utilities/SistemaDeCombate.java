package Utilities;

import Entities.Inimigos.Inimigos;
import Entities.itens.Inventario;
import Entities.itens.Item;
import Entities.personagens.Personagem;

import java.util.Scanner;

public class SistemaDeCombate {

    private final Scanner sc;

    public SistemaDeCombate() {
        this.sc = new Scanner(System.in);
    }

    public void iniciarCombate(Personagem jogador, Inimigos inimigo, MissaoCombate missao) {

        System.out.println("\n⚔️  COMBATE INICIADO!");
        System.out.println(jogador.getNome() + " vs " + inimigo.getNome());
        System.out.println("================================");

        while (jogador.estaVivo() && inimigo.estaVivo()) {

            // Turno do jogador
            System.out.println("\n--- Seu turno ---");
            System.out.println("1 - Atacar");
            System.out.println("2 - Habilidade Especial");
            System.out.println("3 - Usar Item");
            System.out.println("4 - Ver Status");
            System.out.print("Escolha: ");

            int acao = sc.nextInt();

            switch (acao) {
                case 1:
                    jogador.atacar(inimigo);
                    break;
                case 2:
                    jogador.habilidadeEspecial(inimigo);
                    break;
                case 3:
                    usarItem(jogador);
                    break;
                case 4:
                    jogador.mostrarStatus();
                    break;
                default:
                    System.out.println("Ação inválida! Turno perdido.");
            }

            // Verifica se inimigo morreu
            if (!inimigo.estaVivo()) {
                System.out.println("\n💀 " + inimigo.getNome() + " foi derrotado!");
                if (missao != null) {
                    missao.registrarVitoria();
                    missao.verificarProgresso();
                    if (missao.estaCompleta()) {
                        missao.concluir(jogador);
                    }
                }
                return;
            }

            // Turno do inimigo
            System.out.println("\n--- Turno do " + inimigo.getNome() + " ---");
            inimigo.atacar(jogador);

            // Verifica se jogador morreu
            if (!jogador.estaVivo()) {
                System.out.println("\n💀 " + jogador.getNome() + " foi derrotado. Game Over!");
                return;
            }
        }
    }

    private void usarItem(Personagem jogador) {
        Inventario<Item> inventario = jogador.getInventario();

        if (inventario.estaVazio()) {
            System.out.println("Inventário vazio!");
            return;
        }

        System.out.println("\n--- Inventário ---");
        inventario.mostrarItens();
        System.out.print("Escolha o item: ");
        int indice = sc.nextInt();
        Item item = inventario.getItem(indice);

        if (item != null) {
            item.usar(jogador);
            inventario.removerItem(indice);
        }
    }
}