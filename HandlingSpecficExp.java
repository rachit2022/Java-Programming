import java.util.Scanner;

public class HandlingSpecficExp {
    public static void main(String args[]) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the element of the array you have to divide: ");
        int index = sc.nextInt();
        System.out.print("Enter the number from which you have to divide: ");
        int num = sc.nextInt();
        try {
            System.out.println("The value at index: " + arr[index]);
            System.out.println("The value after dividing: " + arr[index] / num);
        } catch (ArithmeticException e) {
            System.out.println("Exception by zero occured");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of index bound error occured");
            System.out.println(e);
        }
    }

}
