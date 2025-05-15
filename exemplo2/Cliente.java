package exemplo2;

public class Cliente extends Pessoa {
    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Recibo emitido para cliente: " + getNome());
    }
}
