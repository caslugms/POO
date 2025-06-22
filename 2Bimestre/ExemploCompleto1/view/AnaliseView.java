package view;

import model.Analise;

public class AnaliseView {
    public void exibirAnalise(Analise a) {
        System.out.println("----- Análise -----");
        System.out.println("Data: " + a.getData());
        System.out.println("Tipo: " + a.getTipo());
        System.out.println("pH: " + a.getPh());
        System.out.println("Poço: " + a.getPoco().getCodigo() + " - " + a.getPoco().getLocalizacao());
        System.out.println("-------------------");
    }
}
