package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BookShelf<String> bookShelf= new BookShelf<String>();
        BookStack<Integer> bookStack = new BookStack<Integer>();

        System.out.println("도서 정보를 입력하세요.");
        System.out.println("제목: ");
        System.out.println("저자: ");

        System.out.println("식별자: ");

        Book book = new Book<>();
        sc.close();
    }
}
