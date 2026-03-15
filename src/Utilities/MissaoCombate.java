package Utilities;

import Entities.personagens.Personagem;
import Interfaces.Missoes;

public class MissaoCombate implements Missoes {

    private final String nome;
    private final String descricao;
    private final int inimigosDerrotar;
    private int inimigosDerrotados;
    private final int recompensaVida;
    private boolean concluida;

    public MissaoCombate(String nome, String descricao, int inimigosDerrotar, int recompensaVida) {
        this.nome = nome;
        this.descricao = descricao;
        this.inimigosDerrotar = inimigosDerrotar;
        this.inimigosDerrotados = 0;
        this.recompensaVida = recompensaVida;
        this.concluida = false;
    }

    @Override
    public void iniciar() {
        System.out.println("=== Missão: " + nome + " ===");
        System.out.println(descricao);
        System.out.println("Meta: derrotar " + inimigosDerrotar + " inimigos");
    }

    @Override
    public void verificarProgresso() {
        System.out.println("Progresso: " + inimigosDerrotados + "/" + inimigosDerrotar);
    }

    @Override
    public void concluir(Personagem jogador) {
        System.out.println("✅ Missão " + nome + " concluída!");
        System.out.println("Recompensa: +" + recompensaVida + " de vida máxima!");
        jogador.setVida(jogador.getVida() + recompensaVida);
        concluida = true;
    }

    @Override
    public boolean estaCompleta() {
        return concluida;
    }

    public void registrarVitoria() {
        inimigosDerrotados++;
        if (inimigosDerrotados >= inimigosDerrotar) {
            concluida = true;
        }
    }

}