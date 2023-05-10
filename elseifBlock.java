import java.util.Scanner;

public class elseifBlock {
    public static void main(String agrs[]) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        num = sc.nextInt();
        if (num >= 0 && num <= 10) {
            System.out.println("Number is less than 10 " + num);
        } else if (num > 10 && num <= 20) {
            System.out.println("Number is less than 20 " + num);
        } else {
            System.out.println("Number is greater than 20 " + num);
        }

    }
}
