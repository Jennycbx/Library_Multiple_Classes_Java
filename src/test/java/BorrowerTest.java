import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Borrower borrower;
    Books book;

    @Before
    public void setUp() {
        borrower = new Borrower();
    }

    @Test
    public void itemsInCollection() {
        assertEquals(0, borrower.numberOfItems());
    }



//    @Test
//    public void canBorrowBook() {
//        library.addBook(book);
//        borrower.borrowBook(book);
//        assertEquals(1, borrower.numberOfItems());
//    }
}


