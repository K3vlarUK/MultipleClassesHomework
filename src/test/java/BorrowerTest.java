import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Borrower borrower;

    @Before
    public void before() {
        borrower = new Borrower();
        book1 = new Book("Harry Potter 1", "JK Rowling", "Fiction");
        book2 = new Book("LOTR", "JRR Tolken", "Fantasy Nonscense");
        book3 = new Book("War and Peace", "Leo Tolstoy", "Long Nonscense");
        book4 = new Book("Moby Dick", "Herman Melville", "Other Nonscense");
        library = new Library(3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void testCollection() {
        assertEquals(0, borrower.collection());
    }

    @Test
    public void canBorrowBooks() {
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.collection());
    }
}
