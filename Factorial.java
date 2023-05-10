import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        int fact = 1;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of given number is: " + fact);
    }

}
