class rectangle {
    int length, breath;

    public rectangle(int l, int b) {
        length = l;
        breath = b;
    }
}

public class rectConstructors {
    public static void main(String args[]) {
        rectangle r = new rectangle(10, 20);
        int area = r.length * r.breath;
        System.out.println("Area of rectangle is: " + area);
    }

}
