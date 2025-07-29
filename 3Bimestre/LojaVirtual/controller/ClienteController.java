package controller;

import view.ClienteView;
import model.Cliente;

public class ClienteController {
    private Cliente modeloCliente = null;
    private ClienteView view;
    
    public ClienteController() {
        this.modeloCliente = null;
        this.view = null;
    }

    public ClienteController(Cliente modeloCliente, ClienteView view) {
        this.modeloCliente = modeloCliente;
        this.view = view;
    }

    public Cliente getModeloCliente() {
        return modeloCliente;
    }

    public void setModeloCliente(Cliente modeloCliente) {
        this.modeloCliente = modeloCliente;
    }

    public ClienteView getView() {
        return view;
    }

    public void setView(ClienteView view) {
        this.view = view;
    }

    public void adicionarProduto(Produto produto) {
        modeloCliente.adicionarProdutoAoCarrinho(produto);
    }

    public void removerProduto(Produto produto) {
        modeloCliente.removerProdutoDoCarrinho(produto);
    }

    public void updateView(){
        view.imprimirDetalhesDoCliente(modeloCliente);
    }
}