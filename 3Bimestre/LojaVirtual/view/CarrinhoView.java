public class CarrinhoView {
    public void imprimirDetalhesDoCarrinho(Carrinho carrinho) {
        try {
            System.out.println("Detalhes do Carrinho: ");
            System.out.println();
            System.out.println("Produtos no carrinho: ");
            listarProdutos(carrinho);
        } catch (NullPointerException e) {
            System.out.println("Erro ao exibir dados do carrinho, dados ausentes.");
        }
    }

    public void listarProdutos(Carrinho carrinho){
        for (int i = 0; i < carrinho.getProdutos().size(); i++) {
            System.out.println("Nome: " + carrinho.getListaProdutos().get(i).getNome() + " - R$" + carrinho.getListaProdutos().get(i).getPreco());
        }
    }
}
