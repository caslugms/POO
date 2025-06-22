package model;

import java.time.LocalDate;

public class Analise {
    private LocalDate data;
    private Double ph;
    private TipoAnalise tipo;
    private Poco poco;

    public Analise(LocalDate data, Double ph, TipoAnalise tipo, Poco poco) {
        if (ph < 0 || ph > 14) {
            throw new IllegalArgumentException("pH fora da faixa válida (0-14).");
        }
        this.data = data;
        this.ph = ph;
        this.tipo = tipo;
        this.poco = poco;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getPh() {
        return ph;
    }

    public TipoAnalise getTipo() {
        return tipo;
    }

    public Poco getPoco() {
        return poco;
    }
}
