import java.util.HashMap;
import java.util.Set;

public class CalculateOperation {

    private HashMap<String, I_Operation> CatalogOperation;

    public CalculateOperation(I_CatalogOperation newCatalog) {
        CatalogOperation = newCatalog.getCatalogOperation();
    }

    public I_Operation getOperation(String operName) {
        return CatalogOperation.get(operName);
    }

    public Set getOperationSet() {
        return CatalogOperation.keySet();
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
