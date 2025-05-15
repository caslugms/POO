public class Main {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua das Flores", "Cascavel");
        Endereco end2 = new Endereco("Rua das Palmeiras", "Toledo");

        Aluno aluno = new Aluno("Lucas", "lucas@email.com", end1, "A001");
        Professor prof = new Professor("Odair", "odair@ifpr.edu.br", end2, "Informática");

        Livro livro1 = new Livro("POO na prática", "José Silva");
        Livro livro2 = new Livro("Java para Iniciantes", "Maria Souza");

        aluno.adicionarLivro(livro1);
        prof.adicionarLivro(livro2);

        System.out.println("DADOS DO ALUNO:");
        aluno.exibirDados();

        System.out.println("\nDADOS DO PROFESSOR:");
        prof.exibirDados();
    }
}