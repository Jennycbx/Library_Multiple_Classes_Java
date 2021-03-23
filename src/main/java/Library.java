import java.util.ArrayList;

public class Library {

    private ArrayList<Books> books;

    public Library() {
        this.books = new ArrayList<Books>();
    }

    public int numberOfBooks() {
        return this.books.size();
    }

    public void addBook(Books book) {
        this.books.add(book);
    }
}
