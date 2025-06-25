import java.util.List;

public class Librarian {
    private String name;
    private List<Book> books;

    public Librarian(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void listBooks() {
        System.out.println("Livros do bibliotecário " + name + ":");
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}
