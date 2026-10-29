package ArrayLİst;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLİst {
	public static Integer max (ArrayList<Integer> list) {
		if(list == null || list.isEmpty()) {
			return null;
		} 
		
		int maxVal = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			int current = list.get(i);
			if (current > maxVal) {
				maxVal = current;
			}
		}
		
		return maxVal;
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Tam sayılar giriniz (girişi sonlandırmak için 0 girin):");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        Integer maximum = max(numbers);

        if (maximum == null) {
            System.out.println("Hiçbir sayı girilmedi (veya liste boş).");
        } else {
            System.out.println("Girilen sayılar arasındaki en büyük değer: " + maximum);
        }

        scanner.close();
    }

}
