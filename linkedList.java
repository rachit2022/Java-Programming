import java.util.*;

public class linkedList {
    public static void main(String args[]) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(50);
        l1.add(40);
        l1.add(30);
        l1.add(20);
        l1.add(10);
        l1.addLast(70);
        l1.addFirst(90);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
    }
}
