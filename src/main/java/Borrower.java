import java.util.ArrayList;
import java.util.Collection;

public class Borrower {

    public ArrayList<Collection> collection;
    public ArrayList<Books> books;
    public Library library;
    public Books book;

    public Borrower() {
        this.collection = new ArrayList<Collection>();
    }


    public int numberOfItems() {
       return this.collection.size();
    }


//    public void borrowBook(Books book) {
//        Collection item = library.removeBook();
//        this.collection.add(item);
//    }
}
