package Chapter9_ObjectsAndClasses.exercise;

public class StockE9_2 {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    StockE9_2(String newSymbol, String newName) {
            symbol = newSymbol;
            name = newName;

    }

    double getChangePercent() {

        return ((currentPrice - previousClosingPrice) /
                    previousClosingPrice) * 100;

    }

}
