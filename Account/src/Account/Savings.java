package Account;

public class Savings extends Account {

    public Savings() {
        super();
    }

    public Savings(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Savings #" + getİd() + 
                               ": Yetersiz bakiye! Eksi bakiyeye izin verilmez.");
        }
    }

    @Override
    public String toString() {
        return "Hesap Türü : Tasarruf Hesabı (Savings)\n" +
               "Hesap No   : " + getİd() + "\n" +
               "Bakiye     : " + String.format("%.2f TL", getBalance()) + "\n" +
               "Yıllık Faiz: %" + getAnnualInterestRate() + "\n" +
               "Açılış     : " + getDateCreated();
    }
}