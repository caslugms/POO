import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos;
    private Double total;

    public Carrinho() {
        this.produtos = new ArrayList<Produto>();
        this.total = 0.0;
    }

    public Carrinho(Double total) {
        this.produtos = new ArrayList<Produto>();
        this.total = 0.0;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void calcularTotal(ArrayList<Produto> produtos) {
        total = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            total += produtos.get(i).getPreco();
        }
    }

    public ArrayList<Produto> getListaProdutos(){
        return produtos;
    }
}
