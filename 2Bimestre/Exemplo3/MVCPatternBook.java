import java.util.ArrayList;
import java.util.List;

public class MVCPatternBook {
    public static void main(String[] args) {
        Publisher editora = new Publisher("Editora IFPR", "Cascavel");

        Book livro = new Book("Prova Primeiro Bimestre", "Odair Moreira de Souza", 100, BookCategory.TECHNOLOGY, editora);

        BookView view = new BookView();
        BookController controller = new BookController(livro, view);

        System.out.println("Dados do livro original: ");
        controller.updateView();

        controller.setBookTitle("Prova Segundo Bimestre");
        controller.setBookAuthor("Ricardo da Rosa");
        controller.addExtraPages(50);
        controller.setBookCategory(BookCategory.SCIENCE);

        System.out.println();
        System.out.println("Dados do livro atualizados: ");
        controller.updateView();

        List<Book> listaLivros = new ArrayList<>();

        listaLivros.add(livro);

        listaLivros.add(new Book("As aventuras de Lucas", "Lucas Gabriel Machado da Silva", 200, BookCategory.HISTORY, editora));

        Librarian bib = new Librarian("Livraria da Taynara", listaLivros);

        System.out.println();
        System.out.println("Livros disponíveis na biblioteca: ");
        bib.listBooks();
    }
}
