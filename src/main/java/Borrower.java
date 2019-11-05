import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int collection() {
        return this.collection.size();
    }

    public void borrowBookFromLibrary(Library library) {
        Book borrowedBook = library.loanOutBook();
        this.collection.add(borrowedBook);
    }
}
