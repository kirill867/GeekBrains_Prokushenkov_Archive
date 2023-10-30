package lesson_2.task_3;

import java.util.ArrayList;

public class Library implements I_Storage, I_Building{
    private ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
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


    public void searchByAuthor (String bookAuthor){
        int i = 0;

        for (Book book : catalog){
            String [] words = book.getAuthor().split(" ");
            for (int j = 0; j < words.length; j++) {
                if (words[j].equalsIgnoreCase(bookAuthor)) {
                    book.displayInfo();
                    i++;
                }
            }
        }
       if (i<1) System.out.println("Книг автора " + bookAuthor + " не найдено.");

    }


    @Override
    public void displayAddress() {
        System.out.println("Какой-то адрес библиотеки!!!");
    }
}
