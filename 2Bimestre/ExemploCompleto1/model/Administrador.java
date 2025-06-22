package model;
public class Administrador implements Usuario {
    private String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Administrador: " + nome);
    }
}
