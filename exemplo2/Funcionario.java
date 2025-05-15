package exemplo2;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Funcionário responsável: " + getNome() + " - Cargo: " + cargo);
    }
}
