import java.util.Scanner;

public class Errors {
    public static void main(String args[]) {
        int a, b = 1000;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int c;
        try {
            c = b / a;
            System.out.println("The value of c is: " + c);
        } catch (Exception e) {
            System.out.println("Exception by zero occured");
            System.out.println(e);
        }
        System.out.println("End of the code");
    }
}