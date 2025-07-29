
public class MVCMain {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.00, "Notebook Dell Inspiron", 1, Categoria.ELETRONICOS);
        Produto produto2 = new Produto("Smartphone", 1500.00, "Smartphone Samsung Galaxy", 1, Categoria.ELETRONICOS);
        Produto produto3 = new Produto("Camiseta", 50.00, "Camiseta de algodão", 2, Categoria.ROUPAS);
        Cliente cliente = new Cliente("Lucas", "Lucas@gmaiul.com", "Rua A, 123", "1234567890", "123.456.789-00", carrinho);
    }
}
