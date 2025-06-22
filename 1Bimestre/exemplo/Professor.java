public class Professor extends Usuario {
    private String departamento;

    public Professor(String nome, String email, Endereco endereco, String departamento) {
        super(nome, email, endereco);
        this.departamento = departamento;
    }

    @Override
    public void exibirDados() {
        imprimir();
        System.out.println("Departamento: " + departamento);
        System.out.println("Livros emprestados:");
        for (Livro livro : getLivrosEmprestados()) {
            livro.imprimir();
        }
    }
}