public class Aluno extends Usuario {
    private String matricula;

    public Aluno(String nome, String email, Endereco endereco, String matricula) {
        super(nome, email, endereco);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        imprimir();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Livros emprestados:");
        for (int i = 0; i < getLivrosEmprestados().size(); i++) {
            getLivrosEmprestados().get(i).imprimir();
        }
    }
}