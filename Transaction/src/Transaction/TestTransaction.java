package Transaction;
import java.util.ArrayList;

public class TestTransaction {
    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000.0);
        account.setAnnualInterestRate(1.5);

        account.deposit(30.0);
        account.deposit(40.0);
        account.deposit(50.0);

        account.withdraw(5.0);
        account.withdraw(4.0);
        account.withdraw(2.0);

        System.out.println("==============================================================");
        System.out.println("                      HESAP ÖZETİ                            ");
        System.out.println("==============================================================");
        System.out.println("Hesap Sahibi : " + account.getName());
        System.out.println("Hesap No     : " + account.getId());
        System.out.println("Faiz Oranı   : %" + account.getAnnualInterestRate());
        System.out.printf("Güncel Bakiye: $%.2f%n", account.getBalance());
        System.out.println("--------------------------------------------------------------");
        System.out.println("                      İŞLEM GEÇMİŞİ                          ");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-28s %-6s %-10s %-12s%n", "Tarih", "Tür", "Miktar", "Kalan Bakiye");
        System.out.println("--------------------------------------------------------------");

        ArrayList<Transaction> list = account.getTransactions();
        for (Transaction t : list) {
            String typeStr = (t.getType() == 'D') ? "Yatırma" : "Çekme";
            System.out.printf("%-28s %-6s $%-9.2f $%-11.2f%n", 
                              t.getDate().toString(), 
                              typeStr, 
                              t.getAmount(), 
                              t.getBalance());
        }
        System.out.println("==============================================================");
    }
}
