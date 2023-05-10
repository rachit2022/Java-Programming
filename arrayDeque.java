import java.util.*;

public class arrayDeque {
    public static void main(String args[]) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();
        a1.add(50);
        a1.add(40);
        a1.add(30);
        a1.add(20);
        a1.add(10);
        System.out.print(a1.getLast() + " ");
        for (int i = 0; i < a1.size(); i++) {
        }
    }
}
