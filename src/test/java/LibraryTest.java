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
        library = new Library();
        book = new Books("Harry Potter", "J.K.Rowling", "Fantasy");
        book1 = new Books("Cooking", "Gordon Ramsay", "Educational");
        book2 = new Books("Me Before You", "JoJo Moyes", "Romance");
    }

    @Test
    public void booksInLibrary() {
        assertEquals(0, library.numberOfBooks());
    }
}
