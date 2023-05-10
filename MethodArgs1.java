public class MethodArgs1 {
    float add(float a, float b) {
        return (a + b);
    }

    String add(String a, String b) {
        return (a + b);
    }

    public static void main(String args[]) {
        MethodArgs1 m = new MethodArgs1();
        System.out.println("Sum of float argument is: " + m.add(4.0f, 5.0f));
        System.out.println("Sum of string argument is: " + m.add("Hello", " World"));
    }
}
