import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before() {
        book1 = new Book("Harry Potter 1", "JK Rowling", "Fiction");
        book2 = new Book("LOTR", "JRR Tolken", "Fantasy Nonscense");
        book3 = new Book("War and Peace", "Leo Tolstoy", "Long Nonscense");
        book4 = new Book("Moby Dick", "Herman Melville", "Other Nonscense");
        library = new Library(3);
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.getBooks());
    }

    @Test
    public void canAddBooksToLibrary() {
        assertEquals(1, library.getBooks());
    }

    @Test
    public void cantAddBooksIfLibraryFull() {
        library.addBook(book4);
        assertEquals(3, library.getBooks());
    }

    @Test
    public void canLoanOutBook() {
        library.loanOutBook();
        assertEquals(2, library.getBooks());
    }
}
