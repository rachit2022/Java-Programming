import java.util.Scanner;

public class FuncTable {
    static void table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "X" + i + "=" + (a * i));
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        table(n);
    }

}
