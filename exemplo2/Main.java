package exemplo2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucas");
        Funcionario garcom = new Funcionario("Odair", "Garçom");

        Pedido pedido = new Pedido(cliente, garcom);

        pedido.adicionarItem(new ItemPedido("X-Burguer", 2, 15.0));
        pedido.adicionarItem(new ItemPedido("Refrigerante", 1, 6.0));
        pedido.adicionarItem(new ItemPedido("Porção de Batata", 1, 12.0));

        pedido.imprimirResumo();
    }
}
