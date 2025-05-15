import java.util.ArrayList;

public abstract class Usuario implements Imprimivel {
    private String nome;
    private String email;
    private Endereco endereco; // composição
    private ArrayList<Livro> livrosEmprestados; // agregação

    public Usuario(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public abstract void exibirDados(); // método abstrato

    @Override
    public void imprimir() {
        System.out.println("Usuário: " + nome + ", Email: " + email + ", Endereço: " + endereco);
    }
}