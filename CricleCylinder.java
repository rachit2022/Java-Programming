import java.util.Scanner;

class Circle {
    float radius;
    float area;
    Scanner sc = new Scanner(System.in);

    public void setData() {
        System.out.print("Enter radius: ");
        radius = sc.nextFloat();
    }

    public float getData() {
        area = 3.14f * radius * radius;
        return area;
    }
}

class Cylinder extends Circle {
    float height;
    float area1;

    public void setData1() {
        System.out.print("Enter height: ");
        height = sc.nextFloat();
    }

    public float getData1() {
        area1 = 2f * 3.14f * radius * height;
        return area1;
    }
}

public class CricleCylinder {
    public static void main(String args[]) {
        Cylinder c = new Cylinder();
        c.setData();
        System.out.println("Area of circle is: " + c.getData());
        c.setData1();
        System.out.println("Area of cylinder is: " + c.getData1());

    }

}
