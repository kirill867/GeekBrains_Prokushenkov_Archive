package OOP_Java__Prokushenkov_seminars.lesson_7;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    public double inputValue(String title){
        System.out.printf("%s", title);
        return in.nextDouble();
    }
    public char inputOperationSign(String title){
        System.out.printf("%s", title);
        return in.next(".").charAt(0);
    }
}
