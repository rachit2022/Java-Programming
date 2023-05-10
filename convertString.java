import java.util.Scanner;

public class convertString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s = sc.nextLine();
        System.out.println("string in lowercase is: " + (s.toLowerCase()));
    }
}
