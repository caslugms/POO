import java.util.ArrayList;
import java.util.List;

public class MVCPatternBook {
    public static void main(String[] args) {
        Publisher editora = new Publisher("Editora Vida", "São Paulo");

        Book livro = new Book("Java Básico", "Maria Silva", 300, BookCategory.TECHNOLOGY, editora);
        BookView view = new BookView();
        BookController controller = new BookController(livro, view);

        System.out.println("📘 Dados do livro original:");
        controller.updateView();

        // Alterando dados
        controller.setBookTitle("Java Avançado");
        controller.setBookAuthor("Carlos Souza");
        controller.addExtraPages(50);
        controller.setBookCategory(BookCategory.SCIENCE);

        System.out.println("\n📗 Dados do livro atualizados:");
        controller.updateView();

        // Criando bibliotecário
        List<Book> livrosDoBib = new ArrayList<>();
        livrosDoBib.add(livro);
        livrosDoBib.add(new Book("História do Mundo", "Ana Costa", 150, BookCategory.HISTORY, editora));

        Librarian bib = new Librarian("Joana", livrosDoBib);
        System.out.println("\n📚 Listando livros do bibliotecário:");
        bib.listBooks();
    }
}
