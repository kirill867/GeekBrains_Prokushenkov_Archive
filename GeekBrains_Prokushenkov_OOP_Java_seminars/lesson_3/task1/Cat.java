package lesson_3.task1;

public class Cat implements I_Animal, Comparable<Cat> {

private String name;
private int age;
private String nameOwner;

    public String setNameOwner(Owner owner) {
        nameOwner = owner.getName();
        return nameOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void greet(){
        System.out.println("Мяу! Меня зовут "+ name + ". Мне " + age + " года(лет). Мой владелец - "
                + getNameOwner() + ".");

    }

    @Override
    public int compareTo(Cat o) {
        int o1 = this.getAge();
        int o2 = o.getAge();
        return Integer.compare(o1, o2);
    }

    public void print(){
        System.out.println("Кличка " + name + " Возраст " + age + ".");
    }
}