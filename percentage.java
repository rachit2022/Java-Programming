import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for subject 1");
        float m1 = sc.nextInt();
        System.out.println("Enter marks for subject 2");
        float m2 = sc.nextInt();
        System.out.println("Enter marks for subject 3");
        float m3 = sc.nextInt();
        System.out.println("Enter marks for subject 4");
        float m4 = sc.nextInt();
        System.out.println("Enter marks for subject 5");
        float m5 = sc.nextInt();
        float total = (m1 + m2 + m3 + m4 + m5);
        System.out.print("percentage is: ");
        float percentage = (total / 500) * 100;
        System.out.println(percentage);
    }

}
