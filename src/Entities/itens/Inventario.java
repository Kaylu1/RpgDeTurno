package Entities.itens;

import java.util.ArrayList;

public class Inventario<T> {

    private final ArrayList<T> itens;

    public Inventario() {
        this.itens = new ArrayList<>();
    }


    public void adicionarItem(T item) {
        itens.add(item);
        System.out.println("Entities.itens.Item adicionado ao inventário!");
    }

    public void removerItem(int indice) {
        if (indice >= 0 && indice < itens.size()) {
            itens.remove(indice);
        }
    }

    public T getItem(int indice) {
        if (indice < 0 || indice >= itens.size()) {
            System.out.println("Entities.itens.Item inválido!");
            return null;
        }
        return itens.get(indice);
    }

    public void mostrarItens() {
        if (itens.isEmpty()) {
            System.out.println("Inventário vazio!");
            return;
        }
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(i + " - " + itens.get(i));
        }
    }

    public boolean estaVazio() {
        return itens.isEmpty();
    }

    public int tamanho() {
        return itens.size();
    }
}