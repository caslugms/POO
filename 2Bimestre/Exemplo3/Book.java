import java.time.LocalDate;

public class Book extends Publication {
    private String author;
    private Integer pages;
    private BookCategory category;
    private LocalDate registrationDate;
    private Publisher publisher;

    public Book(String title, String author, Integer pages, BookCategory category, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.category = category;
        this.publisher = publisher;
        this.registrationDate = LocalDate.now();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void incrementPages(int extra) {
        this.pages += extra;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
