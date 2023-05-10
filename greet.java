import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day");
    }
}
