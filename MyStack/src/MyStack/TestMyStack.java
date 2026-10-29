package MyStack;
import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.println("Lütfen beş adet metin (string) giriniz:");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". metin: ");
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("\nGirilen metinler ters sırada (LIFO - Last In First Out):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
