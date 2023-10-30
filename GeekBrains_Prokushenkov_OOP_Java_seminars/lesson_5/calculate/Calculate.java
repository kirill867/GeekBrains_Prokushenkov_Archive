package lesson_5.calculate;

import java.util.HashMap;

public class Calculate {  // Model

    @FunctionalInterface
    public interface Operation {
        public Double doIt(Double a, Double b);
    }

    private Double firstOperand;
    private Double secondOperand;
    private Operation currentOperation;
    private HashMap<String, Operation> CatalogOperation = new HashMap<String, Operation>(); {
        // Если нужно изменить количество или состав операций, то это делается здесь
        CatalogOperation.put("+", (a, b) -> a + b);
        CatalogOperation.put("-", (a, b) -> a - b);
        CatalogOperation.put("*", (a, b) -> a * b);
        CatalogOperation.put("/", (a, b) -> a / b);
    }

    public Boolean checkOperation(String[] data) { // Проверка корректности ввода
        Boolean result = true;
        if (!CatalogOperation.containsKey(data[1]))
            result = false;
        try {
            firstOperand = Double.parseDouble(data[0]);
            secondOperand = Double.parseDouble(data[2]);
        }
        catch (Exception err){
            result = false;
        }
        if (result && secondOperand == 0 && data[1].equals("/"))
            result = false;
        if (result)
            currentOperation = CatalogOperation.get(data[1]);
        return result;
    }

    public Double getResult() {
        return currentOperation.doIt(firstOperand, secondOperand);
    }

    public String getAvalibleOperation() { // Получить список доступных действий
        StringBuilder result = new StringBuilder();
        result.append("(");
        Boolean newAppend = true;
        for (var key : CatalogOperation.keySet()) {
            if (newAppend) {
                result.append(key);
                newAppend = false;
            }
            else {
                result.append(", ");
                result.append(key);
            }
        }
        result.append(")");
        return result.toString();
    }

}
