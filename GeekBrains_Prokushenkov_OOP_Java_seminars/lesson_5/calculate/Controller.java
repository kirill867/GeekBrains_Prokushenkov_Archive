package lesson_5.calculate;

public class Controller { //Presenter - меняет модель по запросу пользователя
    private Welcome view;  // Эта часть работает с пользователем (view)
    private Calculate calc; // Эта произодит вычисления (модель)

    public Controller() {
        view = new Welcome();
        calc = new Calculate();
    }

    public void AppStart() {
        String[] primer;

        Boolean run = true;
        while (run) {
            primer = view.UserDialog(calc.getAvalibleOperation()); // view общается с пользвателем
            
            if (primer[0].equals("q") || primer[1].equals("q") || primer[2].equals("q"))
                run = false;

            if (run) {
                if (calc.checkOperation(primer))  // Controller изменяет состоянии модели в соответствии с вводом пользователя если ввод корректен
                    view.PrintResult(calc.getResult()); // view выводит пользвателю результат
                else
                    view.PrintError("Ошибка ввода"); // view выводит ошибку
            }
        }
    }
}
