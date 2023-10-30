import java.util.HashMap;

public class CatalogOperation implements I_CatalogOperation{

    @Override
    public HashMap<String, I_Operation> getCatalogOperation() {
        HashMap<String, I_Operation> CatalogOperation = new HashMap<String, I_Operation>(); {
            // Если нужно изменить количество или состав операций, то это делается здесь
            CatalogOperation.put("+", (a, b) -> a + b);
            CatalogOperation.put("-", (a, b) -> a - b);
            CatalogOperation.put("*", (a, b) -> a * b);
            CatalogOperation.put("**", (a, b) -> Math.pow(a, b));
        }
    return CatalogOperation;
    }
    
}