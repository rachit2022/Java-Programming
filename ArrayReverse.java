import java.util.Scanner;

public class ArrayReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter element " + i + ": ");
            marks[i] = sc.nextInt();
        }
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println("Element " + i + ": " + marks[i]);
        }
    }

}
