package lesson_3.task2;

import java.util.*;

public class Library implements I_Storage, I_Building, Iterable<Book> {
    private ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
        catalog.sort(new BookComparator());
        }


    @Override
    public void removeBook(Book book) {
        catalog.remove(book);

    }

    public void displayAvailableBooks() {
        for (Book book : catalog) {
            if (book.getAvailable()) {
                book.displayInfo();

            }
        }
        System.out.println();
    }


    public void searchByAuthor(String bookAuthor) {
        int i = 0;

        for (Book book : catalog) {
            String[] words = book.getAuthor().split(" ");
            for (int j = 0; j < words.length; j++) {
                if (words[j].equalsIgnoreCase(bookAuthor)) {
                    book.displayInfo();
                    i++;
                }
            }
        }
        if (i < 1) System.out.println("Книг автора " + bookAuthor + " не найдено.");

    }

    @Override
    public void displayAddress() {
        System.out.println("Какой-то адрес библиотеки!!!");
    }




    @Override
    public Iterator<Book> iterator() {
        Iterator<Book> bookIterator = new Iterator<Book>() {
            int ind = 0;
            @Override
            public boolean hasNext() {
                return ind < catalog.size() ;
            }

            @Override
            public Book next() {
                return catalog.get(ind++);
            }
        };
        return bookIterator;
    }
}
