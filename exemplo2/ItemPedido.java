package exemplo2;

public class ItemPedido implements Cobravel {
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String descricao, int quantidade, double precoUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularValor() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return descricao + " x" + quantidade + " - R$" + calcularValor();
    }
}
