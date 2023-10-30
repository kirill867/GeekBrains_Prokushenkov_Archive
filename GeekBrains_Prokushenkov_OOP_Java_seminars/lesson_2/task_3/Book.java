package lesson_2.task_3;

public class Book implements I_Publications{

    private String title;
    private String author;
    private Boolean available;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }


    public void displayInfo() {
        if (available) System.out.println("Название - " + title + " , автор - " + author + " , книга доступна");
        else     System.out.println("Название - " + getTitle() + " , автор - " + getAuthor() + " , книга не доступна");
        }
    }
