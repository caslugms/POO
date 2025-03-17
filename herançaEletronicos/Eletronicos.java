package herançaEletronicos;

public class Eletronicos {
    
    private String nome;
    private String marca;
    private String modelo;
    private int anoFab;
    private int preco;
    private int peso;
    private boolean conetavelComBluetooth;
    private boolean conetavelComWiFi;


    public Eletronicos() {
        this.nome = null;
        this.marca = null;
        this.modelo = null;
        this.anoFab = 0;
        this.preco = 0;
        this.peso = 0;
        this.conetavelComBluetooth = false;
        this.conetavelComWiFi = false;
    }


    public Eletronicos(String nome, String marca, String modelo, int anoFab, int preco, int peso,
            boolean conetavelComBluetooth, boolean conetavelComWiFi) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.preco = preco;
        this.peso = peso;
        this.conetavelComBluetooth = conetavelComBluetooth;
        this.conetavelComWiFi = conetavelComWiFi;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFab() {
        return anoFab;
    }
    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public boolean isConetavelComBluetooth() {
        return conetavelComBluetooth;
    }
    public void setConetavelComBluetooth(boolean conetavelComBluetooth) {
        this.conetavelComBluetooth = conetavelComBluetooth;
    }
    public boolean isConetavelComWiFi() {
        return conetavelComWiFi;
    }
    public void setConetavelComWiFi(boolean conetavelComWiFi) {
        this.conetavelComWiFi = conetavelComWiFi;
    }
}
