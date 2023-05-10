import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter element " + i + ": ");
            marks[i] = sc.nextInt();
        }
        System.out.println(marks[0]);
    }

}
