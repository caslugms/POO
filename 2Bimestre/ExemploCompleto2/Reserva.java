import java.time.LocalDate;

public class Reserva{
    private String nomeCliente;
    private int numeroHospedes;
    private LocalDate dataEntrada;
    private TipoQuarto tipoQuarto;

    public Reserva(String nomeCliente, int numeroHospedes, LocalDate dataEntrada, TipoQuarto tipoQuarto) {
        this.nomeCliente = nomeCliente;
        this.numeroHospedes = numeroHospedes;
        this.dataEntrada = dataEntrada;
        this.tipoQuarto = tipoQuarto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public int getNumeroHospedes() {
        return numeroHospedes;
    }
}
