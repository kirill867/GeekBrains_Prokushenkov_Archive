package lesson_5.calculate;

import java.util.Scanner;

public class Welcome { // view - работает спользователем

    Scanner console;

    public Welcome() {
       console = new Scanner(System.in);
    }

    public String[] UserDialog(String avalibleOperation) {
        String[] result = new String[3];
        System.out.println("Введите первую операнду или q для выхода: ");
        result[0] = console.nextLine();
        if (!result[0].equals("q")) {
            System.out.printf("Введите операцию %s или q: ", avalibleOperation);
            result[1] = console.nextLine();
            if (!result[1].equals("q")) {
                System.out.println("Введите Вторую операнду: ");
                 result[2] = console.nextLine();
            }
        }
        return result;      
    }

    public void PrintResult(Double value) {
        System.out.printf("Результат: %f\n", value);
    }

    public void PrintError(String msg) {
        System.out.println(msg);
    }
}
