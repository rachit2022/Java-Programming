import java.util.Scanner;

public class floatArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: " + i + ": ");
            arr[i] = sc.nextFloat();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
