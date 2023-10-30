package lesson_3.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task3 {
    public static void main(String[] args) {

        Book b1 = new Book("Азбука","Автор Азбуки",true);
        Book b2 = new Book("Букварь", "Автор Букваря", true );
        Book b3 = new Book("Сопротивление материалов", "Дарков А.В., Шпиро Г.С.", true);

        List<Book> books = new ArrayList<>();
        books.add(b3);
        books.add(b1);
        books.add(b2);

       // Collections.sort(books);
       // System.out.println(books);

    }
}
