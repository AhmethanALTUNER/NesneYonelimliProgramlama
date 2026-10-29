package Account;

public class Checking extends Account {
    private double overdraftLimit;

    public Checking() {
        super();
        this.overdraftLimit = 500.0; 
    }

    public Checking(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Checking #" + getİd() + 
                               ": Eksi bakiye limiti aşıldı! (Limit: " + overdraftLimit + " TL)");
        }
    }

    @Override
    public String toString() {
        return "Hesap Türü : Vadesiz Hesap (Checking)\n" +
               "Hesap No   : " + getİd() + "\n" +
               "Bakiye     : " + String.format("%.2f TL", getBalance()) + "\n" +
               "Eksi Limit : " + String.format("%.2f TL", overdraftLimit) + "\n" +
               "Açılış     : " + getDateCreated();
    }
}
