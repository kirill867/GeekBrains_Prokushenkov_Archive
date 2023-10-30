package lesson_4.task4;

public class progarm {
    public static void main(String[] args) {
        DataContainer<String> containerString = new DataContainer<>();
        containerString.add("zzz");
        containerString.add("nnn");
        containerString.add("fff");
        containerString.add("aaa");

        System.out.printf("Элемент под интексом 2: %s\n", containerString.get(2));
        containerString.sort();
        containerString.print();

        DataContainer<Integer> containerInteger = new DataContainer<>();
        containerInteger.add(5);
        containerInteger.add(7);
        containerInteger.add(11);
        containerInteger.add(8);
        containerInteger.add(2);
        containerInteger.add(15);

        containerInteger.sort(true);
        containerInteger.print();
    }
}
