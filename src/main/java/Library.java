import java.util.ArrayList;

public class Library {

    public ArrayList<Books> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Books>();
        this.capacity = capacity;
    }

    public int numberOfBooks() {
        return this.books.size();
    }

    public void addBook(Books book) {
        this.books.add(book);
    }
    
    public void checkCapacityBeforeAddingBook(Books book) {
        if (this.books.size() < this.capacity) {
            this.books.add(book);
        }
    }
}
