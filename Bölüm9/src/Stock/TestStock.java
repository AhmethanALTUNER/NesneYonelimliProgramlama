
package Stock;


public class TestStock {


    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        
        System.out.println("Hisse Sembolu : " + stock.symbol);
        System.out.println("Sirket Adi    : " + stock.name);
        System.out.println("Onceki Kapanis: " + stock.previousClosingPrice);
        System.out.println("Guncel Fiyat  : " + stock.currentPrice);
        System.out.printf("Degisim Orani : %%%.2f%n", stock.getChangePercent());
    }
    
}
