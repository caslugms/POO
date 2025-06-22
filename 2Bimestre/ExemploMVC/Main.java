public class Main {
    public static void main(String[] args) {
        // Criando o produto (Model)
        ProdutoModel produto = new ProdutoModel("Caneta Azul", 2.50);

        // Criando a visualização (View)
        ProdutoView view = new ProdutoView();

        // Criando o controlador (Controller)
        ProdutoController controller = new ProdutoController(produto, view);

        // Exibir produto original
        controller.atualizarView();

        // Alterar dados do produto
        controller.setNomeProduto("Lápis Preto");
        controller.setPrecoProduto(1.99);

        // Exibir produto atualizado
        controller.atualizarView();
    }
}
