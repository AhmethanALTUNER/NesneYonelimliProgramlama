
package Stock;

public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
    
    public Stock(String symbol1,String name1){
        symbol = symbol1;
        name = name1;
    }
    
    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
    
}
