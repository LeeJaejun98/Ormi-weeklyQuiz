package Q3;

import java.util.List;

public class BookShelf implements BookManager {

    private List<Book<T>> books;    // Book 객체를 저장하는 ArrayList

    public BookShelf(){

    }
    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        if (!books.isEmpty()){
            books.remove(book);
        }
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return null;
    }
}
