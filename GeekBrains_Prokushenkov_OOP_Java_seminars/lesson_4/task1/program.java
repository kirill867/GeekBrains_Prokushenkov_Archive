package lesson_4.task1;

public class program {

    private static <T> void printElement(T elem) {
        System.out.println(elem);
    }
    public static void main(String[] args) {
        String testElement1 = "String";
        Integer testElement2 = 999;
        Double testElement3 = 3.1459;

        printElement(testElement1);
        printElement(testElement2);
        printElement(testElement3);
    }
}