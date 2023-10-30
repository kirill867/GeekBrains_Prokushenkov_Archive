public class CaculateExecuter {
    public double GetResult(String[] data, CalculateOperation calculater) {
        Double firstOperand = Double.parseDouble(data[0]);
        Double secondOperand = Double.parseDouble(data[2]);
        return calculater.getOperation(data[1]).doIt(firstOperand, secondOperand);
    }
}

