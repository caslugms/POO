import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();

        alunos.add("Lucas");
        alunos.add("Gabriela");
        alunos.add("João");
        alunos.add("Mariana");

        // Criando o Iterator
        Iterator<String> iterator = alunos.iterator();

        System.out.println("Lista de alunos:");

        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println("- " + nome);
        }
    }
}
