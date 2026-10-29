package Loan;
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Loan [Faiz Oranı: %" + annualInterestRate + 
               ", Yıl: " + numberOfYears + 
               ", Kredi Tutarı: " + loanAmount + " TL]";
    }
}