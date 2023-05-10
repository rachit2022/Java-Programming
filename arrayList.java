import java.util.*;

public class arrayList {
    public static void main(String args[]) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(99);
        l2.add(98);
        l2.add(97);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.addAll(0, l2);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println("\n" + l1.contains(5));
    }
}
