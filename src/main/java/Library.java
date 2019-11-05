import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int getBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.getBooks() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book loanOutBook(){
        return this.books.remove(0);
    }
}
