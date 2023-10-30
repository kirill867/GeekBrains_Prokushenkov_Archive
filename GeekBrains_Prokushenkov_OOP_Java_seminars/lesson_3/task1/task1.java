package lesson_3.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task1 {


    public static void main(String[] args) {


        I_FirstLetter<Owner> bigLet = (name) -> { // Использую функциональный интерфейс
            String lownm = name.getName().toLowerCase();
            String nm = lownm.substring(0, 1).toUpperCase() + lownm.substring(1);
            name.setName(nm);
            return name;
        };

        Owner ivan = new Owner("иВАН");
        ivan = bigLet.upperFirstletter(ivan);
        Owner o2 = new Owner("сВЕтлаНА");
        o2 = bigLet.upperFirstletter(o2);

        Cat cat1 = new Cat();
        cat1.setName("Барсик");
        cat1.setAge(3);
        cat1.setNameOwner(ivan);

        Cat cat2 = new Cat();
        cat2.setName("Мурзик");
        cat2.setAge(4);
        cat2.setNameOwner(ivan);

        Cat cat3 = new Cat();
        cat2.setName("Кот");
        cat2.setAge(10);
        cat2.setNameOwner(o2);

//        cat1.greet();
//        cat2.greet();
        List<Cat> cats = new ArrayList<>();
        cats.add(cat3);
        cats.add(cat2);
        cats.add(cat1);

        Collections.sort(cats);
        for (Cat cat : cats){
            cat.greet();
        }



    }
}
