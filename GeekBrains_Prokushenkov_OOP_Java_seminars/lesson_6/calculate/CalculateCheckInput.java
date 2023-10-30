import java.util.Set;

public class CalculateCheckInput {
    public Boolean checkOperation(String[] data, Set operationSet) { // Проверка корректности ввода
        Double secondOperand;
        if (!operationSet.contains(data[1]))
           return false;
        try {
            Double.parseDouble(data[0]);
            secondOperand = Double.parseDouble(data[2]);
        }
        catch (Exception err){
            return false;
        }
        if (secondOperand == 0 && data[1].equals("/"))
            return false;
        return true;
    }
}
