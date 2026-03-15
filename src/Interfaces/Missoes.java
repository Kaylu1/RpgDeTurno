package Interfaces;

import Entities.personagens.Personagem;

public interface Missoes {

    void iniciar();

    void verificarProgresso();

    void concluir(Personagem jogador);

    boolean estaCompleta();


}
