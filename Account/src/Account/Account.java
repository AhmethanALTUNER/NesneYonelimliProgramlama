package Account;
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated;
	
	public Account() {
		this.dateCreated = new Date();
	} 
	
	public Account(int id, double balance){
		this();
		this.id = id;
		this.balance = balance;
	}
	
	public int getİd() {
		return id;
	}
	
	public void setİd(int id) {
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
    
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Hesap #" + id + ": Yetersiz bakiye. İşlem gerçekleştirilemedi.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    @Override
    public String toString() {
        return "Hesap Türü: Standart Hesap (Account)\n" +
               "Hesap No   : " + id + "\n" +
               "Bakiye     : " + String.format("%.2f TL", balance) + "\n" +
               "Yıllık Faiz: %" + annualInterestRate + "\n" +
               "Açılış     : " + dateCreated;
    }
	

}

