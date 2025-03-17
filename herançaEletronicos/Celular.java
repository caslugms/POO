package herançaEletronicos;

public class Celular extends Eletronicos {
    
    private int bateria;
    private int tamTela;
    private boolean tem5G;
    private int qntCam;
    private int versSO;


    public Celular() {
        super();
        this.bateria = 0;
        this.tamTela = 0;
        this.tem5G = false;
        this.qntCam = 0;
        this.versSO = 0;
    }

    
    public Celular(String nome, String marca, String modelo, int anoFab, int preco, int peso,
            boolean conetavelComBluetooth, boolean conetavelComWiFi, int bateria, int tamTela, boolean tem5g,
            int qntCam, int versSO) {
        super(nome, marca, modelo, anoFab, preco, peso, conetavelComBluetooth, conetavelComWiFi);
        this.bateria = bateria;
        this.tamTela = tamTela;
        tem5G = tem5g;
        this.qntCam = qntCam;
        this.versSO = versSO;
    }


    public int getBateria() {
        return bateria;
    }
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    public int getTamTela() {
        return tamTela;
    }
    public void setTamTela(int tamTela) {
        this.tamTela = tamTela;
    }
    public boolean isTem5G() {
        return tem5G;
    }
    public void setTem5G(boolean tem5g) {
        tem5G = tem5g;
    }
    public int getQntCam() {
        return qntCam;
    }
    public void setQntCam(int qntCam) {
        this.qntCam = qntCam;
    }
    public int getVersSO() {
        return versSO;
    }
    public void setVersSO(int versSO) {
        this.versSO = versSO;
    }

}
