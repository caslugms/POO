import java.util.List;

public class Librarian {
    private String name;
    private List<Book> books;

    public Librarian(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void listBooks() {
        System.out.println("Livros diponíveis na biblioteca " + name + " :");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
        }
    }
}
