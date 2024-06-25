package Q3;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
    private Stack<Book<T>> books;   //Book 객체 저장하는 Stack

    public BookStack(){
        books = new Stack<>();
    }

    public void pushBook(Book<T> book){
        books.push(book);
    }

    public Book<T> popBook(){
        if(books.empty()){
            throw new EmptyStackException();
        }
        return books.pop();
    }

    public Book<T> peekBook(){
        if(books.empty()){
            throw new EmptyStackException();
        }
        return books.peek();
    }

    public boolean isEmpty(){
        if (books.empty()){
            return true;
        }
        return false;
    }
}
