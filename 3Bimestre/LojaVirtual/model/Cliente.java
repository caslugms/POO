
public class Cliente {
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String cpf;
    private Carrinho carrinho;

    public Cliente() {
        this.nome = null;
        this.email = null;
        this.endereco = null;
        this.telefone = null;
        this.cpf = null;
    }

    public Cliente(String nome, String email, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void adicionarProdutoAoCarrinho(Produto produto) {
        carrinho.adicionarProduto(produto);
    }

    public void removerProdutoDoCarrinho(Produto produto) {
        carrinho.removerProduto(produto);
    }
}
