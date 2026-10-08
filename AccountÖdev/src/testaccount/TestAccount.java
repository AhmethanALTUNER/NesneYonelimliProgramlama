
package testaccount;

import account.Account;
    
public class TestAccount {
    public static void main(String[] args) {        
       
        Account account = new Account(1122, 20000.0);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
       
        System.out.println("--- Hesap Ozeti ---");
        System.out.println("Hesap ID          : " + account.getId());
        System.out.println("Guncel Bakiye     : " + account.getBalance() + " $");
        System.out.println("Aylik Faiz Tutari : " + account.getMonthlyInterest() + " $");
        System.out.println("Acilis Tarihi     : " + account.getDateCreated());
    }
}
