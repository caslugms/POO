public class ClienteView {
    public void imprimirDetalhesDoCliente(Cliente cliente) {
        try {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("CPF: " + cliente.getCpf());
        } catch (NullPointerException e) {
            System.out.println("Erro ao exibir dados do cliente, dados ausentes.");
        }
    }
}
