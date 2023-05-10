public class MethodArgs {
    int add(int a) {
        return (a + a);
    }

    int add(int a, int b) {
        return (a + b);
    }

    int add(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String args[]) {
        MethodArgs m = new MethodArgs();
        System.out.println("Sum of one argument is: " + m.add(5));
        System.out.println("Sum of two argument is: " + m.add(5, 6));
        System.out.println("Sum of three argument is: " + m.add(5, 6, 10));
    }

}
