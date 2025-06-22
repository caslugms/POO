package model;

import java.util.*;

public class Analista implements Usuario {
    private String nome;
    private List<Analise> analises;

    public Analista(String nome) {
        this.nome = nome;
        this.analises = new ArrayList<>();
    }

    public void adicionarAnalise(Analise a) {
        analises.add(a);
    }

    public Iterator<Analise> getAnalises() {
        return analises.iterator();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Analista: " + nome);
    }
}
