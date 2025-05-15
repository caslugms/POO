package exemplo2;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private Funcionario atendente;
    private ArrayList<ItemPedido> itens;

    public Pedido(Cliente cliente, Funcionario atendente) {
        this.cliente = cliente;
        this.atendente = atendente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).calcularValor();
        }
        return total;
    }

    public void imprimirResumo() {
        System.out.println("----- PEDIDO -----");
        cliente.emitirRecibo();
        atendente.emitirRecibo();
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i));
        }
        System.out.println("TOTAL: R$ " + calcularTotal());
    }
}
