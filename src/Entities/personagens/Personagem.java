package Entities.personagens;

import Entities.itens.Inventario;
import Interfaces.Combatente;
import Entities.itens.Item;
public abstract class Personagem implements Combatente {

    private String nome;
    private int vida;
    private int vidaMax;
    private int dano;
    private int defesa;
    private Inventario<Item> inventario;


    public Personagem(String nome, int vida, int vidaMax, int dano, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMax = vidaMax;
        this.dano = dano;
        this.defesa = defesa;
        this.inventario = new Inventario<>(); // ← confirma que essa linha está aqui
    }

    public abstract void atacar(Combatente alvo);

    public abstract void habilidadeEspecial(Combatente alvo);

    public void receberDano(int danoRecebido) {
        int danoFinal = Math.max(0, danoRecebido - defesa);
        vida -= danoFinal;
        System.out.println(nome + " recebeu " + danoFinal + " de dano!");
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void mostrarStatus() {
        System.out.println("=== " + getNome() + " ===");
        System.out.println("Vida: " + getVida() + "/" + getVidaMax());
        System.out.println("Dano: " + getDano());
        System.out.println("Defesa: " + getDefesa());
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public int getDano() {
        return dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    public void setDano(int dano) {
        this.dano = dano;
    }

    public Inventario<Item> getInventario() {
        return inventario;
    }
}
