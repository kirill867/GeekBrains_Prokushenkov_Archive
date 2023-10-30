package lesson_4.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataContainer<T extends Comparable> {
    private List<T> Container;

    DataContainer() {
        Container = new ArrayList<>();
    }

    void add(T value) {
        Container.add(value);
    }

    T get(int index) {
        return Container.get(index);
    }

    void sort() {
        Collections.sort(Container);
    }

    void sort(Boolean descending) {
        if (descending) {
            Collections.sort(Container);
            Collections.reverse(Container);
        }
        else {
            sort();
        }
    }

    void print() {
        System.out.println("Содержимое контенера: ");
        for (T item : Container) {
            System.out.println(item);
        }
    }
}
