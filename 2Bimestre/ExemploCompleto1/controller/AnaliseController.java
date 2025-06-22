package controller;

import model.*;
import view.AnaliseView;
import java.util.Iterator;

public class AnaliseController {
    private Analista analista;
    private AnaliseView view;

    public AnaliseController(Analista analista, AnaliseView view) {
        this.analista = analista;
        this.view = view;
    }

    public void mostrarTodasAnalises() {
        Iterator<Analise> it = analista.getAnalises();
        while (it.hasNext()) {
            Analise a = it.next();
            view.exibirAnalise(a);
        }
    }
}
