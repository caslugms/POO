package herançaEletronicos;

public class Computador extends Eletronicos {

    private int tamTela;
    private String sistemaOp;
    private int frameRate;

    public Computador() {
        super();
        this.tamTela = 0;
        this.sistemaOp = null;
        this.frameRate = 0;
    }

    public Computador(String nome, String marca, String modelo, int anoFab, int preco, int peso,
            boolean conetavelComBluetooth, boolean conetavelComWiFi, int tamTela, String sistemaOp, int frameRate) {
        super(nome, marca, modelo, anoFab, preco, peso, conetavelComBluetooth, conetavelComWiFi);
        this.tamTela = tamTela;
        this.sistemaOp = sistemaOp;
        this.frameRate = frameRate;
    }

    public int getTamTela() {
        return tamTela;
    }

    public void setTamTela(int tamTela) {
        this.tamTela = tamTela;
    }

    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public int getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(int frameRate) {
        this.frameRate = frameRate;
    }

}
