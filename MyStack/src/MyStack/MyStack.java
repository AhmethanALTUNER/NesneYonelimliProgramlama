package MyStack;
import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "Yığın (MyStack): " + super.toString();
    }
}
