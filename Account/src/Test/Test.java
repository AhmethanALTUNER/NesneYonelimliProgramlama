package Test;
import Account.Account;
import Account.Checking; 
import Account.Savings;
public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000.0);
        account.setAnnualInterestRate(4.5);

        Checking checking = new Checking(1001, 5000.0, 1500.0);
        Savings savings = new Savings(2001, 7500.0);
        savings.setAnnualInterestRate(8.0);

        account.withdraw(2500.0);
        account.deposit(3000.0);

        checking.withdraw(6000.0); 
        checking.withdraw(1000.0); 

        savings.withdraw(8000.0);  
        savings.withdraw(3000.0);  

        System.out.println("=========================================");
        System.out.println(account.toString());
        System.out.println("-----------------------------------------");
        System.out.println(checking.toString());
        System.out.println("-----------------------------------------");
        System.out.println(savings.toString());
        System.out.println("=========================================");
    }
}
