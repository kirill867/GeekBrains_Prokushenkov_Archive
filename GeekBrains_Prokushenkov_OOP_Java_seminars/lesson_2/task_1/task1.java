package lesson_2.task_1;

public class task1 {
    public static void main(String[] args) {

    Owner ivan = new Owner("Иван");
    Owner o2 = new Owner("Дарья");

    Cat cat1 = new Cat();
    cat1.setName("Барсик");
    cat1.setAge(3);
    cat1.setNameOwner(ivan);

    Cat cat2 = new Cat();
    cat2.setName("Мурзик");
    cat2.setAge(4);
    cat2.setNameOwner(o2);


    cat1.greet();
    cat2.greet();


    }
}