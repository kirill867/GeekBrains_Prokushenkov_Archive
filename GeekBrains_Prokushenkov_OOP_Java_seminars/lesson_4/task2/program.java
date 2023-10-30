package lesson_4.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class program {

    private static <T> void printArray(ArrayList<T> testArray) {
        for (T item : testArray) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 7, 10, 0));
        ArrayList<String> strArray = new ArrayList<>(Arrays.asList("abc", "cba", "bac", "cab"));

        printArray(intArray);
        printArray(strArray);
    }
}
