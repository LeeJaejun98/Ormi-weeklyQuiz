package Q3;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {

    private List<Book<T>> books;    // Book 객체를 저장하는 ArrayList
    private static final int EQUALS = 0;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book<T> book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book<T> book) {
        if (!books.isEmpty()){
            books.remove(book);
        }
    }

    @Override
    public List<Book<T>> searchByTitle(String title) {
        List<Book<T>> res = new ArrayList<>();
        for(Book<T> book: books){
            if(isTitleEqualsOrContains(book, title)){
                res.add(book);
            }
        }
        return res;
    }

    @Override
    public List<Book<T>> searchByAuthor(String author) {
        List<Book<T>> res = new ArrayList<>();
        for(Book<T> book : books){
            if(isAuthorEqualsOrContains(book, author)){
                res.add(book);
            }
        }
        return res;
    }

    private boolean isTitleEqualsOrContains(Book<T> book, String title){
        boolean equal = title.compareToIgnoreCase(book.getTitle()) == EQUALS;
        boolean contains = title.contains(book.getTitle());
        return equal || contains;
    }

    private boolean isAuthorEqualsOrContains(Book<T> book, String author){
        boolean equal = author.compareToIgnoreCase(book.getAuthor()) == EQUALS;
        boolean contains = author.contains(book.getAuthor());
        return equal || contains;
    }
}
