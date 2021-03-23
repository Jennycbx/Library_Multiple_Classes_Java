import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    Library library;
    Books book;
    Books book1;
    Books book2;

    @Before
    public void setUp() {
        library = new Library(2);
        book = new Books("Harry Potter", "J.K.Rowling", "Fantasy");
        book1 = new Books("Cooking", "Gordon Ramsay", "Educational");
        book2 = new Books("Me Before You", "JoJo Moyes", "Romance");
    }

    @Test
    public void booksInLibrary() {
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void checkCapacityBeforeAddingBook() {
        library.checkCapacityBeforeAddingBook(book);
        library.checkCapacityBeforeAddingBook(book1);
        library.checkCapacityBeforeAddingBook(book2);
        assertEquals(2, library.numberOfBooks());
    }
}
