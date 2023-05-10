import java.util.Scanner;

public class SearchElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: " + i + ": ");
            arr[i] = sc.nextFloat();
        }
        float element = sc.nextFloat();
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                System.out.println("Element found at index: " + i );
                break;
            }
        }
    }

}
