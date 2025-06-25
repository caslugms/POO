public class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void setBookTitle(String title) {
        model.setTitle(title);
    }

    public void setBookAuthor(String author) {
        model.setAuthor(author);
    }

    public void setBookPages(Integer pages) {
        model.setPages(pages);
    }

    public void addExtraPages(int extra) {
        model.incrementPages(extra);
    }

    public void setBookCategory(BookCategory cat) {
        model.setCategory(cat);
    }

    public void setPublisher(Publisher publisher) {
        model.setPublisher(publisher);
    }

    public void updateView() {
        view.printBookDetails(model);
    }
}
