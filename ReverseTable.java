import java.util.Scanner;

public class ReverseTable {
    public static void main(String args[]) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }

}
