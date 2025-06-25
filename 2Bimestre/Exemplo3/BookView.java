public class BookView {
    public void printBookDetails(Book bookModel) {
        try {
            System.out.println("Título: " + bookModel.getTitle());
            System.out.println("Autor: " + bookModel.getAuthor());
            System.out.println("Páginas: " + bookModel.getPages());
            System.out.println("Categoria: " + bookModel.getCategory());
            System.out.println("Editora: " + bookModel.getPublisher().getName());
            System.out.println("Local: " + bookModel.getPublisher().getLocation());
            System.out.println("Data de registro: " + bookModel.getRegistrationDate());
        } catch (NullPointerException e) {
            System.out.println("Erro ao exibir dados do livro: dado ausente.");
        }
    }
}
