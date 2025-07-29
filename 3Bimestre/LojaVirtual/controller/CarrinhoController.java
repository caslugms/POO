import view.CarrinhoView;
import model.Carrinho;

public class CarrinhoController {
    private Carrinho modeloCarrinho = null;
    private CarrinhoView view;

    public CarrinhoController(Carrinho modeloCarrinho, CarrinhoView view) {
        this.modeloCarrinho = modeloCarrinho;
        this.view = view;
    }
    public CarrinhoController() {
        this.modeloCarrinho = null;
        this.view = null;
    }
    public Carrinho getModeloCarrinho() {
        return modeloCarrinho;
    }
    public void setModeloCarrinho(Carrinho modeloCarrinho) {
        this.modeloCarrinho = modeloCarrinho;
    }
    public CarrinhoView getView() {
        return view;
    }
    public void setView(CarrinhoView view) {
        this.view = view;
    }

    public void adicionarProdutoCarrinho(Produto produto){
        modeloCarrinho.adicionarProduto(produto);
    }

    public void removerProdutoCarrinho(Produto produto){
        modeloCarrinho.removerProduto(produto);;
    }

    public void calcularTotalCarrinho(){
        modeloCarrinho.calcularTotal(modeloCarrinho.getProdutos());
    }

    public void updateView(){
        view.imprimirDetalhesDoCarrinho(modeloCarrinho);
    }
}
