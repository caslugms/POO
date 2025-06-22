import model.*;
import view.AnaliseView;
import controller.AnaliseController;

import java.time.LocalDate;

public class MainProjeto {
    public static void main(String[] args) {
        Poco p1 = new Poco("P001", "Zona Norte");
        Poco p2 = new Poco("P002", "Zona Sul");

        Analista analista = new Analista("João");

        AnaliseView view = new AnaliseView();
        AnaliseController controller = new AnaliseController(analista, view);

        try {
            Analise a1 = new Analise(LocalDate.now(), 7.0, TipoAnalise.QUIMICA, p1);
            Analise a2 = new Analise(LocalDate.now(), 8.5, TipoAnalise.FISICA, p2);
            analista.adicionarAnalise(a1);
            analista.adicionarAnalise(a2);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar análise: " + e.getMessage());
        } finally {
            System.out.println("Processo de criação de análises encerrado.\n");
        }

        analista.exibirInformacoes();
        controller.mostrarTodasAnalises();
    }
}
