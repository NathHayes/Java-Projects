import java.util.ArrayList;

public class BookShelf {
    private char shelfLetter;
    private ArrayList<Book> books;

    public BookShelf(char shelfLetter) {
        this.shelfLetter = shelfLetter;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book.toString().charAt(0) == shelfLetter && books.size() < 8) {
            books.add(book);
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public String toString() {
        if (books.isEmpty()) {
            return "Empty";
        }
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.toString()).append("   ");
        }
        return sb.toString().trim();
    }
}