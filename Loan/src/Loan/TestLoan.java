package Loan;
import java.util.ArrayList;
import java.util.Date;

public class TestLoan {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan(5.5, 3, 25000));   
        list.add(new Date());                 
        list.add("Java Programlama Dili");   
        list.add(new Circle(4.5));            

        System.out.println("--- Listedeki Nesneler ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
