package Entities.Inimigos;

import Interfaces.Combatente;

public abstract class Inimigos implements Combatente {

    private String nome;
    private int vida;
    private int vidaMax;
    private int dano;
    private int defesa;


    public Inimigos() {
    }

    public Inimigos(String nome, int vida, int vidaMax, int dano, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMax = vidaMax;
        this.dano = dano;
        this.defesa = defesa;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}



