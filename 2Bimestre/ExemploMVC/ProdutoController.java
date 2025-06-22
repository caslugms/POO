public class ProdutoController {
    private ProdutoModel model;
    private ProdutoView view;

    public ProdutoController(ProdutoModel model, ProdutoView view) {
        this.model = model;
        this.view = view;
    }

    public void setNomeProduto(String nome) {
        model.setNome(nome);
    }

    public void setPrecoProduto(double preco) {
        model.setPreco(preco);
    }

    public void atualizarView() {
        view.exibirDetalhesDoProduto(model.getNome(), model.getPreco());
    }
}
