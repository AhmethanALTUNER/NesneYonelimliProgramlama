package ShuffleArrayList;
import java.util.ArrayList;

public class ShuffleArrayList {

    public static void shuffle(ArrayList<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());

            int temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Orijinal Liste : " + numbers);

        shuffle(numbers);

        System.out.println("Karışık Liste  : " + numbers);
    }
}
