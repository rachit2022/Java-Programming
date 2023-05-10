import java.util.Scanner;

public class Calculator {
    static void calc(int x, int y) {
        int choice, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n1.ADD\n2.SUBTRACT\n3.MULTIPLY\n4.DIVISION");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                z = x + y;
                System.out.println("Addtion of number is: " + z);
                break;
            case 2:
                z = x - y;
                System.out.println("Subtraction of number is: " + z);
                break;
            case 3:
                z = x * y;
                System.out.println("Multiplication of number is: " + z);
                break;
            case 4:
                z = x / y;
                System.out.println("Division of number is: " + z);
                break;
            default:
                System.out.println("Invalid input");
        }

    }

    public static void main(String args[]) {
        calc(6, 2);
    }

}
