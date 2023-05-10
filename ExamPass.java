import java.util.Scanner;

public class ExamPass {
    public static void main(String args[]) {
        int sub1, sub2, sub3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject 1 marks: ");
        sub1 = sc.nextInt();
        System.out.print("Enter subject 2 marks: ");
        sub2 = sc.nextInt();
        System.out.print("Enter subject 3 marks: ");
        sub3 = sc.nextInt();
        int total = (sub1 + sub2 + sub3) / 3;
        System.out.println("Total is: " + total);
        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && total >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}
