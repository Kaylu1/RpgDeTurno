package Utilities;

import Entities.personagens.Arqueiro;
import Entities.personagens.Guerreiro;
import Entities.personagens.Mago;
import Entities.personagens.Personagem;

import java.util.Scanner;

public class PersonagemFactory {

    private Scanner sc;

    public PersonagemFactory() {
        this.sc = new Scanner(System.in);
    }

    public Personagem criarPersonagem() {
        System.out.println("Digite o nome do seu personagem: ");
        String nome = sc.nextLine();

        System.out.println("\nEscolha sua classe:");
        System.out.println("1 - Guerreiro  (Vida: 120 | Dano: 50 | Defesa: 25)");
        System.out.println("2 - Mago       (Vida: 70  | Dano: 40 | Defesa: 15)");
        System.out.println("3 - Arqueiro   (Vida: 70  | Dano: 30 | Defesa: 13)");
        System.out.print("\nSua escolha: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1: return new Guerreiro(nome);
            case 2: return new Mago(nome);
            case 3: return new Arqueiro(nome);
            default:
                System.out.println("Opção inválida! Guerreiro criado por padrão.");
                return new Guerreiro(nome);
        }
    }
}