import java.util.Scanner;

public class kmTOm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        float km = sc.nextFloat();
        float m = km * 1000;
        System.out.print("Distance in meter is: " + m);
    }
}
