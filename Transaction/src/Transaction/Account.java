package Transaction;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account() {
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    // Yeni eklenen constructor
    public Account(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Para Çekme"));
        } else {
            System.out.println("Yetersiz bakiye! İşlem gerçekleştirilemedi.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction('D', amount, balance, "Para Yatırma"));
        }
    }
}
