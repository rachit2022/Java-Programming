import java.util.Scanner;

public class IncomeTax {
    public static void main(String args[]) {
        float income, tax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        income = sc.nextInt();
        if (income >= 250000 && income < 500000) {
            tax = income * 0.05f;
            System.out.println("Tax paid is: " + tax);
        } else if (income >= 500000 && income < 2000000) {
            tax = income * 0.2f;
            System.out.println("Tax paid is: " + tax);
        } else {
            tax = income * 0.3f;
            System.out.println("Tax paid is: " + tax);
        }
    }

}
