package lesson_2.task_3;

public class task3 {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.setTitle("Азбука");
        b1.setAuthor("Автор Азбуки");
        b1.setAvailable(true);

        Book b2 = new Book();
        b2.setTitle("Букварь");
        b2.setAuthor("Автор Букваря");
        b2.setAvailable(true);

        Book b3 = new Book();
        b3.setTitle("Сопротивление материалов");
        b3.setAuthor("Дарков А.В., Шпиро Г.С.");
        b3.setAvailable(true);

        Library myLib = new Library();
        myLib.addBook(b1);
        myLib.addBook(b2);
        myLib.addBook(b3);
        myLib.displayAvailableBooks();
        myLib.removeBook(b2);
        myLib.displayAvailableBooks();
        myLib.searchByAuthor("пушкин");
        myLib.displayAddress();

    }
}