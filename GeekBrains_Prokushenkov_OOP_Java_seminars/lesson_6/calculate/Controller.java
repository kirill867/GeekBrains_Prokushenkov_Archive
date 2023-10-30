public class Controller { //Presenter - меняет модель по запросу пользователя
    private Welcome view;  // Эта часть работает с пользователем (view)
    private CalculateOperation calcOperation;
    private CalculateCheckInput inputChecker;
    private CaculateExecuter calcExecuter;

    public Controller() {
        view = new Welcome();
        calcOperation = new CalculateOperation(new CatalogOperation());
        inputChecker = new CalculateCheckInput();
        calcExecuter = new CaculateExecuter();
    }

    public void AppStart() {
        String[] primer;

        Boolean run = true;
        while (run) {
            primer = view.UserDialog(calcOperation.getAvalibleOperation()); // view общается с пользвателем
            
            if (primer[0].equals("q") || primer[1].equals("q") || primer[2].equals("q"))
                run = false;

            if (run) {
                if (inputChecker.checkOperation(primer, calcOperation.getOperationSet()))
                   view.PrintResult(calcExecuter.GetResult(primer, calcOperation));
                else
                    view.PrintError("Ошибка ввода"); // view выводит ошибку
            }
        }
    }
}